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
public class LinkedList<T> {

    Node<T> head;

    public void addFirst(T data) {
        Node<T> newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void insertAfter(T data, T newData){
        Node<T> newNode = new Node(newData);
        Node<T> temp = head;
        while(temp != null && !temp.data.equals(data)){
            temp = temp.next;
        }
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
        else
            System.out.println("Boyle bir node yok");
    }
    
    public void addLast(T data){
        Node<T> temp = head;
        Node<T> newNode = new Node(data);
        while(temp.next != null){
            temp = temp.next;            
        }
        if (temp != null) {
            temp.next = newNode;
        }
    }
    
    public void remove(T rData){
        Node<T> temp = head;
        while (temp.next != null && !temp.next.data.equals(rData)) {
            temp = temp.next;
        }
        if (head.data.equals(rData)) {
            head = head.next;
        }
        else if (temp.next != null) {
            temp.next = temp.next.next;
        }
        else if (temp.next.next == null && temp != null) {
            temp.next = null;
        }
        else {
            System.out.println("temp null");
        }
    }
    
    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
