package org.example.exception;

public enum ExceptionCodeMessage {
    EXCEPTION_NULL(4001, "The parameter value cannot be null"),
    EXCEPTION_OUT_FOR9(4002, "The parameter value must be between 0 and 9"),
    EXCEPTION_OUT_FOR99(4003, "The parameter value must be between 0 and 99");

    private Integer code;
    private String message;

    ExceptionCodeMessage(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }


}
