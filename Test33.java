//多載
public class Test33{ 
    public static void main(String [] args){
        int x= 0;
        int y=0;
        System.out.println("x:"+ setV(x) );
        System.out.println("x,y:"+ setV(x,3) );
        System.out.println("y:"+ setV(y));
    }
    
    public static int setV(int x){
        return x= 20;
        
    }
    public static int setV (int x, int y){
        return x =40;
    }
    public static  double setV(double x){
        return x = 30.0;
    }
}