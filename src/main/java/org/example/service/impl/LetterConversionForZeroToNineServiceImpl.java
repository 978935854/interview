package org.example.service.impl;

import com.sun.deploy.util.StringUtils;
import org.example.service.LetterConversionService;
import org.example.utils.ParamCheckUtil;

import java.util.*;

import static org.example.utils.DigitMappingUtil.getMapping;

public class LetterConversionForZeroToNineServiceImpl implements LetterConversionService {
    public String getLetterConversion(Integer[] inputNumArr) {
        ParamCheckUtil.checkInputZeroToNine(inputNumArr);
        List<String> ret=new ArrayList<String>();
        for(Integer splitDataNum : inputNumArr){
            String strSplitDataNum = splitDataNum+"";
            int length=ret.size();
            StringBuilder substring= new StringBuilder();
            Set<String> setSubString = new HashSet<String>();
            setSubString.add(getMapping(strSplitDataNum.charAt(0)));
            for (String s : setSubString) {
                substring.append(s);
            }
            if(length==0){
                for(int j=0;j<substring.length();j++){
                    ret.add(" "+substring.charAt(j));    //Add directly
                }
            }else{
                for(int p=0;p<length;p++){
                    for(int m=0;m<substring.length();m++){
                        ret.add(ret.get(p)+substring.charAt(m));  //Join other combinations except the first group
                    }
                    ret.set(p,(ret.get(p)+substring.charAt(0)));  //Overwrite previous
                }
            }
        }
        return StringUtils.join(new TreeSet<String>(ret),",").replace(" ","");
    }
}
