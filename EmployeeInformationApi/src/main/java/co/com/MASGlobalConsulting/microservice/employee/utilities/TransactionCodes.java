package co.com.MASGlobalConsulting.microservice.employee.utilities;

public enum TransactionCodes {
		
	INTERNAL_SERVER_ERROR("500", "INTERNAL_SERVER_ERROR"),
	USER_NOT_FOUND("001", "USER NOT FOUND");
	
	
	private String code;
	private String message;
	
	TransactionCodes(String code, String message) {
        this.code = code;
        this.message = message;
    }

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}	

}
