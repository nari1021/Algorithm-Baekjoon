import java.io.*;
import java.util.*;

public class Main2606 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int computer = Integer.parseInt(br.readLine());
        int network = Integer.parseInt(br.readLine());

        // 인접 행렬을 이용한 BFS로 풀이
        int[][] adjArray = new int[computer + 1][computer + 1];
        boolean visited[] = new boolean[computer + 1];

        StringTokenizer st;
        for(int i = 0; i < network; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 양방향 그래프이므로 (x, y) = (y, x) = 1 로 넣어줌
            adjArray[x][y] = 1;
            adjArray[y][x] = 1;
        }

        // 1번 컴퓨터가 웜 바이러스에 걸렸을 때,
        // 1번 컴퓨터를 통해 웜 바이러스에 걸리게되는 컴퓨터의 수를 출력하므로
        // v = 1로 들어감
        int result = bfs_array(1, adjArray, visited);
        bw.write(result + "\n");
        br.close(); bw.flush(); bw.close();
    }

    // 인접행렬로 구현한 BFS 메인 코드
    public static int bfs_array(int v, int[][] adjArray, boolean[] visited){
        Queue<Integer> queue = new LinkedList<Integer>();
        int n = adjArray.length;
        
        // 연결된 컴퓨터의 수
        int cnt = 0;

        queue.add(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            v = queue.poll();

            for (int i = 1; i < n; i++) {
                if (adjArray[v][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    
                    // 1과 연결된 컴퓨터의 개수를 모두 센다
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
