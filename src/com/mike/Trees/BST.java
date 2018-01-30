package com.mike.Trees;

public class BST {

    TreeNode root;
    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
            left=null;
            right =null;
        }
    }
    TreeNode createBST(int[] A){
        return root =createBST(A,0,A.length-1);
    }
    TreeNode createBST(int[ ]A,int start,int end){

        if(end<start)return null;
        int mid = (start+end)/2;
        TreeNode node = new TreeNode(A[mid]);
        node.left = createBST(A,start,mid-1);
        node.right = createBST(A,mid+1,end);
        return node;
    }

    public static void main(String[] args) {
        int [] A ={1,2,3,4,5,6};
        BST tree = new BST();
        tree.createBST(A);
        System.out.println(tree.root.data);
    }
}
