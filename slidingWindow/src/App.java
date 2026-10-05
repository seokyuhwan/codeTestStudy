import java.io.*;
import java.util.*;
//다시해보기
public class App {

    static int minValue[];
    static int myArr [];
    static int check;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char ACGT[] = new char[n];
        minValue = new int[4];
        myArr = new int[4];
        check = 0;
        int result = 0;
        ACGT = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            minValue[i] = Integer.parseInt(st.nextToken());
            if (minValue[i] == 0) {
                check++;
            }
        }
        for (int i = 0; i < m; i++) {
            Add(ACGT[i]);
        }
        if (check == 4) {
            result++;
        }
        for (int i = m; i < n; i++) {
            int j = i - m;
            Add(ACGT[i]);
            Remove(ACGT[j]);
            if (check == 4) {
                result++;
            }
        }
        System.out.println(result);

        br.close();
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == minValue[0]) {
                    check++;
                }
                break;

            case 'C':
                myArr[1]++;
                if (myArr[1] == minValue[1]) {
                    check++;
                }
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == minValue[2]) {
                    check++;
                }
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == minValue[3]) {
                    check++;
                }
                break;
        }
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == minValue[0]) {
                    check--;
                }
                myArr[0]--;
                break;

            case 'C':
                if (myArr[1] == minValue[1]) {
                    check--;
                }

                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == minValue[2]) {
                    check--;
                }

                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == minValue[3]) {
                    check--;
                }

                myArr[3]--;
                break;
        }
    }
}
