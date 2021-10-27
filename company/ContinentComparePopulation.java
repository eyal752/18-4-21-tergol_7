package com.company;

import java.util.Comparator;

public class ContinentComparePopulation implements Comparator<Continent> {


    @Override
    public int compare(Continent o1, Continent o2) {
        return o1.m_population.compareTo(o2.m_population);
    }
}
