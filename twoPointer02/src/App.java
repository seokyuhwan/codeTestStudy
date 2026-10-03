import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int firstPoint = 0;
        int secondPoint = n - 1;
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        while (firstPoint < secondPoint) {
            int sum = arr[firstPoint] + arr[secondPoint];
            if (sum == m) {
                count++;
                firstPoint++;
                secondPoint--;
            } else if (sum < m) {
                firstPoint++;
            } else {
                secondPoint--;
            }
        }
        System.out.println(count);
        br.close();
    }
}
