/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubleLinkedList;

/**
 *
 * @author behlul
 */
public class Test {

    public static void main(String[] args) {
        doubleLinkedList<String> list = new doubleLinkedList<>();
        list.addFirst("node 1");
        list.addFirst("node 2");        
        list.addLast("node 4");
        list.insertBefore("node 1", "node 6");
        list.insertAfter("node 2", "node 5");
        
        list.print();
        
        long sayi = 0b11111111111111111111111111111111;
        System.out.println(sayi);
    }
}
