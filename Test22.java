public class Test22{
    public static void main(String[] avgs) {
        int width=0;
        for(int i=-4;i<=4;i++){
            for(int k=-5;k<=5;k++){
                if ( Math.abs(k)+Math.abs(i)>4)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.println("");
        }
    }
}
//印長方體裡面挖空菱形
//中間為基準
//行加列
/* -5 -4 -3 -2 -1 0 1 2 3 4 5
-4  9  8  7  6  5 
-3
-2
-1
0
1
2
3
4
*/
