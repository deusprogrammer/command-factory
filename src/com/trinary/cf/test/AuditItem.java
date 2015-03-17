package com.trinary.cf.test;

import java.util.Date;

public class AuditItem {
	protected Date createdOn;
	protected Date completedOn;
	protected String operation;
	
	public AuditItem(String operation) {
		super();
		this.operation = operation;
		this.createdOn = new Date();
	}

	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return createdOn;
	}

	/**
	 * @return the completedOn
	 */
	public Date getCompletedOn() {
		return completedOn;
	}

	/**
	 * @param completedOn the completedOn to set
	 */
	public void complete() {
		this.completedOn = new Date();
	}

	/**
	 * @return the operation
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * @param operation the operation to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}
}
