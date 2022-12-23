public class Test28{
    public static void main(String[] args){
        int[] myArr= {7,5,4,9,8,1,2};
        int[] flag=new int[myArr.length];
        int max =myArr[0];
        int min =myArr[0];
        int sum =0;
        int med =0;
        int flag_count=1;
        
        for(int i=0;i<myArr.length ;i++){
            if(myArr[i]>max){
                max=myArr[i];
            }
            if(myArr[i]<min){
                min=myArr[i];
            }
            sum+=myArr[i];
        }
        for(int i=0;i<4;i++){
            int flag_min=1000;
            int flag_min_index=0;
            for(int j=0;j<myArr.length;j++){
                if(myArr[j] < flag_min && flag[j]==0){
                    flag_min= myArr[j];
                    flag_min_index = j;
                    
                }
            }
            flag[flag_min_index] = flag_count;
            flag_count++;
            med =myArr[flag_min_index];
        }
            
            System.out.println("max="+max);
            System.out.println("min="+min);
            System.out.println("The average="+sum*1.0/ myArr.length);
            System.out.println("med="+med);
    }
}