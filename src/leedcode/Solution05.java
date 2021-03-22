package leedcode;

public class Solution05 {
    /**
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     * 输入：s = "We are happy."
     * 输出："We%20are%20happy."
     * @param s
     * @return
     */
    public static String replaceSpace(String s) {
        return s.replaceAll(" ","%20");
    }

    /**
     * 如果不是用String 的自带方法，那应该怎么做
     * @param s
     */
    public static String replaceSpace1(String s){
        char[] chars=new char[s.length()];
        for (int i=0;i<s.length();i++){
            chars[i]=s.charAt(i);
        }
        char[] arr=new char[30000];
        //用来记录真实索引
        int start=0;
        for(int i=0;i<s.length();i++){
            if(chars[i] !=' '){
                arr[start]=chars[i];
                start++;
                continue;
            }
                arr[start] = '%';
                arr[start + 1] = '2';
                arr[start + 2] = '0';
                start += 3;

        }
        return new String(arr,0,start);
    }

    public static void main(String[] args) {
//        System.out.println(replaceSpace("We are happy."));
        System.out.println(replaceSpace1("We are happy."));
    }
}
