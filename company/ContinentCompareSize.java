package com.company;

import java.util.Comparator;

public class ContinentCompareSize implements Comparator<Continent> {
    @Override
    public int compare(Continent o1, Continent o2) {
        return o1.m_size.compareTo(o2.m_size);

    }
}
