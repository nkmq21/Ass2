public class ReaderList<T> {
    private Node<T> head;

    public static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add data to the end of the linked list
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode; //current are already at the end but to add the new node it must be extended
        }
    }

    // Display the list
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    //Search reader by rcode
    public T search(String code) {
        Node<T> current = head;
        while (current.next != null) {
            if (current.data instanceof Reader && ((Reader) current.data).rcode.equalsIgnoreCase(code)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    //delete by rcode
    public boolean delete(String code) {
        if (head == null) return false;
        if (head.data instanceof Reader && ((Reader) head.data).rcode.equalsIgnoreCase(code)) {
            head = head.next;
            return true;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                if (current.next.data instanceof Reader && ((Reader) current.next.data).rcode.equalsIgnoreCase(code)) {
                    current.next = current.next.next;
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }
}
