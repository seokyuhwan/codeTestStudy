import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String str = br.readLine();
        if (str.length() != a) {
            System.out.println("invalid input");
        } else {
            int[] arr = new int[str.length()];

            for (int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(i) - '0';
            }
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            System.out.println(sum);
        }
    }
}
