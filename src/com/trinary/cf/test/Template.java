package com.trinary.cf.test;

import java.util.ArrayList;
import java.util.List;

public class Template {
	protected String formCode;
	protected String guid;
	protected List<AuditItem> auditTrail = new ArrayList<AuditItem>();
	protected List<Document> documents = new ArrayList<Document>();
	
	public Template(String formCode, String guid) {
		super();
		this.formCode = formCode;
		this.guid = guid;
	}

	/**
	 * @return the formCode
	 */
	public String getFormCode() {
		return formCode;
	}

	/**
	 * @param formCode the formCode to set
	 */
	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	/**
	 * @return the guid
	 */
	public String getGuid() {
		return guid;
	}

	/**
	 * @param guid the guid to set
	 */
	public void setGuid(String guid) {
		this.guid = guid;
	}

	/**
	 * @return the documents
	 */
	public List<Document> getDocuments() {
		return documents;
	}

	/**
	 * @param documents the documents to set
	 */
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	
	/**
	 * 
	 * @param document
	 */
	public void addDocument(Document document) {
		this.documents.add(document);
	}

	/**
	 * @return the auditTrail
	 */
	public List<AuditItem> getAuditTrail() {
		return auditTrail;
	}
	
	/**
	 * 
	 * @param auditItem
	 */
	public void addAuditItem(AuditItem auditItem) {
		this.auditTrail.add(auditItem);
	}
}