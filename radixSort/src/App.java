import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 170, 45, 75, 90, 802, 24, 2, 66, 9835 };
        radixSort(arr, 5);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void radixSort(int[] arr, int maxNum) {
        Queue<Integer>[] bucket = new LinkedList[10];

        for (int i = 0; i < 10; i++) {
            bucket[i] = new LinkedList<>();
        }

        int digit = 1;

        for (int i = 1; i < maxNum; i++) {

            // 현재 자릿수를 기준으로 버킷에 삽입
            for (int num : arr) {
                int index = (num / digit) % 10;
                bucket[index].offer(num);
            }

            // 버킷에서 꺼내 배열에 저장
            int index = 0;

            for (int j = 0; j < 10; j++) {
                while (!bucket[j].isEmpty()) {
                    arr[index++] = bucket[j].poll();
                }
            }

            digit *= 10;
        }
    }

}
