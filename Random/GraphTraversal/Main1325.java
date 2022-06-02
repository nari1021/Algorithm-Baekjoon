import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1325 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        ArrayList<Integer>[] adjList = new ArrayList[N + 1];

        for(int i = 1; i <= N; i++)
            adjList[i] = new ArrayList<>();

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adjList[u].add(v);
        }

        int max = Integer.MIN_VALUE;
        int[] result = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            boolean[] visited = new boolean[N + 1];
            bfs_list(i, adjList, visited, result);
        }

        for(int i = 1; i <= N; i++) {
            max = Math.max(max, result[i]);
        }
        for(int i = 1; i <= N; i++) {
            if (result[i] == max)
                bw.write(i + " ");
        }
        br.close(); bw.flush(); bw.close();
    }

    public static void bfs_list(int v, ArrayList<Integer>[] adjList, boolean[] visited, int[] result) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(v);
        visited[v] = true;

        while(!q.isEmpty()) {
            v = q.poll();

            Iterator<Integer> iter = adjList[v].listIterator();
            while(iter.hasNext()) {
                int u = iter.next();
                if( !visited[u] ) {
                    q.add(u);
                    visited[u] = true;
                    result[u]++;
                }
            }
        }
    }
}
