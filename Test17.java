public class Test17{
    public static void main (String[] avgs){
        for(int i =0 ;i <= 5; i++){
            for(int j = 0; j < 6; j++){
                if(j < 5-i){
                System.out.printf("*");
                }
                else {
                    System.out.printf("%d",-(4-j-i));
                }
            }
            System.out.println();
        }
    }
}
