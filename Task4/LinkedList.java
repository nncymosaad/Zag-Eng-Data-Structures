public class LinkedList {
    class Node {
        int value;
        Node nextadd;

        public Node(int item) {
            value = item;
        }
    }

    Node head, tail;
    int counter = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        Node newnode = new Node(item);
        if (isEmpty()) {
            head = tail = newnode;
        } else {
            newnode.nextadd = head;
            head = newnode;
        }
        counter++;
    }

    public void addLast(int item) {
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

    public int indexOf(int value) {
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

    public boolean contains(int value) {
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
    public int max() {
        Node current = head;
        Node max = head;
        while (current != null) {
            if (current.value>max.value) {
                max = current;
            }
            current = current.nextadd;
        }
        return max.value;
    }
    public int min() {
        Node current = head;
        Node min = head;
        while (current != null) {
            if (current.value<min.value) {
                min = current;
            }
            current = current.nextadd;
        }
        return min.value;
    }
}