import java.util.HashMap;

import static java.lang.System.out;

public class Translator {

    private final HashMap<String, String> englishLetter;
    private final HashMap<String, String> morseCode;

    public Translator() {

        englishLetter = new HashMap<>();

        englishLetter.put("*-", "A");
        englishLetter.put("_***", "B");
        englishLetter.put("-*-*", "C");
        englishLetter.put("-**", "D");
        englishLetter.put("*", "E");
        englishLetter.put("**-*", "F");
        englishLetter.put("--*", "G");
        englishLetter.put("****", "H");
        englishLetter.put("**", "I");
        englishLetter.put("*---", "J");
        englishLetter.put("-*-", "K");
        englishLetter.put("*-**", "L");
        englishLetter.put("--", "M");
        englishLetter.put("-*", "N");
        englishLetter.put("---", "O");
        englishLetter.put("*--*", "P");
        englishLetter.put("--*-", "Q");
        englishLetter.put("*-*", "R");
        englishLetter.put("***", "S");
        englishLetter.put("-", "T");
        englishLetter.put("**-", "U");
        englishLetter.put("***-", "V");
        englishLetter.put("*--", "W");
        englishLetter.put("-**-", "X");
        englishLetter.put("-*--", "Y");
        englishLetter.put("--**", "Z");
        englishLetter.put("/", " ");
        englishLetter.put("*----", "1");
        englishLetter.put("**---", "2");
        englishLetter.put("***--", "3");
        englishLetter.put("****-", "4");
        englishLetter.put("*****", "5");
        englishLetter.put("-****", "6");
        englishLetter.put("--***", "7");
        englishLetter.put("---**", "8");
        englishLetter.put("----*", "9");
        englishLetter.put("-----", "0");
        englishLetter.put("*-*-*-", ".");
        englishLetter.put("--**--", ",");
        englishLetter.put("**--**", "?");

        morseCode = new HashMap<>();

        morseCode.put("A", "*-");
        morseCode.put("B", "_***");
        morseCode.put("C", "-*-*");
        morseCode.put("D", "-**");
        morseCode.put("E", "*");
        morseCode.put("F", "**-*");
        morseCode.put("G", "--*");
        morseCode.put("H", "****");
        morseCode.put("I", "**");
        morseCode.put("J", "*---");
        morseCode.put("K", "-*-");
        morseCode.put("L", "*-**");
        morseCode.put("M", "--");
        morseCode.put("N", "-*");
        morseCode.put("O", "---");
        morseCode.put("P", "*--*");
        morseCode.put("Q", "--*-");
        morseCode.put("R", "*-*");
        morseCode.put("S", "***");
        morseCode.put("T", "-");
        morseCode.put("U", "**-");
        morseCode.put("V", "***-");
        morseCode.put("W", "*--");
        morseCode.put("X", "-**-");
        morseCode.put("Y", "-*--");
        morseCode.put("Z", "--**");
        morseCode.put(" ", " ");
        morseCode.put("1", "*----");
        morseCode.put("2", "**---");
        morseCode.put("3", "***--");
        morseCode.put("4", "****-");
        morseCode.put("5", "*****");
        morseCode.put("6", "-****");
        morseCode.put("7", "--***");
        morseCode.put("8", "---**");
        morseCode.put("9", "----*");
        morseCode.put("0", "-----");
        morseCode.put(".", "*-*-*-");
        morseCode.put(",", "--**--");
        morseCode.put("?", "**--**");
    }

    public String getEnglishLetter (String s) {
        return englishLetter.get(s);
    }

    public void getEnglishLetters(String addedSentence) {
        for (String morse : addedSentence.split(" "))
            if (englishLetter.get(morse) == null) {
                out.print("(" + morse + " is not available in the translator)");
            } else {
                out.print(englishLetter.get(morse));
            }
    }

    public String getMorseCode(String e) {
        return morseCode.get(e);
    }

    public void getMorse(String addedSentence) {
        for (String letters : addedSentence.split(""))
            if (morseCode.get(letters) == null) {
                out.print("(" + letters + " is not available in the translator)");
            } else {
                out.print(morseCode.get(letters) + " ");
            }
    }

}