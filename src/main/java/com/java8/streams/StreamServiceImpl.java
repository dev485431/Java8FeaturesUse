package com.java8.streams;

import com.java8.core.data.Company;
import com.java8.core.data.Profession;
import com.java8.core.data.Worker;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamServiceImpl {

    public static Long wordsCounter(List<String> words, String word) {
        return words.stream().filter(w -> w.contains(word)).count();
    }

    public static Integer getSum(int... i) {
        return IntStream.of(i).sum();
    }

    public static Long getCountWordsLongestThan(List<String> words, int count) {
        return words.stream().filter(w -> w.length() > count).count();
    }

    public static Long getCountWordsStartWith(List<String> words, String startWith) {
        return words.stream().filter(w -> w.startsWith(startWith)).count();
    }

    public static String getFirstWordStartWith(List<String> words, String startWith) {
        return words.stream().filter(w -> w.startsWith(startWith)).findFirst().get();
    }

    public static Double getAverageAge(List<Worker> workers) {
        return workers.stream().mapToInt(Worker::getAge).average().getAsDouble();
    }

    public static List<String> capitalLetter(List<String> words) {
        return words.stream().map(w -> Character.toString(w.charAt(0)).toUpperCase() + w.substring(1).toLowerCase()).collect(Collectors.toList());
    }

    public static List<String> concatenationAndToUpperCase(List<String> words1, List<String> words2) {
        return Stream.concat(words1.stream(), words2.stream())
                .map(w -> w.toUpperCase())
                .collect(Collectors.toList());
    }

    public static List<String> sortWordsByLength(List<String> words) {
        return words.stream().sorted((w1, w2) -> w1.length() - w2.length()).collect(Collectors.toList());
    }

    public static List<String> excludeDuplicateAndAlphabeticalSort(List<String> words) {
        return words.stream().distinct().sorted().collect(Collectors.toList());
    }

    public static List<Worker> searchWorkers(List<Company> companies, Profession profession) {
        return companies.stream()
                .map(Company::getWorkers)
                .filter(o -> o.isPresent())
                .map(o -> o.get())
                .flatMap(List::stream)
                .filter(w -> w.getProfession().equals(profession))
                .collect(Collectors.toList());
    }

}
