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
    public void testLetterConversionForZeroToNine(){
        String expected1= "DG,DH,DI,EG,EH,EI,FG,FH,FI";
        String expected2= "A,B,C";
        String output1 = zeroToNineService.getLetterConversion(new Integer[]{3,4});
        String output2 = zeroToNineService.getLetterConversion(new Integer[]{2});

        Assert.assertEquals(expected1,output1);
        Assert.assertEquals(expected2,output2);

    }

    /**
     * test input 0-99
     */
    @Test
    public void testLetterConversionForZeroToNinety(){
        String expected1= "AG,AH,AI,AJ,AK,AL,BG,BH,BI,BJ,BK,BL,CG,CH,CI,CJ,CK,CL,DG,DH,DI,DJ,DK,DL,EG,EH,EI,EJ,EK,EL,FG,FH,FI,FJ,FK,FL";
        String expected2= "A,B,C,D,E,F";
        String output1 = zeroToNinetyService.getLetterConversion(new Integer[]{23,45});
        String output2 = zeroToNinetyService.getLetterConversion(new Integer[]{23});

        Assert.assertEquals(expected1,output1);
        Assert.assertEquals(expected2,output2);
    }

    /**
     * Test for existence
     */
    @Test
    public void testExistOfLetterConversion(){
        try {
            String output11 = zeroToNineService.getLetterConversion(new Integer[]{});
        }catch (LetterConversionException e){
            e.printStackTrace();
        }
        try {
            String output12 = zeroToNineService.getLetterConversion(null);
        }catch (LetterConversionException e){
            e.printStackTrace();
        }
        try {
            String output13 = zeroToNineService.getLetterConversion(new Integer[]{null,3});
        }catch (LetterConversionException e){
            e.printStackTrace();
        }
        try {
            String output14 = zeroToNineService.getLetterConversion(new Integer[]{3,null});
        }catch (LetterConversionException e){
            e.printStackTrace();
        }
        try {
            String output21 = zeroToNinetyService.getLetterConversion(new Integer[]{});
        }catch (LetterConversionException e){
            e.printStackTrace();
        }
        try {
            String output22 = zeroToNinetyService.getLetterConversion(null);
        }catch (LetterConversionException e){
            e.printStackTrace();
        }
        try {
            String output23 = zeroToNinetyService.getLetterConversion(new Integer[]{null,23});
        }catch (LetterConversionException e){
            e.printStackTrace();
        }
        try {
            String output24 = zeroToNinetyService.getLetterConversion(new Integer[]{23,null});
        }catch (LetterConversionException e){
            e.printStackTrace();
        }
    }


    /**
     * Test parameter out of range
     */
    @Test
    public void testRangeOfLetterConversion(){
        try {
            String output11 = zeroToNineService.getLetterConversion(new Integer[]{0,1});
        }catch (LetterConversionException e){
            e.printStackTrace();
        }
        try {
            String output12 = zeroToNineService.getLetterConversion(new Integer[]{9,11});
        }catch (LetterConversionException e){
            e.printStackTrace();
        }
        try {
            String output13 = zeroToNineService.getLetterConversion(new Integer[]{-1,3});
        }catch (LetterConversionException e){
            e.printStackTrace();
        }
        try {
            String output21 = zeroToNinetyService.getLetterConversion(new Integer[]{10,31});
        }catch (LetterConversionException e){
            e.printStackTrace();
        }
        try {
            String output22 = zeroToNinetyService.getLetterConversion(new Integer[]{23,123});
        }catch (LetterConversionException e){
            e.printStackTrace();
        }
        try {
            String output23 = zeroToNinetyService.getLetterConversion(new Integer[]{-1,23});
        }catch (LetterConversionException e){
            e.printStackTrace();
        }
    }

}
