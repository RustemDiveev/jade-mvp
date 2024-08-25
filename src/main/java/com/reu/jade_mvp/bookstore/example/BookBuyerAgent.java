/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reu.jade_mvp.bookstore.example;

import jade.core.Agent;

/**
 *
 * @author ruste
 */
public class BookBuyerAgent extends Agent {
    protected void setup() {
        System.out.println("Hello! Buyer-agent "+getAID().getName()+" is ready.");
    }
}
