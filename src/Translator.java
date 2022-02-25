import java.util.HashMap;

public class Translator {

    private final HashMap<String, String> englishLetter;

    public Translator() {
        englishLetter = new HashMap<>();

        englishLetter.put("*", "E");
        englishLetter.put("-", "T");
    }

    public String getEnglishLetter (String s){
            return englishLetter.get(s);
    }


}
