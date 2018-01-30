package com.mike.LinkedList;

import java.util.Queue;

public class LinkedList {

    ListNode head;
    ListNode tail;

    class ListNode{
        int data;
        ListNode next;

        ListNode (int data){
            this.data = data;
            next=null;
        }
    }

    public LinkedList(){
        head = null;
        tail=null;
    }

    public void print(){
        ListNode curr = head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return head==null;
    }

    public LinkedList reverse(){
        LinkedList list = new LinkedList();
        ListNode curr = head;
        while(curr!=null){
            ListNode node= new ListNode(curr.data);
            node.next=list.head;
            list.head=node;
            curr=curr.next;
            Math.abs(0);
        }
        return  list;

    }
    public void reverseInPlace(){
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr = next;
        }
        head=prev;

    }

    public void add(int data){
        ListNode node = new ListNode(data);
        if(head==null){
            head=node;
            tail=head;
        }
        tail.next=node;
        tail=node;

    }
    enum State{Visted,UnVisited, Visting}
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i =1; i<11;i++){
            list.add(i);
        }
        list.print();
        list.reverseInPlace();
        list.print();
        Queue<Integer> q = new java.util.LinkedList<>();

    }

}
