import java.io.*;
import java.util.*;

public class Main1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Integer> deque = new LinkedList<Integer>();
        StringTokenizer st;
        int cnt = 0;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++){
            deque.offer(i);
        }

        int tmp = 0;
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            tmp = Integer.parseInt(st.nextToken());

            if(deque.indexOf(tmp) <= deque.size() / 2) {
                while (tmp != deque.peek()) {
                    deque.offer(deque.poll());
                    cnt++;
                }
            }
            else {
                while (tmp != deque.peek()){
                    deque.offerFirst(deque.pollLast());
                    cnt++;
                }
            }
            deque.poll();
        }
        bw.write(cnt + "\n");
        br.close(); bw.flush(); bw.close();
    }
}
