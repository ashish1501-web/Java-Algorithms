package graphs;
import java.util.*;

class Node{
    int first;
    int second;
    Node(int f,int s)
    {
        this.first=f;
        this.second=s;
    }
}
class Graph5{
    protected int V;
    protected   ArrayList<ArrayList<Integer>> adj=new  ArrayList<ArrayList<Integer>>();

    Graph5(int v)
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

   boolean detectCycle(int i)
    {
        ArrayList<Integer> storeBfs=new ArrayList<>();
        boolean vis[]=new boolean[V+1];
        Queue<Node> q=new LinkedList<>();
        q.add(new Node(i,-1));
        vis[i] = true;




                while (!q.isEmpty()) {
                    int f = q.peek().first;
                    int s=q.peek().second;
                   q.remove();
                    for (Integer it : adj.get(f)) {
                        if (!vis[it]) {
                            vis[it] = true;
                            q.add(new Node(it,f));
                        }
                        else{
                            if(it!=s)
                            {
                                return true;
                            }
                    }
                }

            }

        return false;
    }


}

public class detectCycleInGraphUsingBfs{
    public static void main(String[] args) {
//        int V;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number of vertices:");
//        V=sc.nextInt();
        int V=8;

        Graph5 g=new Graph5(V);

        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(2,5);
        g.addEdge(3,4);
        g.addEdge(4,7);
        g.addEdge(7,8);
        g.addEdge(5,6);
        g.addEdge(6,7);

        g.displayList();
        System.out.println(g.detectCycle(1));

    }
}


