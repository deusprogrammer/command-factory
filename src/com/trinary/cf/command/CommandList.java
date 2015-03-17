package com.trinary.cf.command;

import java.util.ArrayList;
import java.util.List;

public class CommandList extends ArrayList<Command> {
	private static final long serialVersionUID = 1L;

	public List<CommandResult> execute() {
		List<CommandResult> results = new ArrayList<CommandResult>();
		
		for (Command command : this) {
			results.add(command.execute());
		}
		
		return results;
	}
}