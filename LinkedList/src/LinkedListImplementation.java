public class LinkedListImplementation {

    public static class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node head = null;
    public static int linkedListSize = 0;
    public static void insert_node(int position, int value) {

        if(position > linkedListSize+1){
            return;
        }

        if(position == 1){
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
            linkedListSize++;
        }
        else{
            Node dummyNode = head;
            for(int i=2; i<=position-1; i++){
                dummyNode = dummyNode.next;
            }

            Node newNode = new Node(value);
            newNode.next = dummyNode.next;
            dummyNode.next = newNode;
            linkedListSize++;
        }
    }

    public static void delete_node(int position) {

        if(position > linkedListSize){
            return;
        }


        int currentPosition = 1;

        if(position == currentPosition){
            head = head.next;
        }
        else{
            Node dummyNode = head;
            for(int i=2; i<=position-1; i++){
                dummyNode = dummyNode.next;
            }
            dummyNode.next = dummyNode.next.next;
        }
        linkedListSize--;
    }

    public static void print_ll() {
        if(linkedListSize == 0){
            return;
        }

        Node dummy = head;

        while (dummy.next != null){
            System.out.print(dummy.val + " ");
            dummy = dummy.next;
        }
        System.out.print(dummy.val);
    }

}
