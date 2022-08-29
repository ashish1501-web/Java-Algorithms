package graphs;

import java.util.*;
import java.util.LinkedList;
import java.util.Stack;

class Graph4{
    private int V;
    private   ArrayList<ArrayList<Integer>> adj=new  ArrayList<ArrayList<Integer>>();
    private int indegree[];
    Graph4(int v)
    {
        V=v;
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        indegree=new int[V];
        for(int i=0;i<V;i++)
        {
            indegree[i]=0;
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

    ArrayList<Integer>  bfsSort()
    {   ArrayList<Integer> topoSort=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            for(Integer it:adj.get(i)){
                indegree[it]++;
            }
        }
        for(int i=0;i<V;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        while(!q.isEmpty())
        {
            int node=q.poll();
            topoSort.add(node);

            for(Integer it:adj.get(node))
            {
                indegree[it]--;
                if(indegree[it]==0)
                {
                    q.add(it);
                }
            }


        }

        return topoSort;
    }




}

public class topologicalSortUsingBfs {
    public static void main(String[] args) {
//        int V;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number of vertices:");
//        V=sc.nextInt();
        int V=6;

        Graph4 g=new Graph4(V);

//        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,1);
        g.addEdge(4,0);
        g.addEdge(4,1);
        g.addEdge(5,2);
        g.addEdge(5,0);

        g.displayList();

        System.out.println(g.bfsSort());

    }
}




