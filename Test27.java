/*尋找最大值
尋找最小值
尋找平均數
尋找中位數*/
public class Test27{
    public static void main(String[] args){
        int[] myArr= {7,5,4,9,8,1,2};
        
        int max =myArr[0];
        int min =myArr[0];
        int sum =0;
        for(int i=0;i<myArr.length ;i++){
            if(myArr[i]>max){
                max=myArr[i];
            }
            if(myArr[i]<min){
                min=myArr[i];
            }
            sum+=myArr[i];
        }
            
            System.out.println("max="+max);
            System.out.println("min="+min);
            System.out.println("The average:"+sum*1.0/ myArr.length);
            System.out.println(myArr[1]);
    }
}