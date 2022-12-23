//陣列反轉
public class Test26{
    public static void main(String[] args){
        int[] myArr= {7,5,4,8,1,2};
        
        for(int i=0;i<myArr.length /2;i++){
            int temp=myArr[i];
            myArr[i]=myArr[myArr.length-1-i];
            myArr[myArr.length-1-i]=temp;
        }
        
        for(int i=0;i<myArr.length;i++){
            System.out.println(myArr[i]);
        }
    }
}
