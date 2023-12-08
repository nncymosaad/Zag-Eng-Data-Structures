public class GenericLinkedList <E> {
    class Node {
        E value;
        Node nextadd;

        public Node(E item) {
            value = item;
        }
    }

    Node head, tail;
    int counter = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(E item) {
        Node newnode = new Node(item);
        if (isEmpty()) {
            head = tail = newnode;
        } else {
            newnode.nextadd = head;
            head = newnode;
        }
        counter++;
    }

    public void addLast(E item) {
        Node newnode = new Node(item);
        if (isEmpty()) {
            head = tail = newnode;
        } else {
            tail.nextadd = newnode;
            tail = newnode;
        }
        counter++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is already empty");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node node = head;
            head = head.nextadd;
            node.nextadd = null;
            counter--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List is already empty");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node node = beforelast();
            tail = node;
            node.nextadd = null;
            counter--;
        }
    }

    public Node beforelast() {
        Node current = head;
        Node before = head;
        while (current != null) {
            before = current;
            current = current.nextadd;
        }
        return before;
    }

    public int indexOf(E value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == value) {
                return index;
            }
            index++;
            current = current.nextadd;
        }
        return -1;
    }

    public boolean contains(E value) {
        int index = indexOf(value);
        return index != -1;
    }
    public int size(){
        return counter;
    }
    public void printElements() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.nextadd;
        }
    }
    public void reverse(){
        Node P = head;
        Node C = P.nextadd;
        Node N ;
        while (C!=null){
            N=C.nextadd;
            C.nextadd=P;
            P =C;
            C=N;
        }

        Node Temp = head;
        head = tail;
        tail = Temp;
        tail.nextadd=null;
    }
}