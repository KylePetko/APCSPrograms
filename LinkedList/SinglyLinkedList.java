// Name: Kyle Petkovic
//
// Program file: SinglyLinkedList
//
// Class Description: Implementation of lists, using singly linked elements.
//
// Created: 3/7/18

import java.util.*;

public class SinglyLinkedList
{
  private ListNode first;  // first element

  private ListNode last;  // allows direct access to the last element



  /**
   *  Constructor for the SinglyLinkedList object
   *  Generates an empty list.
   */
  public SinglyLinkedList()
  {
    first = null;

    last = null;

  }

  /**
   *  Returns the first element in this list.
   *
   * @return  the first element in the linked list.
   */
  public int getFirst()
  {
    if (first == null)
    {
      throw new NoSuchElementException();
    }
    else
      return first.getValue();
  }

  /**
   *  Returns the last element in this list.
   *
   */
  public int getLast()
  {
    if (last == null)
    {
      throw new NoSuchElementException();
    }
    else
      return last.getValue();
  }

  /**
   *  Inserts the given element at the beginning of this list.
   *
   * @param  value  the element to be inserted at the beginning of this list.
   */
  public void addFirst(int value)
  {
    // note the order that things happen:
    // head is parameter, then assigned
    first = new ListNode(value, first);
    last = first;

  }


  /**
   *  Inserts the given element at the end of this list.
   *
   */
  public void addLast(int value) {
      // note the order that things happen:
      // head is parameter, then assigned



      if (first == null)
      {
          first = new ListNode(value, first);
          last = first;



          

      }else {

          ListNode temp = new ListNode(value, null);
          last.setNext(temp);
          last = temp;

          
      }

  }



  //Prints out the list of nodes
  public void printList(){


      ListNode temp = first;


      while(temp != null )
      {
         System.out.print(temp.getValue() + " ");

      temp = temp.getNext();

      }

    System.out.println();

  }

  //Adds one to size, shouldAdd tells it if you want to add one, init set size to 0
  public int size(){

      int size = 0;

      for (ListNode counter = first; counter != null; counter = counter.getNext()){
          size++;

      }

      return size;


  }
  
  public void insertInOrder(int num) {
      ListNode temp = first;

      //Base case; see if there is anything in the list
      if (first == null) {
          addFirst(num);


      }

      else {

          temp = first;

          int small = num;
          int largest = num;

          //base case; finds smallest int
          while (temp != null) {

              if (temp.getValue() < small){

                  small = temp.getValue();
              }

              if (temp.getValue() > largest){

                  largest = temp.getValue();
              }


              temp = temp.getNext();

          }

          //Reset temp to beginning
          temp = first;

          //if a number passed is the same as one that is already in the list,
          //it can be assumed that you can add the same number right next to the one that was
          //already there, and it will still be sorted
          while(temp != null){

              //This is the base case, if "return;" isn't used it will go in an infinite loop
              if(temp.getValue() == num){
                  temp.setNext(new ListNode(num, temp.getNext()));
                  return;
              }


              temp = temp.getNext();
          }

          temp = first;

          //base case; add to front of list
          if(num == small){
              addFirst(num);
          }
          else {


              //Also handles the base case if the number is the largest
              temp = first;

              while (temp.getNext() != null && !((temp.getNext().getValue() > num) && (temp.getValue() < num))) {


                  temp = temp.getNext();
              }

              temp.setNext(new ListNode(num, temp.getNext()));

          }
      }

  }


  //Removes the first node with the value of the passed int
  public int remove(int num){
      boolean isFound = false;
      int index = 0;
      ListNode temp = first;

      //Base case; see if there is anything in the list
      if(first == null)
          //-999 is used when the number isn't found
          return -999;
      else{

          //base case; see if there is the num in the list
          while(temp != null){

              //for debugging
              //System.out.println(temp.getValue());

              if(temp.getValue() == num)
                  isFound = true;

              temp = temp.getNext();


              if(!isFound)
              index++;

          }

          if(isFound){

      //before is the node before the index, while after is the node right after the index

              ListNode before = first;
              ListNode after= first;

              //gets node right before the index
              for(int i = 0; i < index - 1 ; i++){
                  before = before.getNext();
              }

              //System.out.println("before: " + before.getValue());

              //gets node right after index
              for(int i = 0; i < index + 1; i++){
                  after = after.getNext();
              }

              //two base cases, if the index is at the edges

              //if the element is in index 0
              if(index == 0){

                  first = after;

                  return num;
              }
                else if(index == size()){

                  last = before;

                  return num;
              }
              else{
                  //System.out.println("After: " + after.getValue());

                  //sever old node
                  ListNode removed = before.getNext();
                  removed.setNext(null);

                  //set before to after
                  before.setNext(after);
              }



          }
          else
              return -999;

      }



      return num;
  }


}

