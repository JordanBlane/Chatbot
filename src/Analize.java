import java.util.Arrays;
import java.util.List;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.Random;

public class Analize {
    private String[] keywords = {"Keyword1", "Keyword2", "Keyword3", "Keyword4"};
    private String string;

    public Analize(String str) {
        string = str;

        analizeKeywords(string);
        analizeLength(string);
        analizeTime(string);
        analizeDate(string);
        hello(string);
        bye(string);
    }

    public static void hello(String str) {
        String[] greetings = {"hello", "howdy", "hi", "hey", "greetings"};
        for (int i = 0; i < greetings.length; i++) {
            if (str.matches("(?i).*\\b" + greetings[i] + "\\b.*")) {
                // picks from random array of greetings
                String[] greetingResponses = {"hello", "howdy", "hi", "hey", "greetings"};
                Random x = new Random();
                System.out.println("botname" + ": " + greetingResponses[x.nextInt(greetingResponses.length)]);
            }
        }
    }

    public static void bye(String str) {
        // responds to words in this array by saying bye
        String[] byeArr = {"bye", "goodbye", "cya", "later"};
        for (int i = 0; i < byeArr.length; i++) {
            if (str.matches("(?i).*\\b" + byeArr[i] + "\\b.*")) {
                String[] greetingResponses = {"bye", "goodbye", "cya", "later"};
                Random x = new Random();
                System.out.println("botname" + ": " + greetingResponses[x.nextInt(greetingResponses.length)]);
            }
        }
        // picks from random array of goodbyes
    }

    public void analizeLength(String str) {
        System.out.println(str.length());
    }

    public void analizeKeywords(String str) {
        String[] array = str.split(" ");
        System.out.println("Keywords{ ");
        for (int i = 0; i < keywords.length; i++) {
            if (Arrays.asList(array).contains(keywords[i])) {
                System.out.println(keywords[i]);
            }
        }
        System.out.println("}");
    }

    public void analizeTime(String str) {
        String[] array = str.split(" ");
        if (Arrays.asList(array).contains("time")) {
            LocalTime timeObj = LocalTime.now();
            System.out.println("The time is: " + timeObj);
        }
    }

    public void analizeDate(String str) {
        String[] array = str.split(" ");
        if (Arrays.asList(array).contains("date")) {
            LocalDate dateObj = LocalDate.now();
            System.out.println("The date is: " + dateObj);
        }
    }
}