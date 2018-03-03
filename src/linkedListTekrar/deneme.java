/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedListTekrar;

/**
 *
 * @author behlul
 */
public class deneme {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        //list.remove("anana");
        list.addFirst("node1");
        list.addLast("node2");
        list.addLast("node3");
        list.addFirst("node4");
        list.insertAfter("node1", "AHAHAHAHA");
        list.print();
        list.remove("node4");
        list.print();
    }
}
