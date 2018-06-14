package com.practice;

public class TreePractice {
    public static class Node{
        int data;
        Node l,r;
        Node(int a){
            data=a;
            this.l=null;
            this.r=null;
        }
    }
    public static Node create(int[] data){
        Node root=new Node(data[0]);
        for(int i=1;i<data.length;i++){
//            Node tmp=new Node(data[i]);
            insert(root,data[i]);
        }
        return root;
    }
    public static void insert(Node root,int data){
        if(root==null){
            return;
        }
        if(root.data>data){
            if(root.l==null){
                Node ltmp=new Node(data);
                root.l=ltmp;
                return;
            }else {
                insert(root.l, data);
            }
        }else{
            if(root.r==null){
                Node ltmp=new Node(data);
                root.r=ltmp;
                return;
            }else {
                insert(root.r, data);
            }
        }
    }
    public static void ergodic(Node root){
        if(root.l!=null){
            ergodic(root.l);
        }
        System.out.print(root.data+";");
        if(root.r!=null){
            ergodic(root.r);
        }
        return;
//        if(root.l==null&&root.r==null){
//            System.out.println(root.data);
//            return;
//        }
//        ergodic(root.l);
//        System.out.println(root.data);
//        ergodic(root.r);
//        System.out.println(root.data);

    }
}
