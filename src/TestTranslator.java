import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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


}


