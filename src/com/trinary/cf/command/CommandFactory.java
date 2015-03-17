package com.trinary.cf.command;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import com.trinary.cf.test.Template;

public class CommandFactory {
	protected static Map<String, String> commandMapping = new HashMap<String, String>();
	protected static Map<String, String[]> procedures = new HashMap<String, String[]>();
	
	static {
		initialize();
	}
	
	protected static void initialize() {
		System.out.println("INITIALIZING COMMAND FACTORY");
		Properties commandMapProps = new Properties();
		Properties procedureProps  = new Properties();
		try {
			InputStream is = new FileInputStream("commandMapping.properties");
			commandMapProps.load(is);
			is = new FileInputStream("procedure.properties");
			procedureProps.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (Entry<Object, Object> entry : commandMapProps.entrySet()) {
			commandMapping.put((String)entry.getKey(), (String)entry.getValue());
		}
		
		for (Entry<Object, Object> entry : procedureProps.entrySet()) {
			String[] commands = ((String)entry.getValue()).split(",");
			procedures.put((String)entry.getKey(), commands);
		}
	}
	
	public static CommandList buildCommandList(Template template) throws Exception {
		if (procedures.get(template.getFormCode()) == null) {
			throw new Exception("No formcode found for " + template.getFormCode());
		}
		
		CommandList commands = new CommandList();
		
		String[] procedureList = procedures.get(template.getFormCode());
		for (String procedure : procedureList) {
			String commandClass = commandMapping.get(procedure);
			if (commandClass == null) {
				throw new Exception("No mapping found for " + procedure);
			}
			
			Class<?> clazz = Class.forName(commandClass);
			Constructor<?> constructor = clazz.getConstructor(Template.class);
			Command command = (Command) constructor.newInstance(template);
			commands.add(command);
		}
		
		return commands;
	}
}
