package Test;

public class Demo {
        /*
            设计一个方法，给定两个数字，需要判断这两个范围之间的质数
         */

     //需要两个参数 int(first,end)   2-100
    static int[] judge(int first,int end){
        if(first<2||end<first){
            System.out.println("你输入有问题");
        }
        //记录质数的个数
        int count=0;
        //外层循环控制次数
        for(int i=first;i<end;i++){
            int flag=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    //说明能够被除尽，不是质数
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                //说明还是质数
                count++;
            }
        }
        System.out.println(count);
        //创建一个数组
        int[] primes=new int[count];
        //用来记录索引
        int index=0;
        for(int i=first;i<end;i++){
            int flag=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                primes[index++]=i;
            }
        }
        return primes;
    }


    public static void main(String[] args){
        Demo demo=new Demo();
        int[] primes=demo.judge(2,100);
        for(int p:primes){
            System.out.print(p+" ");
        }
    }

}
