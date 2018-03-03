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
public class doubleLinkedList<T> {

    Node<T> head;

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        if (temp != null) {
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void insertAfter(T data, T newData) {
        if (head != null) {
            Node<T> temp = head;
            while (temp.next != null && !temp.data.equals(data)) {
                temp = temp.next;
            }
            if (temp != null) {
                Node<T> newNode = new Node<>(newData);
                newNode.next = temp.next;
                temp.next.prev = newNode;
                temp.next = newNode;
                newNode.prev = temp;
            } else {
                System.out.println("böyle bir node yok");
            }
        } else {
            System.out.println("boş liste lan bu");
        }
    }
    public void insertBefore(T data, T newData) {
        if (head != null) {
            Node<T> temp = head;
            while (temp != null && !temp.data.equals(data)) {
                temp = temp.next;
            }
            if (temp != null) {
                Node<T> newNode = new Node<>(newData);
                newNode.next = temp;
                temp.prev.next = newNode;
                newNode.prev = temp.prev;
                temp.prev = newNode;
                
            } else {
                System.out.println("böyle bir node yok");
            }
        } else {
            System.out.println("boş liste lan bu");
        }
    }

    public void remove(T data) {
        Node<T> temp = head;
        while (temp != null) {
            temp = temp.next;
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
