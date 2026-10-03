import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for (int i=0; i < n; i++) {
            int firstPoint = 0;
            int secondPoint = n - 1;
            int findPoint=arr[i];
            while (firstPoint < secondPoint) {
                int sum = arr[firstPoint] + arr[secondPoint];
                if (sum == findPoint) {
                    if (firstPoint != i && secondPoint != i) {
                        count++;
                        break;
                    } else if (firstPoint == i) {
                        firstPoint++;
                    } else if (secondPoint == i) {
                        secondPoint--;
                    }
                } else if (sum < findPoint) {
                    firstPoint++;
                } else
                    secondPoint--;
            }
        }
        System.out.println(count);
        br.close();
    }
}
