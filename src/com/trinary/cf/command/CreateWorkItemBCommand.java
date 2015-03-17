package com.trinary.cf.command;

import com.trinary.cf.test.AuditItem;
import com.trinary.cf.test.Template;

public class CreateWorkItemBCommand extends Command {
	public CreateWorkItemBCommand(Template template) {
		super(template);
	}

	@Override
	public CommandResult execute() {
		System.out.printf("Creating Work Item B for formcode: %s and guid: %s\n", template.getFormCode(), template.getGuid());
		template.addAuditItem(new AuditItem("WorkItemB Created"));
		template.addAuditItem(new AuditItem("Manager Alerted"));
		return new CommandResult(CommandResultStatus.SUCCESS, "Work Item B successfully created");
	}

}
