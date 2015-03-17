package com.trinary.cf.command;

import com.trinary.cf.test.AuditItem;
import com.trinary.cf.test.Template;

public class CreateWorkItemACommand extends Command {
	public CreateWorkItemACommand(Template template) {
		super(template);
	}

	@Override
	public CommandResult execute() {
		System.out.printf("Creating Work Item A for formcode: %s and guid: %s\n", template.getFormCode(), template.getGuid());
		template.addAuditItem(new AuditItem("WorkItemA Created"));
		return new CommandResult(CommandResultStatus.SUCCESS, "Work Item A successfully created");
	}
}