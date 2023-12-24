package Lab;

import java.util.Scanner;
class DLLProgram {
class Node {
int item;
Node previous;
Node next;
public Node(int item) {
this.item = item;
}
}
Node head, tail = null;
public void insertNode(int item) {
Node newNode = new Node(item);
if(head == null) {
head = tail = newNode;
head.previous = null;
tail.next = null;
}
else {
tail.next = newNode;
newNode.previous = tail;
tail = newNode;
tail.next = null;
}
System.out.println(item+" inserted\n");
}
public void deleteNode() {
if(head==null) {
return;
}
int x = head.item;
head = head.next;
System.out.println("Element "+x+" got deleted");

}
public void displayNodes() {
Node current = head;
if(head == null) {
System.out.println("Doubly linked list is empty\n");
return;
}
System.out.println("Nodes of doubly linked list: ");
while(current != null) {
System.out.print(current.item + " ");
current = current.next;
}
System.out.println("\n");
}
}
public class DoublyLinkedList {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
DLLProgram dll=new DLLProgram();
int ch,item;
while(true)
{
System.out.print("Enter your choice : \n");
System.out.println("1.Insert new element\t2.Delete element\t3.Display\t4.Exit");
ch=sc.nextInt();
switch(ch)
{
case 1 : System.out.print("Enter the element to be inserted : ");
item=sc.nextInt();
dll.insertNode(item);
break;

case 2 : dll.deleteNode();
dll.displayNodes();
break;

case 3 : dll.displayNodes();
break;

case 4 :System.out.println("EXITED!");
System.exit(0);
break;

default :System.out.println("Wrong Choice!!!\n");
break;
}
}
}
}
