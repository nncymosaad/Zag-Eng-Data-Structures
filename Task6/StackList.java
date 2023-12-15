public class StackList {
    class Node {
        int value;
        Node nextadd;

        public Node(int item) {

            value = item;
        }
    }

    Node topstack;
    int counter = 0;

    public boolean isEmpty() {
        return counter==0;
    }

    public void push(int item) {
        Node newnode = new Node(item);
        if (isEmpty()) {
            topstack = newnode;
            newnode.nextadd=null;
        } else {
            newnode.nextadd = topstack;
            topstack = newnode;
        }
        counter++;
    }

    public int pop() {
        if (isEmpty())
            throw new RuntimeException("the stack is empty!!");
        if (counter== 1) {
            int temp =topstack.value;
            topstack=null;
            counter --;
            return temp;
         } else {
            Node node = topstack;
            topstack = topstack.nextadd;
            node.nextadd = null;
            counter--;
            return (node.value);
        }
    }
    public int peak() {
        if (isEmpty())
            throw new RuntimeException("the stack is empty!!");
        return topstack.value;
        }

    public int size() {
        return counter;
    }

    public void printElements() {
        Node current = topstack;
        while (current != null) {
            System.out.print(current.value);
            current = current.nextadd;
        }
    }

}