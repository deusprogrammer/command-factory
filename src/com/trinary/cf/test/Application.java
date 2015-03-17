package com.trinary.cf.test;

import com.trinary.cf.command.CommandFactory;
import com.trinary.cf.command.CommandList;

public class Application {
	public static void main(String[] args) {
		Template template = new Template("FORM_CODE_A", "1234567890");
		template.addDocument(new Document("CoverLetterA", "Cover Letter"));
		template.addDocument(new Document("CoverLetterB", "Your Rights as an Owner of a Cat"));
		template.addDocument(new Document("POA_Form", "Power of Attorney Form"));

		try {
			CommandList commands = CommandFactory.buildCommandList(template);
			commands.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		template = new Template("FORM_CODE_B", "1234567890");
		template.addDocument(new Document("CoverLetterA", "Cover Letter"));
		template.addDocument(new Document("CoverLetterB", "Your Rights as an Owner of a Cat"));
		template.addDocument(new Document("POA_Form", "Power of Attorney Form"));

		try {
			CommandList commands = CommandFactory.buildCommandList(template);
			commands.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		template = new Template("FORM_CODE_KLEZ", "1234567890");
		template.addDocument(new Document("CoverLetterA", "Cover Letter"));
		template.addDocument(new Document("CoverLetterB", "Your Rights as an Owner of a Cat"));
		template.addDocument(new Document("POA_Form", "Power of Attorney Form"));

		try {
			CommandList commands = CommandFactory.buildCommandList(template);
			commands.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		template = new Template("FORM_CODE_FART", "1234567890");
		template.addDocument(new Document("CoverLetterA", "Cover Letter"));
		template.addDocument(new Document("CoverLetterB", "Your Rights as an Owner of a Cat"));
		template.addDocument(new Document("POA_Form", "Power of Attorney Form"));

		try {
			CommandList commands = CommandFactory.buildCommandList(template);
			commands.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}