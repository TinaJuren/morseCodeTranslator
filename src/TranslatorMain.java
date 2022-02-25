import java.util.Scanner;

public class TranslatorMain {
    public static void main(String[] args) {

        Translator translator = new Translator();

        Scanner sc = new Scanner(System.in);

        System.out.println("Type your message here. Use English letters (a-z) or Morse code (* and/or -). Please, separate letters by spaces and words by / or when writing Morse Code. Example: 'My name is Tina' is in Morse Code. Your input: ");
        String addedSentence = sc.nextLine();
        addedSentence = addedSentence.toUpperCase();

        if ((addedSentence.contains("*") || addedSentence.contains("-") && addedSentence.contains(" "))) {
            translator.getEnglishLetters(addedSentence);
        } else if ((addedSentence.contains("*") || addedSentence.contains("-")) && !addedSentence.contains(" ")){
            System.out.println(translator.getEnglishLetter(addedSentence));
        } else if (!addedSentence.contains("*") || !addedSentence.contains("-")) {
            translator.getMorse(addedSentence);
        } else {
            System.out.println(translator.getMorseCode(addedSentence));
        }
    }
}