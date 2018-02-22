package com.mike.LinkedList;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    static ListNode removeGreaterNodes(ListNode listHead, int x) {
        ListNode curr= listHead;
        ListNode prev= listHead;

        while(curr!=null){
            if(curr.val>x)
                prev.next=curr.next;
            else{
                prev=curr;
            }
            curr=curr.next;
        }
        return (listHead.val>x)? listHead.next:listHead;

    }

    public static int getSize(ListNode l){

        int count = 0;
        ListNode start= l;
        while(start!=null){
            start=start.next;
            count++;
        }
        return count;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1Size = getSize(l1);
        int l2Size = getSize(l2);
        ListNode smaller;
        ListNode larger;
        if(l1Size<l2Size){
            smaller=l1;
            larger=l2;
        }
        else{
            smaller=l2;
            larger=l1;
        }

        ListNode result = larger;
        int carry =0;
        int sum =0;
        while(larger!=null){
            if(smaller==null){
                sum = 0+larger.val+carry;
                carry = sum/10;
                larger.val = (sum) % 10;
                larger = larger.next;
            }
            else{
                sum= smaller.val + larger.val+carry;
                carry = sum/10;
                larger.val = (sum) % 10;
                smaller = smaller.next;
                larger = larger.next;
            }
        }
        if(carry!=0){
            ListNode temp= new ListNode(carry);
            larger = result;
            while(larger.next!=null){

                System.out.println(larger.val);
                larger = larger.next;
            }
            larger.next=temp;
        }


        return result;
    }


    public static void main(String[] args) {
        ListNode larger= new ListNode(4);
        ListNode smaller = new ListNode(6);
        ListNode result =addTwoNumbers(larger,smaller);
        ListNode temp = result;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

}