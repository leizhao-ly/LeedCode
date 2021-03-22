package leedcode;

import sun.text.normalizer.UCharacter;

import java.util.HashSet;

public class LeedCode {
    /*字符串压缩，利用字符串重复出现的次数，编写一种方法，实现基本的字符串压缩功能
        注意若压缩后的字符串没有变短，则返回原先的字符串
       input: aabcccccaaa
       output：a2b1c5a3
     */
    public String compressString(String s){
        if(s==null||s.length()<=2){
            return s;
        }
        //将字符串变成字符数组
        char[] chars=s.toCharArray();
        //返回最后的结果
        String result="";
        //记录一个字段的开始的index
        int count=1;
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                count++;
            }else{
                //说明是两个字符数组前一个和后一个不同了，那么就需要进行操作
                //相同字符的个
                result+=""+chars[i]+count;
                count=1;
            }
        }
            return result;
    }

    public String compressString1(String s){
        if(s==null||s.length()<=2){
            return s;
        }
        char[] chars=s.toCharArray();
        StringBuilder builder=new StringBuilder().append(chars[0]);
        int count=1;
        for(int i=1;i<s.length();i++){
            if(chars[i]==chars[i-1]){
                count++;
            }else {
                builder.append(count).append(chars[i]);
                count = 1;
            }
        }
        return builder.append(count).length()<s.length()? builder.toString():s;
    }

    /*
        两数之和，给定nums=[2,7,11,15],target=9
        因为nums[0],nums[1]=2+7=9,所以返回[0,1]
     */

    public String two_num(int[] nums,int target){
        StringBuilder builder=new StringBuilder().append("[");
        for(int i=0;i<nums.length;i++){
            if(nums[i]+nums[i+1]==target){
                return builder.append(i).append(",").append(i+1).append("]").toString();
            }
        }
        return null;
    }

    //设计一个私有的方法，判断给定的字符串是否是从0到9都会出现一次
    private int judge(String str){
        char[] chars=str.toCharArray();
        HashSet<Character> hashSet=new HashSet<>();
        for(char c:chars){
            hashSet.add(c);
        }
        return hashSet.size();
    }

    /*
    我年龄的立方是个 4 位数。我年龄的 4 次方是个 6 位数。这 10 个数字正好包含了从 0 到 9 这 10 个数字
    ，每个都恰好出现 1 次。” 请你推算一下，他当时到底有多年轻
     */
    public int year(){
        for(int i=10;i<100;i++){
            int a=i*i*i;
            int b=a*i;
            if((a+"").length()!=4){
                continue;
            }
            if((b+"").length()!=6) {
                continue;
            }
            //如果走到一个说明已经满足了以上的两个条件
            System.out.println(i + " = " + a + " " + b);

            int count=this.judge(""+a+b);
            if(count==10){
                return i;
            }
        }
        return 999;
    }
}
