package org.example.utils;

import org.example.exception.ExceptionCodeMessage;
import org.example.exception.LetterConversionException;

public class ParamCheckUtil {

    /**
     * validate input 0~9
     * @param inputNumArr
     */
    public static void checkInputZeroToNine( Integer[] inputNumArr)throws LetterConversionException{
        if (inputNumArr == null || inputNumArr.length == 0) {
            throw new LetterConversionException(ExceptionCodeMessage.EXCEPTION_NULL);
        }
        for (Integer inputNum : inputNumArr) {
            if (inputNum==null){
                throw new LetterConversionException(ExceptionCodeMessage.EXCEPTION_NULL);
            }else if (inputNum > 9 || inputNum < 0){
                throw new LetterConversionException(ExceptionCodeMessage.EXCEPTION_OUT_FOR9);
            }
        }
    }

    /**
     * validate input 0~99
     * @param inputNumArr
     */
    public static void checkInputZeroToNinety( Integer[] inputNumArr)throws LetterConversionException{
        if (inputNumArr == null || inputNumArr.length == 0) {
            throw new LetterConversionException(ExceptionCodeMessage.EXCEPTION_NULL);
        }
        for (Integer inputNum : inputNumArr) {
            if (inputNum==null){
                throw new LetterConversionException(ExceptionCodeMessage.EXCEPTION_NULL);
            }else if (inputNum > 99 || inputNum < 0){
                throw new LetterConversionException(ExceptionCodeMessage.EXCEPTION_OUT_FOR99);
            }
        }
    }
}
