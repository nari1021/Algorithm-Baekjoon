import java.io.*;

public class Main3029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] now = br.readLine().split(":");
        String[] schedule = br.readLine().split(":");

        int[] nowArr = new int[3];
        int[] scheArr = new int[3];

        for(int i = 0; i < 3; i++) {
            nowArr[i] = Integer.parseInt(now[i]);
            scheArr[i] = Integer.parseInt(schedule[i]);
        }

        int s = scheArr[2] - nowArr[2];
        String Sec = "";

        if(s < 0) {
            s += 60;
            scheArr[1]--;
        }
        if(s < 10)  Sec = "0";
        Sec += Integer.toString(s);


        int m = scheArr[1] - nowArr[1];
        String Min = "";

        if(m < 0) {
            m += 60;
            scheArr[0]--;
        }
        if(m < 10)  Min = "0";
        Min += Integer.toString(m);


        int h = scheArr[0] - nowArr[0];
        String Hour = "";

        if(h < 0)   h += 24;
        if(h < 10)  Hour = "0";
        Hour += Integer.toString(h);
        if(h == 0 && m == 0 && s == 0)  Hour = "24";
        

        bw.write(Hour + ":" + Min + ":" + Sec + "\n");
        br.close(); bw.flush(); bw.close();
    }
}
