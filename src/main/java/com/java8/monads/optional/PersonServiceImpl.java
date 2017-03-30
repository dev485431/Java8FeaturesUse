package com.java8.monads.optional;

import com.java8.core.data.Company;
import com.java8.core.data.Profession;
import com.java8.core.data.Worker;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonServiceImpl {

    public static List<Worker> getWorkersByCompanyAndProf(MapNpeProtection<String, Company> companyMap, String companyName, Profession profession) {
        List<Worker> emptyWorkers = new LinkedList<>();
        return companyMap.get(companyName).getWorkers().orElse(emptyWorkers).stream().filter(w -> w.getProfession().equals(profession)).collect(Collectors.toList());
    }

}
