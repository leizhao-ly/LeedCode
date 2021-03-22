package Test;

public class Text1 {


    /**
     * //选择排序
     * [4,3,5,2,1]
     */
    public static int[] sort(int[] arr){
        //严谨性判断
        if(arr == null || arr.length==0){
            return null;
        }

        for(int i=0;i<arr.length-1;i++) {
            //记录第一个数的位置
            int index = i;
            //记录第二个数的位置
            int num = i;
            for (int j = 1+i; j < arr.length; j++) {
                if (arr[num] > arr[j]) {
                    num = j;
                }
            }
            //一轮循环完毕之后就知道最小的位置了
            if (num != index) {
                //交换两边的位置的数字
                int temp = arr[index];
                arr[index] = arr[num];
                arr[num] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr=sort(new int[]{4,3,5,2,1,15,13,23,21,17});
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
