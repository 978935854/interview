package org.example.utils;

public class DigitMappingUtil {


    /**
     * Number to letter correspondence
     * @param num
     * @return
     */
    public static String getMapping(char num){
        String mpStr=null;
        switch(num){
            case '0':
                mpStr="";
                break;
            case'1':
                mpStr="";
                break;
            case'2':
                mpStr="ABC";
                break;
            case'3':
                mpStr="DEF";
                break;
            case'4':
                mpStr="GHI";
                break;
            case'5':
                mpStr="JKL";
                break;
            case'6':
                mpStr="MNO";
                break;
            case'7':
                mpStr="PQRS";
                break;
            case'8':
                mpStr="TUV";
                break;
            case'9':
                mpStr="WXYZ";
                break;
        }
        return mpStr;
    }
}
