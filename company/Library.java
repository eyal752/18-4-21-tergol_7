package com.company;

import java.util.HashMap;

public class Library {


    protected HashMap<String,Integer>m_BooksMap= new HashMap<>();

    public Library(HashMap<String, Integer> m_BooksMap) {
        this.m_BooksMap = m_BooksMap;
    }

    public void addNewBook(String book, Integer shelf){

        m_BooksMap.put(book,shelf);
    }


    public int searchForBook(String book) {

        if (m_BooksMap.containsKey(book)) {

            System.out.println(String.format("The book %s is on self %s",book,m_BooksMap.get(book)));

        }

        return -1;
    }




    public void removeBook(String book){

        if (m_BooksMap.containsKey(book)) {

            m_BooksMap.remove(book);

            System.out.println(String.format("This book %s is removed from library",book));


        }

     else {

            System.out.println(String.format("The book '%s' is not in the library", book));
        }


    }




    public int countBook(){
        int count_of_books=0;
        for (String book:m_BooksMap.keySet()){
          count_of_books++;

        }

       return count_of_books;


}

    }

