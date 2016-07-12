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
        return future.thenApply(Integer::parseInt).thenApply(number -> number * 2);
    }

    public static Integer handleException(CompletableFuture<String> future) throws ExecutionException, InterruptedException {
        return future.handle((result, exception) -> exception != null ? -1 : Integer.parseInt(result)).get();
    }

    public static CompletableFuture<List<Worker>> handleFutures(CompletableFuture<Company> companyCompletableFuture, CompletableFuture<Profession> professionCompletableFuture) throws ExecutionException, InterruptedException {
        CompletableFuture<List<Worker>> results = companyCompletableFuture.thenCombine(professionCompletableFuture, (company, profession) -> company.getWorkers().get().stream().filter(w -> w.getProfession().equals(profession)).collect(Collectors.toList()));
        return results;
    }

}
