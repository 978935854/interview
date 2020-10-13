package org.example.exception;

public class LetterConversionException extends RuntimeException{

    private int code;
    private String message;

    public LetterConversionException(){
        super();
    }

    public LetterConversionException(String message){
        super(message);
        this.message = message;
    }

    public LetterConversionException(int code, String message){
        super(message);
        this.code=code;
        this.message=message;
    }

    public LetterConversionException(ExceptionCodeMessage exceptionCodeMessage){
        super(exceptionCodeMessage.getMessage());
        this.code=exceptionCodeMessage.getCode();
        this.message=exceptionCodeMessage.getMessage();
    }

}
