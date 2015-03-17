package com.trinary.cf.command;

import com.trinary.cf.test.Template;

public abstract class Command {
	protected Template template;
	
	public Command(Template template) {
		this.template = template;
	}
	
	public abstract CommandResult execute();
}