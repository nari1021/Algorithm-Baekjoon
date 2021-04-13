import java.io.*;
import java.util.*;

public class Main3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        int cnt = 0;

        for (int i=0; i<n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        // 오름차순으로 정렬을 통해서 경우의 수를 줄임
        Arrays.sort(nums);
        
        int start = 0;
        int end = n-1;

        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == x) {
                cnt++;
                end--;
                start++;
            }
            else if (sum > x) end--;
            else if (sum < x) start++;
        }
        bw.write(cnt + "\n");
        br.close(); bw.flush(); bw.close();
    }
}
