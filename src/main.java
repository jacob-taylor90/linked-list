public class main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(7);
        myLinkedList.prepend(11);
        myLinkedList.printList();

        myLinkedList.removeFirst();
        myLinkedList.printList();

        myLinkedList.removeFirst();
        myLinkedList.printList();
        
        myLinkedList.removeFirst();
        myLinkedList.printList();
    }
}
