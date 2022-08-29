package graphs;
import java.util.*;

class Graph{
    protected int V;
    protected   ArrayList<ArrayList<Integer>> adj=new  ArrayList<ArrayList<Integer>>();

    Graph(int v)
    {

        this.V=v;
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

    ArrayList<Integer> BFS()
    {
        ArrayList<Integer> storeBfs=new ArrayList<>();
        boolean vis[]=new boolean[V+1];
        Queue<Integer> q=new LinkedList<>();

        for(int i=1;i<=V;i++)
        {
            if(vis[i]==false)
            {
                q.add(i);
                vis[i]=true;

                while(!q.isEmpty())
                {
                    int node=q.poll();
                    storeBfs.add(node);
                    for(Integer it:adj.get(node))
                    {   if(!vis[it])
                        {
                            vis[it] = true;
                            q.add(it);
                        }
                    }
                }

            }
        }
        return storeBfs;
    }


}

public class bfsOfGraph {
    public static void main(String[] args) {
//        int V;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number of vertices:");
//        V=sc.nextInt();
            int V=7;

            Graph g=new Graph(V);

            g.addEdge(1,2);
            g.addEdge(2,3);
            g.addEdge(7,2);
            g.addEdge(3,5);
            g.addEdge(7,5);
            g.addEdge(4,6);

            g.displayList();
        System.out.println(g.BFS());

    }
}
