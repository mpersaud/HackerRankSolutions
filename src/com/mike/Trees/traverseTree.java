package com.mike.Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//
// Definition for binary tree:
class traverseTree {
    class Tree<T> {
        Tree(T x) {
            value = x;
        }
        T value;
        Tree<T> left;
        Tree<T> right;
    }

    int[] traverseTree(Tree<Integer> t) {

        Queue<Tree> queue = new LinkedList();
        List<Integer> result = new LinkedList<>();
        queue.add(t);
        while(!queue.isEmpty()){
            Tree tree = queue.poll();
            result.add((Integer)tree.value);
            if(tree.left!=null)
                queue.add(tree.left);
            if(tree.right!=null)
                queue.add(tree.right);
        }
        //return toArray(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    int[] toArray(List<Integer> list) {
        int[] ret = new int[ list.size() ];
        int i = 0;
        for( Integer it:list)  {
            ret[i++]=it;
        }
        return ret;

    }

    public static void main(String[] args) {

    }

}