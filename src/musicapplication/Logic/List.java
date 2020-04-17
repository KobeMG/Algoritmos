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
public class List {

    Node first, last;
    public static int size;

    public List() {
        first = null;
        last = null;
        size = 0;
    }

    public boolean isEmpty() {
//        if (first == null && last == null) {
//            return true;
//        } else {
//            return false;
//        }
        return first == null  && last==null ;
    }

    public void insert(String name, String address) {
 //Punteros previus y next Nodos last,firts
        Node newNode = new Node(name, address);
        if (first == null) { //isEmpty()
            first = newNode;
            first.next = first;
            newNode.previous = last;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.next = first;
            newNode.previous = last;
            last = newNode;
            first.previous = last;
        }
        size++;
    }
}
