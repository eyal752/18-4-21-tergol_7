package com.company;

public class Continent implements Comparable<Continent> {


    protected String m_name;

    protected Double m_size;

    protected Integer m_population ;

    public Continent(String m_name, Double m_size, Integer m_population) {
        this.m_name = m_name;
        this.m_size = m_size;
        this.m_population = m_population;
    }

    @Override
    public int compareTo(Continent o) {
        return this.m_name.compareTo(o.m_name);

    }
}
