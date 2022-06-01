import java.io.*;
import java.util.*;

public class Main11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] parents = new int[N + 1];

        // 인접리스트를 이용한 BFS
        LinkedList<Integer>[] adjList = new LinkedList[N + 1];
        for(int i = 0; i <= N; i++)
            adjList[i] = new LinkedList<Integer>();

        StringTokenizer st;
        for(int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            adjList[x].add(y);
            adjList[y].add(x);
        }

        // 루트를 1이라고 정하므로 v=1
        bfsList(1, adjList, parents);

        // 부모 노드 번호를 2번 노드부터 순서대로 출력
        for(int i = 2; i <= N; i++)
            bw.write(parents[i] + "\n");

        br.close(); bw.flush(); bw.close();
    }

    // 인접리스트를 이용한 BFS
    public static void bfsList(int v, LinkedList<Integer>[] adjList, int[] parents) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(v);

        // 기존 visited 배열 대신 parents 배열로 바꿔서 저장
        parents[v] = 1;

        while(!q.isEmpty()) {
            v = q.poll();

            Iterator<Integer> iter = adjList[v].listIterator();
            while(iter.hasNext()) {
                int w = iter.next();
                if(parents[w] == 0) {
                    q.add(w);

                    // 부모노드를 저장
                    parents[w] = v;
                }
            }
        }
    }
}
