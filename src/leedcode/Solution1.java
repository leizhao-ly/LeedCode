package leedcode;

public class Solution1 {
    static int numWays(int n){
        /**
         * 首先定义一个数组，数组的长度为101
         */
        int[] num=new int[101];
        //声明数组前三个已经确定的值
        num[0]=1;
        num[1]=1;
        num[2]=2;
        return ways(num,n);
    }
    //重来处理数组的
    static int ways(int[] num,int n){
        if(num[n]!=0){
            return num[n];
        }
        num[n]=(ways(num,n-1)+ways(num,n-2)) % 1000000007;
        return num[n];
    }

    public static void main(String[] args) {
        System.out.println(numWays(100));
    }
}
