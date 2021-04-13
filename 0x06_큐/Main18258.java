import java.io.*;
import java.util.LinkedList;

public class Main18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Integer> queue = new LinkedList<Integer>();

        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String msg = br.readLine();
            String[] arr = msg.split(" ");

            switch(arr[0]) {
                case "push":
                    queue.offer(Integer.parseInt(arr[1]));
                    break;
                case "pop":
                    if (queue.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(queue.poll() + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty())
                        bw.write("1\n");
                    else
                        bw.write("0\n");
                    break;
                case "front":
                    if (queue.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(queue.peek() + "\n");
                    break;
                case "back":
                    if (queue.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(queue.peekLast() + "\n");
                    break;
            }
        }
        br.close(); bw.flush(); bw.close();
    }
}
