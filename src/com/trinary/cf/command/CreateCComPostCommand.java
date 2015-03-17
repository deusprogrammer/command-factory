package com.trinary.cf.command;

import com.trinary.cf.test.AuditItem;
import com.trinary.cf.test.Document;
import com.trinary.cf.test.Template;

public class CreateCComPostCommand extends Command {
	public CreateCComPostCommand(Template template) {
		super(template);
	}

	@Override
	public CommandResult execute() {
		System.out.printf("Submitting CCOM post for formcode: %s and guid: %s\n", template.getFormCode(), template.getGuid());
		template.addAuditItem(new AuditItem("CCOM post submitted"));
		for(Document document : template.getDocuments()) {
			template.addAuditItem(new AuditItem(String.format("Submitted CCOM post for document %s ", document.getId())));
		}
		return new CommandResult(CommandResultStatus.SUCCESS, "CCOM Post successfully submitted");
	}
}
