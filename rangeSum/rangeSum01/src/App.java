import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        long arr[]=new long[a+1]; //int arr[] = new int[a + 1];<<누적합 범위 부족// arr[0]=0

        st = new StringTokenizer(br.readLine());
        long result[] = new long[b];

        for (int i = 1; i <= a; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            result[i] = arr[k] - arr[j - 1];

        }
        for (int i = 0; i < b; i++) {
            System.out.println(result[i]);
        }
    }
}
