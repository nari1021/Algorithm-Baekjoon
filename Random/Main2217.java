import java.io.*;

public class Main2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int min = 100000;
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if (min > arr[i])
                min = arr[i];
        }
        bw.write(min * N + "\n");
        br.close(); bw.flush(); bw.close();
    }
}
