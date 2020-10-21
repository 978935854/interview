import org.example.exception.LetterConversionException;
import org.example.service.LetterConversionService;
import org.example.service.impl.LetterConversionForZeroToNineServiceImpl;
import org.example.service.impl.LetterConversionForZeroToNinetyServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class ExistOfLetterConversionTest {

    LetterConversionService zeroToNineService = new LetterConversionForZeroToNineServiceImpl();
    LetterConversionService zeroToNinetyService = new LetterConversionForZeroToNinetyServiceImpl();


    /**
     * Test for existence
     */
    @Test(expected=LetterConversionException.class)
    public void testExistOfLetterConversion(){
        String output11 = zeroToNineService.getLetterConversion(new Integer[]{});
        String output12 = zeroToNineService.getLetterConversion(null);
        String output13 = zeroToNineService.getLetterConversion(new Integer[]{null,3});
        String output14 = zeroToNineService.getLetterConversion(new Integer[]{3,null});
        String output21 = zeroToNinetyService.getLetterConversion(new Integer[]{});
        String output22 = zeroToNinetyService.getLetterConversion(null);
        String output23 = zeroToNinetyService.getLetterConversion(new Integer[]{null,23});
        String output24 = zeroToNinetyService.getLetterConversion(new Integer[]{23,null});
    }


}
