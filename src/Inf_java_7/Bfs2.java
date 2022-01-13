package Inf_java_7;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs2 {
    public static class Node{
        int data;
        Node lt,rt;

        public Node(int data) {
            this.data = data;
            lt = rt = null;
        }
    }

    public static int Bfs(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i=0;i<len;i++){
                Node tmp = queue.poll();
                if(tmp.lt == null && tmp.rt == null) return level;
                if(tmp.lt!=null) queue.offer(tmp.lt);
                if(tmp.rt!=null) queue.offer(tmp.rt);
            }
            level++;
        }
        return 0;
    }

    static Node root;
    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(Bfs(root));
    }
}
