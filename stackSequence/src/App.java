import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        ArrayList<Character> resultArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int next = 1;
        for (int i = 0; i < n; i++) {
            while (next <= arr[i]) {
                stack.push(next++);
                resultArr.add('+');
            }

            if (!stack.isEmpty() && stack.peek() == arr[i]) {
                stack.pop();
                resultArr.add('-');
            } else {
                System.out.println("NO");
                return;
            }

        }
        for (char c : resultArr) {
            System.out.println(c);
        }
    }
}
