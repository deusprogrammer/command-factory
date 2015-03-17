package com.trinary.cf.command;

public class CommandResult {
	protected CommandResultStatus status;
	protected String statusMessage;
	protected Exception exception;
	
	public CommandResult(CommandResultStatus status, String statusMessage) {
		super();
		this.status = status;
		this.statusMessage = statusMessage;
	}

	/**
	 * @return the status
	 */
	public CommandResultStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(CommandResultStatus status) {
		this.status = status;
	}

	/**
	 * @return the statusMessage
	 */
	public String getStatusMessage() {
		return statusMessage;
	}

	/**
	 * @param statusMessage the statusMessage to set
	 */
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	/**
	 * @return the e
	 */
	public Exception getException() {
		return exception;
	}

	/**
	 * @param e the e to set
	 */
	public void setException(Exception exception) {
		this.exception = exception;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommandResult [status=" + status + ", statusMessage="
				+ statusMessage + ", exception=" + exception + "]";
	}
}