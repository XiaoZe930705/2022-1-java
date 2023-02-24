
public class Test32{ 
    public static void main(String [] args){
        int x=10;
        int y= x;
        y = 20;
    
        System.out.println("Varible: x"+x);
        System.out.println("Varible: y"+y);
        
        
        int [] arr ={1,2,3,4,5,6,7};
        int [] arr2=arr;
        arr2[0] = 10;
        System.out.println("arr[0]:" +arr[0]);
        System.out.println("arr2[0]:" +arr2[0]);
        
        }
    }