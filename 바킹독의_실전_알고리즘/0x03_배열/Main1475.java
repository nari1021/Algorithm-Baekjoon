import java.io.*;

public class Main1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        int[] nums = new int[10];
        int idx = 0;
        int cnt = 0;
        int check = 0;

        for(int i = 0; i < N.length(); i++){
            idx = N.charAt(i) - '0';
            nums[idx]++;
        }

        check = (nums[6] + nums[9]);
        nums[6] = check / 2;
        nums[9] = check / 2;

        if (check % 2 == 1){
            nums[6]++;
            nums[9]++;
        }

        for (int i : nums) {
            cnt = Math.max(cnt, i);
        }
        bw.write(cnt + "\n");
        br.close(); bw.flush(); bw.close();
    }
}
