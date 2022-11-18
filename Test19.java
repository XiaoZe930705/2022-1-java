public class Test19{
    public static void main (String[] avgs){
        for(int i =0 ;i <= 5; i++){
            for(int j = i -4; j <= i- 4 + 5 ; j++){
                if(j < 1 ){
                System.out.printf("*");
                }
                else {
                    System.out.printf("%d",j);
                }
            }
            System.out.println();
        }
    }
}
