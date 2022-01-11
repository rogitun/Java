package Inf_java_7;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

    public class node{
        int data;
        node lt,rt;
        public node(int data){
            this.data = data;
        }
    }
    //BFS 기초 개념
    public static void bfs(node root){
        int level = 0;
        Queue<node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int iter = queue.size();
            System.out.print("Level = " + level);
            for(int i=0;i<iter;i++){
                node temp = queue.poll();
                System.out.println("temp.data = " + temp.data);
                if(temp.lt!=null)queue.offer(temp.lt);
                if(temp.rt!=null)queue.offer(temp.rt);
            }
            level++;
        }
    }

    public static void main(String[] args) {

    }
}
