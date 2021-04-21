import java.io.*;
import java.util.*;

public class Main2178 {
    static int N, M;
    static String[] input;
    static int[][] dist;
    static boolean[][] visited;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        dist = new int[N][M];
        visited = new boolean[N][M];
        input = new String[N];
        for(int i=0; i<N; i++){
            input[i] = br.readLine();
        }

        bfs(0, 0);
        bw.write(dist[N-1][M-1] + "\n");
        br.close(); bw.flush(); bw.close();
    }

    public static void bfs(int x, int y) {
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++)
                dist[i][j] = -1;
        }

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(x);
        q.add(y);
        dist[x][y] = 1;
        visited[x][y] = true;

        while(!q.isEmpty()) {
            x = q.poll();
            y = q.poll();

            for(int k = 0; k < 4; k++) {
                int nx = x + dir[k][0];
                int ny = y + dir[k][1];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if (input[nx].charAt(ny) == '0')    continue;
                if (visited[nx][ny])    continue;
                q.add(nx);
                q.add(ny);
                visited[nx][ny] = true;
                dist[nx][ny] = dist[x][y] + 1;
            }
        }
    }
}
