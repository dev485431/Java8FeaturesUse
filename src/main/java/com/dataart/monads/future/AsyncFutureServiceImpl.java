package com.dataart.monads.future;

import com.dataart.core.data.Company;
import com.dataart.core.data.Profession;
import com.dataart.core.data.Worker;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class AsyncFutureServiceImpl {


    public static CompletableFuture<Integer> handleString(CompletableFuture<String> future) {
        return null;
    }

    public static Integer handleException(CompletableFuture<String> future) throws ExecutionException, InterruptedException {
        return null;
    }

    public static CompletableFuture<List<Worker>> handleFutures(CompletableFuture<Company> companyCompletableFuture, CompletableFuture<Profession> professionCompletableFuture) throws ExecutionException, InterruptedException {
        return null;
    }

}
