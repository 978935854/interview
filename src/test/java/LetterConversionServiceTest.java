import org.example.exception.ExceptionCodeMessage;
import org.example.exception.LetterConversionException;
import org.example.service.LetterConversionService;
import org.example.service.impl.LetterConversionForZeroToNineServiceImpl;
import org.example.service.impl.LetterConversionForZeroToNinetyServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class LetterConversionServiceTest {

    LetterConversionService zeroToNineService = new LetterConversionForZeroToNineServiceImpl();
    LetterConversionService zeroToNinetyService = new LetterConversionForZeroToNinetyServiceImpl();

    /**
     *  test input 0-9
     */
    @Test
    public void testLetterConversionForZeroToNineOne(){
        String expected1= "DG,DH,DI,EG,EH,EI,FG,FH,FI";
        String output1 = zeroToNineService.getLetterConversion(new Integer[]{3,4});
        Assert.assertEquals(expected1,output1);
    }

    /**
     *  test input 0-9
     */
    @Test
    public void testLetterConversionForZeroToNineTwo(){
        String expected2= "A,B,C";
        String output2 = zeroToNineService.getLetterConversion(new Integer[]{2});
        Assert.assertEquals(expected2,output2);
    }

    /**
     * test input 0-99
     */
    @Test
    public void testLetterConversionForZeroToNinetyOne(){
        String expected1= "AG,AH,AI,AJ,AK,AL,BG,BH,BI,BJ,BK,BL,CG,CH,CI,CJ,CK,CL,DG,DH,DI,DJ,DK,DL,EG,EH,EI,EJ,EK,EL,FG,FH,FI,FJ,FK,FL";
        String output1 = zeroToNinetyService.getLetterConversion(new Integer[]{23,45});
        Assert.assertEquals(expected1,output1);
    }

    /**
     * test input 0-99
     */
    @Test
    public void testLetterConversionForZeroToNinetyTwo(){
        String expected2= "A,B,C,D,E,F";
        String output2 = zeroToNinetyService.getLetterConversion(new Integer[]{23});
        Assert.assertEquals(expected2,output2);
    }


}
