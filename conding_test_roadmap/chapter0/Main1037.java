import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] array = new int[N];
        // 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다.
        // 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            array[i] = value;
        }
        Arrays.sort(array);

        if (N % 2 == 0) {
            System.out.println(array[0] * array[N - 1]);
        } else {
            System.out.println(array[N / 2] * array[N / 2]);
        }
    }
}
