// Name: Kyle Petkovic
//
// Program file: List1
//
// Class Description: Demonstrates the use of the SinglyLinkedList class.
//
// Created: 3/7/18

public class List1
{
  SinglyLinkedList myList;

  public static void main(String[] args)
  {

      SinglyLinkedList list = new SinglyLinkedList();

      list.addFirst(1);
      list.addLast(2);
      list.addLast(3);
      list.addLast(4);
      list.addLast(5);
      list.addLast(6);
      list.addLast(7);
      list.addLast(8);
      list.addLast(9);
      list.addLast(10);
      list.addLast(11);
      list.addLast(12);
      list.addLast(13);
      list.addLast(14);
      list.addLast(15);
      list.addLast(16);
      list.addLast(17);
      list.addLast(18);
      list.addLast(19);
      list.addLast(20);



      System.out.println("Phase 1:");

      System.out.println("First Element: " + list.getFirst());

      System.out.println("Last Element: " + list.getLast());

      System.out.print("SinglyLinkedList: ");
      list.printList();

      System.out.println("Number of Nodes: " + list.size());

      System.out.println("\nPhase 2:");

      //make list for phase 2
      SinglyLinkedList list2 = new SinglyLinkedList();

      list2.insertInOrder(3);
      list2.insertInOrder(5);
      list2.insertInOrder(15);
      list2.insertInOrder(1);
      list2.insertInOrder(3);
      list2.insertInOrder(9);
      list2.insertInOrder(-2);
      list2.insertInOrder(8);

      System.out.print("List2: ");
      list2.printList();

      list2.remove(9);
      list2.remove(-2);
      list2.remove(6);

      System.out.print("List2 after 9. -2. and 6 are removed: ");
      list2.printList();




  }
}
