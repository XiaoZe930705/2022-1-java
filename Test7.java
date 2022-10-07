import java.util.Scanner;
public class Test7 {
    public static void main(String[] args) {
        int num1 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        num1 = input.nextInt();
        if ( num1>100 | num1<0 ) {
                System.out.println("使用者輸入錯誤");
        }
        else {
        switch ( num1/10 ) {
            case 9 :
            case 10 :
                System.out.println("A");
                break ;
            
            case 8 :
                System.out.println("B");
                break ;
            
            case 7 :
                System.out.println("C");
                break ;
            
            case 6 :
                System.out.println("D");
                break ;
                
            default :
                System.out.println("E");
                break ;     
            }
        }
    }
}
