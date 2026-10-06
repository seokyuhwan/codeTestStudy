import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int winSize = Integer.parseInt(st.nextToken());

        Deque<Node> myDeque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(st.nextToken());
            while (!myDeque.isEmpty() && myDeque.getLast().value > now) {
                myDeque.removeLast();
            }
            myDeque.addLast(new Node(now, i));

            if(myDeque.getFirst().index<=i-winSize){
                myDeque.removeFirst();
            }
            bw.write(myDeque.getFirst().value+" ");
        }
        bw.flush();
        br.close();
    }

    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
