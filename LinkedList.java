import com.sun.jdi.Value;
import java.util.Arrays;

class LinkedList{
class Node{
    private int value;
    private Node next;
    public Node(int value){
       this.value=value;
    }
  }
  private Node head;
  private int size;
  int []arr=new int[size];
  //add first
  public void prepend(int value){
    var node =new Node(value);
    if (head==null){
      head=node;
    }else{
      node.next=head;
      head =node;
      }
    size++;
  }
  //print the value;
  public void print(){
     Node prev;
    int index =0;
    prev=head;
  while(prev!=null){
  System.out.print(index++ +" ");
    System.out.println(prev.value);
    prev=prev.next;
    
  }
    System.out.println("done");

    
  }
  //add last
  public void append(int value){
    Node prev;
    var node =new Node (value);
    if (head ==null)
      head =node;
     else{
       prev=head;
    while(prev.next!=null){
        prev=prev.next;}
       prev.next=node;
     } 
    size++;
  }
 
  public void indexof(int value){
      
      Node current;
      int count=0;
   
    current =head;

    while(current!=null){


      if (current.value ==value)
        System.out.println(count);
         current =current.next;
     count++;
      
    }
   System.out.println("error");
  
  }
  public void sum(){
      
      Node prev;
    int sum =0;

      
       prev =head;

       while(prev.next!=null){
         sum += prev.value;
         prev=prev.next;

      
       }
       sum += prev.value;
   System.out.println(sum);
    
         
  }
}
