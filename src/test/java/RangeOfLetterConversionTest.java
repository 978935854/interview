import org.example.exception.LetterConversionException;
import org.example.service.LetterConversionService;
import org.example.service.impl.LetterConversionForZeroToNineServiceImpl;
import org.example.service.impl.LetterConversionForZeroToNinetyServiceImpl;
import org.junit.Test;

public class RangeOfLetterConversionTest {


    LetterConversionService zeroToNineService = new LetterConversionForZeroToNineServiceImpl();
    LetterConversionService zeroToNinetyService = new LetterConversionForZeroToNinetyServiceImpl();


    /**
     * Test parameter out of range
     */
    @Test(expected=LetterConversionException.class)
    public void testRangeOfLetterConversion(){
        String output11 = zeroToNineService.getLetterConversion(new Integer[]{0,1});
        String output12 = zeroToNineService.getLetterConversion(new Integer[]{9,11});
        String output13 = zeroToNineService.getLetterConversion(new Integer[]{-1,3});
        String output21 = zeroToNinetyService.getLetterConversion(new Integer[]{10,31});
        String output22 = zeroToNinetyService.getLetterConversion(new Integer[]{23,123});
        String output23 = zeroToNinetyService.getLetterConversion(new Integer[]{-1,23});
    }

}
