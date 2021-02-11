class Node {
    Node next;
    int data;
    public Node(int d) {
        data = d;
    }
    public void appendToTail(int d) {
        Node lastNode = new Node(d);
        Node n = this;
        while(n.next != null) {
            n = n.next;
        }
        n.next = lastNode;
    }

    public Node deleteNode(Node head, int d) {
        Node n = head;
        if(n.data == d) return head.next;
        while(n.next != null) {
            if(n.next.data == d) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

    public Node nthToLast(Node head, int k) {
        Node p1 = head;
        Node p2 = head;
        for(int i = 0; i < k; i++) {
            if(p1 == null) return null;
            p1 = p1.next;
        }
        while(p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
        // time O(n) space O(1)
    }

    public boolean deleteNode(Node n) {
        if(n == null || n.next == null) {
            return false;
        }
        Node next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }

}