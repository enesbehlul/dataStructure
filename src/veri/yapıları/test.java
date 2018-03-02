/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri.yapıları;

/**
 *
 * @author fsmblm0
 */
public class test {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("node1");
        list.addLast(new Node<>("node2"));
        list.addLast(new Node<>("node3"));
        list.addFirst(new Node<>("node4"));
        list.print();
        list.remove("nod2");
        list.insertAfter("node2", "ahahahaNode2");
        list.print();
    }
}
