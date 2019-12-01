package com.yxe.application.exception;

public class BusinessException extends RuntimeException {
	
	private static final long serialVersionUID = -8934270972452357237L;
	
	private String message;
	
    public BusinessException(String message){  
        this.message = message;  
    }  
    
    public String getMessage() {  
        return message;  
    }  
    
    public void setMessage(String message) {  
        this.message = message;  
    }
}
