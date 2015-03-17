package com.trinary.cf.command;

import com.trinary.cf.test.Template;

public class BreakComputerCommand extends Command {

	public BreakComputerCommand(Template template) {
		super(template);
	}

	@Override
	public CommandResult execute() {
		System.out.println("Your computer is now on fire.");
		CommandResult result = new CommandResult(CommandResultStatus.ERROR, "Your computer is now slag.");
		result.setException(new Exception("HOLY SHIT YOUR COMPUTER IS IN FLAMES!  HOPE YOU GOT A WARRANTY!"));
		return result;
	}
}