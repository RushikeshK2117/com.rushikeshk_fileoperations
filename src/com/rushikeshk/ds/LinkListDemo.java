package com.rushikeshk.ds;

public class LinkListDemo {

	public static void main(String[] args) {
		Node<String> head = new Node<String>("A");
		Node<String> b = new Node<String>("B");
		head.setNext(b);
		b.setPrev(head);
		Node<String> c = new Node<String>("C");
		b.setNext(c);
		c.setPrev(b);
		Node<String> d = new Node<String>("D");
		c.setNext(d);
		d.setPrev(c);
		Node<String> head2 = new Node<String>("E");
		d.setNext(head2);
		head2.setPrev(d);
		
		LinkListUtil<String> linkListUtil = new LinkListUtil<String>();
		System.out.println("Linked list");
		linkListUtil.printList(head);
		System.out.println("Consecutive Nodes in above linked list");
		linkListUtil.printConsecutiveNodesInList(head);
		System.out.println("Reverse linked list");
		linkListUtil.reverseLinkedList(head2);
		
		
		
	}
}
