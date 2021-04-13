import java.io.*;
import java.util.LinkedList;

public class Main2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Integer> queue = new LinkedList<Integer>();

        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++){
            queue.push(i);
        }

        while (queue.size() > 1) {
            queue.pollLast();
            if (queue.size() == 1)
                break;
            int check = queue.pollLast();
            queue.push(check);
        }
        bw.write(queue.poll() + "\n");
        br.close(); bw.flush(); bw.close();
    }
}
