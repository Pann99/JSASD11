public class SLLMain23 {

    public static void main(String[] args) {
        LinkedList23 myLinkedList = new LinkedList23();
        myLinkedList.print();
        myLinkedList.addFirst(800);
        myLinkedList.print();
        myLinkedList.addLast(700);
        myLinkedList.print();
        myLinkedList.addFirst(500);
        myLinkedList.print();
        myLinkedList.insertAfter(700, 300);
        myLinkedList.print();

        System.out.println("Data pada index ke-1: " + myLinkedList.getData(1));
        System.out.println("Data 300 berada pada indeks ke: " + myLinkedList.indexOf(300));
        
        myLinkedList.remove(300);
        myLinkedList.print();
        myLinkedList.removeFirst();
        myLinkedList.print();
        myLinkedList.removeLast();
        myLinkedList.print();

        myLinkedList.insertBefore(1, 404);
        myLinkedList.print();
        myLinkedList.insertAt(0, 120);
        myLinkedList.print();
        myLinkedList.removeAt(1);
        myLinkedList.print();
    }
}