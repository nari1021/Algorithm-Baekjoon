import java.io.*;
import java.util.*;

public class Main5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            
            // [], 구분자로 문자를 구분함.
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
            /**
             * String input = br.readLine();
             * String[] arr = input.split("[\\[\\]\\,]");
             */

            LinkedList<Integer> deque = new LinkedList<Integer>();

            // deque에 숫자들을 넣음
            for(int i = 0; i < n; i++) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            boolean check = true;                       // check :: reverse 방향을 체크하는 변수
            StringBuilder sb = new StringBuilder();     // 결과값

            for(int i = 0; i < p.length(); i++) {
                // check 값을 반대로 바꿔줌
                if (p.charAt(i) == 'R')
                    check = !check;
                    
                else if (p.charAt(i) == 'D'){
                    if (deque.isEmpty()) {      // deque가 비어있다면 error 를 반환
                        sb.append("error");
                        break;
                    }
                    else {
                        if (check)  // 뱡향이 올바르다면 앞에서부터 제거
                            deque.poll();
                        else        // 방향이 반대로 뒤집혀졌다면 뒤에서부터 제거
                            deque.pollLast();
                    }
                }
            }

            // 결과를 반환할 sb가 비어있다면 (sb에 "error" 문자열이 들어있지 않음을 확인)
            if (sb.length() == 0) {
                sb.append("[");
            
                // deque 값이 1개 이상이라면
                if(deque.size() > 0) {
                    // 정방향이라면 (check == 1)
                    if (check) {
                        // 앞에서부터 값을 하나 뺌
                        sb.append(deque.poll());
                        // deque가 비어있지 않다면
                        while (!deque.isEmpty())
                            // 먼저 콤마를 넣고 그 다음 맨 앞의 값을 빼서 sb에 넣음.
                            sb.append(",").append(deque.poll());
                    }
                    else {  // 방향이 뒤집어졌다면
                        // 뒤에서부터 값을 빼서 sb에 넣음.
                        sb.append(deque.pollLast());
                        while (!deque.isEmpty())
                            // 먼저 콤마를 넣고 그 다음 맨 뒤의 값을 빼서 sb에 넣음.
                            sb.append(",").append(deque.pollLast());
                    }
                }
                sb.append("]");
            }
            bw.write(sb + "\n");
        }
        br.close(); bw.flush(); bw.close();
    }
}
