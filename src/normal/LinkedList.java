package normal;

class node {
    int head;
    node next;

    public node(int head, node next) {
        this.head = head;
        this.next = next;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "node{" +
                "head=" + head +
                ", next=" + next +
                '}';
    }
}

public class LinkedList {
    node head;

    public LinkedList() {
    }

    public LinkedList(node head) {
        this.head = head;
    }

    public void insert(int n) {

        node nuevo = new node(n,null);

        if (head == null) {
            this.head = nuevo;
        } else {
            node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(nuevo);
        }
    }

    public void imprimir () {
        node head = this.head;
        node temp = head;
        while (temp.getNext()!= null) {
            System.out.println(temp.getHead());
            temp = temp.getNext();
        }
        System.out.println(temp.getHead());

    }
}
