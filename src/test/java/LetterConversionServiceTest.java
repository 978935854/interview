import org.example.service.LetterConversionService;
import org.example.service.impl.LetterConversionForZeroToNineServiceImpl;
import org.example.service.impl.LetterConversionForZeroToNinetyServiceImpl;
import org.junit.Test;

import java.util.Collections;

public class LetterConversionServiceTest {

    /**
     * 0-9
     */
    @Test
    public void testLetterConversionForZeroToNine(){
        Integer[] arrInput = {3,4};
        LetterConversionService letterConversionService = new LetterConversionForZeroToNineServiceImpl();
        System.out.println("output: "+letterConversionService.getLetterCombinations(arrInput));
    }

    /**
     * 0-99
     */
    @Test
    public void testLetterConversionForZeroToNinety(){
        Integer[] arrInput = {23,45};
        LetterConversionService letterConversionService = new LetterConversionForZeroToNinetyServiceImpl();
        System.out.println("output: "+letterConversionService.getLetterCombinations(arrInput));
    }
}
