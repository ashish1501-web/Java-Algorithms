package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Graph2{
    private int V;
    private   ArrayList<ArrayList<Integer>> adj=new  ArrayList<ArrayList<Integer>>();

    Graph2(int v)
    {
        V=v;
        for(int i=0;i<=V;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    void displayList()
    {
        System.out.println(adj);

    }
    boolean dfsForList(int i,int pre,boolean vis[],ArrayList<Integer> storeBfs ){
        vis[i]=true;


        for(Integer it:adj.get(i))
        {   if(vis[it]==false){
            dfsForList(it,i,vis,storeBfs);}
            else{
                if(it!=pre)
                {
                    return true;
                }
        }
        }
        return false;
    }
    void DFS()
    {
        ArrayList<Integer> storeBfs=new ArrayList<>();
        boolean vis[]=new boolean[V+1];
//        Queue<Integer> q=new LinkedList<>();

        for(int i=1;i<=V;i++)
        {
            if(vis[i]==false)
            {


                System.out.println(dfsForList(i,-1,vis,storeBfs));


            }
        }

    }




}

public class dfsOfGraph {
    public static void main(String[] args) {
//        int V;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number of vertices:");
//        V=sc.nextInt();
        int V=8;

        Graph2 g=new Graph2(V);

        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(2,5);
        g.addEdge(3,4);
        g.addEdge(4,7);
        g.addEdge(7,8);
        g.addEdge(5,6);
        g.addEdge(6,7);

        g.displayList();
        g.DFS();

    }
}

