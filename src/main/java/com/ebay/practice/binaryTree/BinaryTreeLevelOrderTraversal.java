package com.ebay.practice.binaryTree;

import com.ebay.practice.model.BinaryTreeNode;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    static List<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args){

        // create a binary tree
        /*BinaryTreeNode node1 = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node3 = new BinaryTreeNode(3);
        node1.setLeft(node2);
        node1.setRight(node3);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(5);
        node2.setLeft(node4);
        node2.setRight(node5);
        BinaryTreeNode node6 = new BinaryTreeNode(6);
        BinaryTreeNode node7 = new BinaryTreeNode(7);
        node3.setLeft(node6);
        node3.setRight(node7);*/

        // create a binary tree
        BinaryTreeNode node1 = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node3 = new BinaryTreeNode(3);
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        BinaryTreeNode node5 = new BinaryTreeNode(5);
        BinaryTreeNode node6 = new BinaryTreeNode(6);
        BinaryTreeNode node7 = new BinaryTreeNode(7);
        BinaryTreeNode node8 = new BinaryTreeNode(8);
        BinaryTreeNode node9 = new BinaryTreeNode(9);
        BinaryTreeNode node10 = new BinaryTreeNode(10);
        BinaryTreeNode node11 = new BinaryTreeNode(11);
        BinaryTreeNode node12 = new BinaryTreeNode(12);

        node1.setLeft(node2);
        node1.setRight(node11);
        node2.setLeft(node3);
        node2.setRight(node4);
        node3.setRight(node5);
        node5.setLeft(node7);
        node7.setRight(node9);
        node4.setLeft(node10);
        node10.setRight(node12);
        node11.setLeft(node6);
        node6.setRight(node8);



         //System.out.println(levelorderTraversalRecursion(node1));
        // list.clear();
         System.out.println(levelorderTraversalIterative1(node1));
        //list.clear();
        // System.out.println(preorderTraversalIterative2(node1));

    }

    /*//recursive way using DFS
    public static List<Integer> levelorderTraversalRecursion(BinaryTreeNode root) {
        if(root !=null){
            preorderhelper(root);
        }

        return list;
    }

    public static void preorderhelper(BinaryTreeNode node){

        list.add(node.getValue());
        if(node.getLeft()!=null)
            preorderhelper(node.getLeft());

        if(node.getRight()!=null)
            preorderhelper(node.getRight());
    }*/

    // 1) iterative way of binary tree levelorder traversal

    public static List<List<Integer>> levelorderTraversalIterative1(BinaryTreeNode root){

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null)
            return res;
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> subList = new ArrayList<Integer>();
            for(int i=0; i<level; i++){
                BinaryTreeNode temp = queue.peek();
                if(temp.getLeft()!=null) queue.offer(temp.getLeft());
                if(temp.getRight()!=null) queue.offer(temp.getRight());
                subList.add(temp.getValue());
                queue.poll();
            }
            res.add(subList);
        }
        return res;


    }

}
