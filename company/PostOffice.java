package com.company;

import java.util.ArrayList;
import java.util.Queue;

public class PostOffice {

    ArrayList<Box> m_boxes;

    Queue<String>m_customers;

    public PostOffice(ArrayList<Box> m_boxes, Queue<String> m_customers) {
        this.m_boxes = m_boxes;
        this.m_customers = m_customers;
    }

    public void newBoxArrived(Box box ){

        m_boxes.add(box);


  }


  public void newCustomerArrived(String customer){

        m_customers.add(customer);


  }



}



