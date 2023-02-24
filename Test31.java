//
public class Test31{ 
    public static void main(String [] args){
        int [] arr= {1,2,3,4,5,6,7};
        int x= 10;
        
    
        setVariable(x); //call by value 傳值呼叫
        System.out.println("setVarible" +x);
    
    
        setArray(arr); //call by reference 傳參考呼叫
        for(int i: arr){
            System.out.println("setArray" +i);
        }
    }        
    public static void setVariable(int x){
        x= 20;
    }    
    public static void setArray(int arr[]){
        arr [0] =20;
        }
    }