package graphs;

import java.util.ArrayList;
import java.util.Stack;

class Graph3 {
    private int V;
    private   ArrayList<ArrayList<Integer>> adj=new  ArrayList<ArrayList<Integer>>();

    Graph3(int v)
    {
        V=v;
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int u,int v)
    {
        adj.get(u).add(v);

    }
    void displayList()
    {
        System.out.println(adj);

    }
    void dfsForList(int i,boolean vis[],Stack<Integer> st){
        vis[i]=true;
        //storeBfs.add(i);

        for(Integer it:adj.get(i))
        {   if(vis[it]==false){
            dfsForList(it,vis,st);}
        }
        st.push(i);

    }
    ArrayList<Integer> DFS()
    {
        ArrayList<Integer> topo=new ArrayList<>();
        boolean vis[]=new boolean[V+1];
        Stack<Integer> st=new Stack<>();
//        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<V;i++)
        {
            if(vis[i]==false)
            {

                dfsForList(i,vis,st);



            }
        }
        while(!st.empty())
        {
            topo.add(st.pop());
        }
        return topo;
    }




}

public class topologicalSortUsingDfs {
    public static void main(String[] args) {
//        int V;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number of vertices:");
//        V=sc.nextInt();
        int V=6;

        Graph3 g=new Graph3(V);

//        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,1);
        g.addEdge(0,4);
        g.addEdge(4,1);
        g.addEdge(5,2);
        g.addEdge(5,0);

        g.displayList();

        System.out.println(g.DFS());

    }
}


