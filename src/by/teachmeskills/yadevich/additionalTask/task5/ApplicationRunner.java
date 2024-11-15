package by.teachmeskills.yadevich.additionalTask.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Task 5.
 Given two words (start and end) and a dictionary, find the length of the shortest
 sequence of transformations from start to end, in which only one letter can be changed at a time.
 And each intermediate word must exist in the dictionary.
 For example, given:
 start = "hit"
 end = "cog"
 dict = ["hot", "dot", "dog", "lot", "log"]
 One shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 the program should return a length of 5.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        String regex = "h.t|.it|hi.";
        String text = " hot , dot, dog, lot, log";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // не смогла решить

    }
}
