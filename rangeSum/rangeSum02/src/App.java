import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int arrSize = Integer.parseInt(st.nextToken());
        int noQuiz = Integer.parseInt(st.nextToken());
        int[][] arr = new int[arrSize + 1][arrSize + 1];
        long sumArr[][] = new long[arrSize + 1][arrSize + 1];
        long [] result = new long[noQuiz];
        for (int i = 1; i <= arrSize; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= arrSize; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 합쳐서 저장해야하지않을까..
        for (int i = 1; i <= arrSize; i++) {
            for (int j = 1; j <= arrSize; j++) {
                sumArr[i][j] = arr[i][j] + sumArr[i][j - 1] + sumArr[i - 1][j] - sumArr[i - 1][j - 1];
            }
        }
        // 문제 입력받고 출력
        for (int i = 0; i < noQuiz; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            long answer = sumArr[x2][y2] - sumArr[x1 - 1][y2] - sumArr[x2][y1 - 1] + sumArr[x1 - 1][y1 - 1];
            
            result[i]=answer;
            }
        for (int i=0; i<noQuiz; i++){
            System.out.println(result[i]);
        }
    }
}
