import java.io.*;
import java.util.Arrays;

public class Main2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] num = new int[9];
        int sum = 0;
        boolean check = false;

        // 입력 받음과 동시에 sum에 다가 전체 합을 더해서 저장
        for (int i = 0; i < 9; i++) {
            num[i] = Integer.parseInt(br.readLine());
            sum += num[i];
        }

        // 2개의 수를 찾기위해서 i = 0 ~ 7까지 
        for (int i = 0; i < 8; i++) {
            // j = 1 ~ 8까지 넣어보면서 찾아봄
            for (int j = i + 1; j < 9; j++) {
                // 총 합 sum에서 2개의 수를 뺐을 때 100이면서
                // check 값이 false 인 경우에만 해당함
                // check를 하는 이유는 답이 2개 이상일 경우
                // 가장 먼저 찾은 2개의 값을 제외하고 출력하기 위함.
                if (sum - (num[i] + num[j]) == 100 && check == false){
                    num[i] = 0;
                    num[j] = 0;
                    check = true;
                    break; 
                }
            }
            if (check) break;
        }

        // 답이 정렬되어야 하므로 sort 시켜줌
        Arrays.sort(num);
        
        // i 값이 0이 아닌 경우 num배열의 값을 모두 출력
        for (int i : num){
            if (i != 0)
                bw.write(i + "\n");
        }

        br.close(); bw.flush(); bw.close();
    }
}