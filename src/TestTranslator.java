import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTranslator {

    @Test
    public void testAsteriskToE() {

        Translator translator = new Translator();

        String actual = translator.getEnglishLetter("*");

        Assertions.assertEquals("E", actual);
    }

    @Test
    public void testDashToT() {

        Translator translator = new Translator();

        String actual = translator.getEnglishLetter("-");

        Assertions.assertEquals("T", actual);
    }

    @Test
    public void testEToAsterisk() {

        Translator translator = new Translator();

        String actual = translator.getMorseCode("E");

        Assertions.assertEquals("*", actual);
    }

    @Test
    public void testInvalidMorseCode() {

        Translator translator = new Translator();

        String actual = translator.getEnglishLetter("******");

        Assertions.assertNull(actual);
    }

    @Test
    public void testInvalidEnglishLetter() {

        Translator translator = new Translator();

        String actual = translator.getMorseCode("Ö");

        Assertions.assertNull(actual);
    }


}


