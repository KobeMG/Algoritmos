/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicapplication.Logic;

/**
 *
 * @author Kobem
 */
public class Node {
    String name,address;
    Node next,previous;

    public Node() {
    }

    public Node(String name, String address) {
        this.name = name;
        this.address = address;
        next=null;
        previous=null;
    }
    
}
