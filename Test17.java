public class Test17{
    public static void main (String[] avgs){
        for(int i =0 ;i <= 6; i++){
            int num =1;
            for(int j = 0; j < 6; j++){
                if(j < 6-i){
                System.out.printf("*");
                }
                else {
                    System.out.printf("%d",num);
                    num++;
                }
            }
            System.out.println();
        }
    }
}
