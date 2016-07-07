package com.dataart.optional;

import com.dataart.core.data.Profession;
import com.dataart.core.data.Worker;
import com.dataart.core.data.opt.Computer;
import com.dataart.core.data.opt.SoundCard;
import com.dataart.core.data.opt.USB;

import java.util.Optional;
import java.util.function.Predicate;

public class OptionalServiceImpl {

    public static void printIfPresent(Optional<Worker> worker) {
        worker.ifPresent(w -> System.out.println(w.getProfession()));
    }

    public static void printOrElse(Optional<Worker> worker) {
        System.out.println(worker.orElse(new Worker(1L, "Default", "Default", 0, Profession.PROGRAMMER)));
    }

    public static Optional<SoundCard> checkSoundCardOrSetDefault(Optional<Computer> computer) {
        return null;
    }

    public static Boolean isSoundCardPresent(Optional<Computer> computer) {
        return null;
    }

    public static String getSoundCardInfo(Optional<Computer> computer) {
        return null;
    }

    public static Optional<Computer> getComputersByCriterias(Optional<Computer> computerOptional, Predicate p) {
        return null;
    }
}
