package com.company;

import java.util.ArrayList;

public class NiceQueue<E> {

     ArrayList<E>m_queue=new ArrayList<E>();

     public void enqueue(E e){

         if (m_queue.size()>=20){

             System.out.println("queue is full");
         }
         else {

             m_queue.add( e);
         }
     }


     public E dequeue(){

         if (m_queue.size()==0){
             return null;

         }

       else {
           return m_queue.remove(0);
         }

     }



     public void cler(){

         m_queue.clear();

     }


    public int count(){
        return m_queue.size();
    }

    public E next(){
        return m_queue.get(0);
    }
}
