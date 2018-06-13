package me.leig.happenathomeserver.comm;

/**
 * 
 *
 * @author leig
 * @version 20180301
 *
 */

public class LogicException extends Exception {

	private static final long serialVersionUID = 3426531273264280998L;

	private String errorCode;
	
	private String errorMsg;
	
	private String errorObject;
	
	public LogicException() {
		
	}
	
	public LogicException(String errorCode, String errorMsg) {
		super(errorCode + errorMsg);
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	public LogicException(String errorCode, String errorMsg, String errorObject) {
		super(errorCode + errorMsg);
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.errorObject = errorObject;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorObject() {
		return errorObject;
	}

	public void setErrorObject(String errorObject) {
		this.errorObject = errorObject;
	}
	
}
