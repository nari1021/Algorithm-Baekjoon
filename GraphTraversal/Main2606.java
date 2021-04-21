import java.io.*;
import java.util.*;

public class Main2606 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int computer = Integer.parseInt(br.readLine());
        int network = Integer.parseInt(br.readLine());

        boolean visited[] = new boolean[computer + 1];
        int[][] adjArray = new int[computer + 1][computer + 1];

        StringTokenizer st;
        for(int i = 0; i < network; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            adjArray[x][y] = 1;
            adjArray[y][x] = 1;
        }
        int result = bfs_array(1, adjArray, visited);
        bw.write(result + "\n");
        br.close(); bw.flush(); bw.close();
    }

    public static int bfs_array(int v, int[][] adjArray, boolean[] visited){
        Queue<Integer> queue = new LinkedList<Integer>();
        int n = adjArray.length;
        int cnt = 0;

        queue.add(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            v = queue.poll();

            for (int i = 1; i < n; i++) {
                if (adjArray[v][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
