import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int startPoint =1;
        int endPoint =1;
        int sum=1;
        int count=0;
        int n = sc.nextInt();
        while(endPoint<=n){
            if(sum<n){
                endPoint++;
                sum+=endPoint;
            }else if(sum>n){
                sum-=startPoint;
                startPoint++;
            }else{
                count++;
                endPoint++;
                sum+=endPoint;
            }
        }
        System.out.println(count);
    }
}
