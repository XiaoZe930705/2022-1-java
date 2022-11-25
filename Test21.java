public class Test21{
    public static void main(String[] avgs) {
        int width=0;
        for(int i=-4;i<=4;i++){
            for(int k=-5;k<=5;k++){
                if ( Math.abs(k)>width)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.println("");
            
            if ( i<0)
                width++;
            else 
                width--;
            
            
        }
    }
}