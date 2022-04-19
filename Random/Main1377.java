import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1377 {
    public static void swap(int array[], int a, int b) {
        int temp = array[a];
        array[a]= array[b];
        array[b] = temp;
    }
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* Input */
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N+1];

        array[0] = 0;
        for (int i = 1; i < N+1; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        Boolean changed = false;
        for (int i = 1; i <= N+1; i++) {
            changed = false;
            for (int j = 1; j <= N-i; j++) {
                if (array[j] > array[j+1]) {
                    changed = true;
                    swap(array, j, j+1);
                }
            }
            if (changed == false) {
                System.out.println(i);
                break;
            }
        }
        br.close();
    }
}