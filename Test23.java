/*計算計程車車資
  7公里內85元
  7公里以後，每超過1公里加5元
  請問乘坐50公里車資為多少*/
import java.util.Scanner;
public class Test23{
    public static void main(String[] avgs){
        int i=0;
        int k=85;
        int a=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter interger");
        i=input.nextInt();
        
        if(i<=7)
            System.out.printf("%d",k);
        else if(i>7){
            a=k+(i-7)*5;
            System.out.printf("%d",a);
        }
    }
}
