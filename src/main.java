public class main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        /*
            Expected OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1

            Linked List: 
            4
         */
    }
}
