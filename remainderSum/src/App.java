import java.io.*;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long [] remainder= new long[m];
        long [] sumArr= new long[n+1];
        long result=0;
        st= new StringTokenizer(br.readLine());
        for(int i=1; i<sumArr.length; i++){
            sumArr[i]=(sumArr[i-1]+Integer.parseInt(st.nextToken()))%m;
        }
        for(int i=0; i<sumArr.length; i++){
            remainder[(int) sumArr[i]]++;
        }        
        for(int i=0; i<remainder.length; i++){
            if(remainder[i]>1){
                result =result+(remainder[i]*(remainder[i]-1))/2;
            }
        }
        System.out.println(result);
    }
}
