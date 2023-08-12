package day35lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda04 {

    public static void main(String[] args) throws IOException {

        readTextFile();
        System.out.println(checkSpecificWordExistInAllLines("Lambda"));
        System.out.println(getWordsInListDistinctly());
        System.out.println(getWordsLengthLessThanSpecificLength(6));

        System.out.println(getTheTotalNumOfLetters());

    }

    //Example 1: Go to LambdaTextFile and print the text in the file on the console
    public static void readTextFile() throws IOException {
        Files.
                lines(Paths.get("src/main/java/day35lambda/LambdaTextFile.txt")).
                forEach(System.out::println);
    }

    //Example 2: Go to LambdaTextFile and check if all lines have "Lambda" word
    public static boolean checkSpecificWordExistInAllLines(String word) throws IOException {
        return Files.
                lines(Paths.get("src/main/java/day35lambda/LambdaTextFile.txt")).
                allMatch(t->t.contains(word));
    }

    //Example 3: Get the words ends with 'e' in a list distinctly
    public static List<String> getWordsInListDistinctly() throws IOException {
        return Files.
                lines(Paths.get("src/main/java/day35lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).//flatMap() method breaks the Array Structure in the stream
                        map(t->t.replaceAll("[^A-Za-z]", "")).
                filter(t->t.endsWith("e")).
                distinct().
                collect(Collectors.toList());

    }

    //Example 4: Get the words whose length is less than 6 put them in a list in lowercase and reverse order.
    public static List<String> getWordsLengthLessThanSpecificLength(int length) throws IOException {
        return Files.
                lines(Paths.get("src/main/java/day35lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                map(t->t.replaceAll("[^A-Za-z]", "")).
                map(t->t.toLowerCase()).
                filter(t->t.length()<length).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
    }

    //Example 5: Create a method to find total number of all the letters used in the text file.
    public static int getTheTotalNumOfLetters() throws IOException {
        return Files.
                lines(Paths.get("src/main/java/day35lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                map(t->t.replaceAll("[^A-Za-z]", "")).
                map(t->t.length()).
                reduce(Math::addExact).
                get();
    }
}