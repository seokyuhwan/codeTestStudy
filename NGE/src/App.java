import java.util.*;
import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int [] result = new int[n];
        Stack<Integer> calStack = new Stack<>();
        calStack.push(0);
        for(int i=1; i<n; i++){
            if(arr[calStack.peek()]>=arr[i]){
                calStack.push(i);
            }else{
                while(!calStack.isEmpty()&&arr[calStack.peek()]<arr[i]){
                    result[calStack.pop()]=arr[i];
                }
                calStack.push(i);
            }
        }
        while(!calStack.isEmpty()){
            result[calStack.pop()]=-1;
        }
        for(int i=0; i<n; i++){
            System.out.println(result[i]+" ");
        }
    }
}
