import java.io.*;
import java.util.*;

public class Main6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Long> stack = new Stack<>();
        long cnt = 0;

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            Long height = Long.parseLong(br.readLine());

            while (!stack.isEmpty()) {
                if (stack.peek() <= height)
                    stack.pop();
                else
                    break;
            }
            cnt += stack.size();
            stack.push(height);
        }
        bw.write(cnt + "\n");
        br.close(); bw.flush(); bw.close();
    }
}
