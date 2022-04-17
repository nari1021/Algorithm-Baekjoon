import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main10610 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* Input */
        String N = br.readLine();
        
        /* 3의 배수 판정을 위해 각 자리 숫자를 더함 */
        int sum = 0;
        for(int i = 0; i < N.length(); i ++) {
            sum += N.charAt(i);
        }

        /* 10의 배수가 아니거나 3의 배수가 아니라면 */
        if (!N.contains("0") || sum % 3 != 0) {
            System.out.println("-1");
            return;
        }

        char[] array = N.toCharArray();
         // 오름차순 정렬
        Arrays.sort(array);

		StringBuilder sb = new StringBuilder();
		// 가장 큰 수를 만들어야 하므로, 맨 끝의 숫자를 맨 앞으로 옮겨서 저장한다.
		for(int i = array.length - 1; i >= 0; i--) {
			sb.append(array[i]);
		}
        
        System.out.println(sb.toString());
        br.close();
    }
}