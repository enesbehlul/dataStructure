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
public class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T data) {
        next = null;
        prev = null;
        this.data = data;
    }
}
