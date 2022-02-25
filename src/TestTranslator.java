import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestTranslator {

    @Test
    public void testAsterixToE() {

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
    public void testEToAsterix() {

        Translator translator = new Translator();

        String actual = translator.getMorseCode("E");

        assertEquals("*", actual);
    }

    @Test
    public void testUnvalidMorseCode() {

        Translator translator = new Translator();

        String actual = translator.getMorseCode("*****");

        assertNull(actual);
    }

    @Test
    public void testUnvalidEnglishLetter() {

        Translator translator = new Translator();

        String actual = translator.getMorseCode("Ö");

        assertNull(actual);
    }


}


