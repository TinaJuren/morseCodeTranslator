import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestTranslator {

    @Test
    public void testAsteriskToE() {

        Translator translator = new Translator();

        String actual = translator.getEnglishLetter("*");

        assertEquals("E", actual);
    }

    @Test
    public void testDashToT() {

        Translator translator = new Translator();

        String actual = translator.getEnglishLetter("-");

        assertEquals("T", actual);
    }

    @Test
    public void testEToAsterisk() {

        Translator translator = new Translator();

        String actual = translator.getMorseCode("E");

        assertEquals("*", actual);
    }

    @Test
    public void testInvalidMorseCode() {

        Translator translator = new Translator();

        String actual = translator.getMorseCode("*****");

        assertNull(actual);
    }

    @Test
    public void testInvalidEnglishLetter() {

        Translator translator = new Translator();

        String actual = translator.getMorseCode("Ö");

        assertNull(actual);
    }


}


