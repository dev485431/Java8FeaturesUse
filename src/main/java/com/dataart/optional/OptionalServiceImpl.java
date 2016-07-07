package com.dataart.optional;

import com.dataart.core.data.Profession;
import com.dataart.core.data.Worker;
import com.dataart.core.data.opt.Computer;
import com.dataart.core.data.opt.SoundCard;
import com.dataart.core.data.opt.USB;

import java.util.Optional;
import java.util.function.Predicate;

public class OptionalServiceImpl {

    private static String SC_DEFAULT_VER = "CH External";
    private static String SC_DEFAULT_INFO = "NONE";

    public static void printIfPresent(Optional<Worker> worker) {
        worker.ifPresent(w -> System.out.println(w.getProfession()));
    }

    public static void printOrElse(Optional<Worker> worker) {
        System.out.println(worker.orElse(new Worker(1L, "Default", "Default", 0, Profession.PROGRAMMER)));
    }

    public static Optional<SoundCard> checkSoundCardOrSetDefault(Optional<Computer> computer) {
        return computer.flatMap(Computer::getUsb)
                .map(USB::getSoundCard)
                .orElse(Optional.of(new SoundCard(SC_DEFAULT_VER)));
    }

    public static Boolean isSoundCardPresent(Optional<Computer> computer) {
        return computer.flatMap(Computer::getUsb)
                .flatMap(USB::getSoundCard)
                .isPresent();
    }

    public static String getSoundCardInfo(Optional<Computer> computer) {
        return computer.flatMap(Computer::getUsb)
                .flatMap(USB::getSoundCard)
                .map(SoundCard::getVersion)
                .orElse(SC_DEFAULT_INFO);
    }

    public static Optional<Computer> getComputersByCriterias(Optional<Computer> computerOptional, Predicate p) {
        return computerOptional.filter(p);
    }

}
