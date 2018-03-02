package veri.yapıları;

public class Node <AnyType>{

    AnyType data;
    Node<AnyType> nextNode;

    public Node(AnyType data) {
        this.data = data;
    }
}
