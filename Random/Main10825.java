import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main10825 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[][] score = new String[N][4];

        /* Input */
        for (int i = 0; i < N; i++) {
            score[i] = br.readLine().split(" ");
        }

        Arrays.sort(score, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                if (Integer.parseInt(s1[1]) == Integer.parseInt(s2[1])) {
                    if (Integer.parseInt(s1[2]) == Integer.parseInt(s2[2])) {
                        if (Integer.parseInt(s1[3]) == Integer.parseInt(s2[3])) {
                            //국영수 점수가 모두 같다면 이름의 사전 오름차순
                            return s1[0].compareTo(s2[0]);
                        }
                        //국어 점수와 영어 점수가 같을 때, 수학 점수의 내림차순
                        return Integer.compare(Integer.parseInt(s2[3]), Integer.parseInt(s1[3]));
                    }
                    //국어 점수가 같을 때, 영어 점수의 오름차순
                    return Integer.compare(Integer.parseInt(s1[2]), Integer.parseInt(s2[2]));
                }
                //국어 점수의 내림차순
                return Integer.compare(Integer.parseInt(s2[1]), Integer.parseInt(s1[1]));
            }
        });

        /* Output */
        for (int i = 0; i < N; i++) {
            bw.write(score[i][0] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}