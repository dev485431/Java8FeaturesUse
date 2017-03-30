package com.java8.function;

import com.java8.core.data.Worker;
import com.java8.function.interfaces.Transform;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class LambdaServiceImpl {

    public static String transformString(String data, Transform<String> t) {
        return t.transform(data);
    }

    public static void consumerInfo(Worker worker, Consumer<Worker> consumer) {
        consumer.accept(worker);
    }

    public static void sortString(List<String> data, Comparator<String> comparator) {
        Collections.sort(data, comparator);
    }

    public static void sortWorkers(List<Worker> data, Comparator<Worker> comparator) {
        Collections.sort(data, comparator);
    }

    public static Float calc(Float first, Float second, BiFunction<Float, Float, Float> bFunction) {
        return bFunction.apply(first, second);
    }
}
