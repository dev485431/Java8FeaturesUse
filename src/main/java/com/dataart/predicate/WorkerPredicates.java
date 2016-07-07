package com.dataart.predicate;

import com.dataart.core.data.Profession;
import com.dataart.core.data.Worker;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WorkerPredicates {

    public static Predicate<Worker> isAdult() {
        return null;
    }

    public static Predicate<Worker> isAgeMoreThan(int age) {
        return null;
    }

    public static Predicate<Worker> isAgeMoreThanAndProfession(int age, Profession profession) {
        return null;
    }

    public static Predicate<Worker> isAgeMoreThanOrProfession(int age, Profession profession) {
        return null;
    }

    public static List<Worker> filterWorkers(List<Worker> workerList, Predicate<Worker> predicate) {
        return null;
    }
}
