package stack;

/**
 * 有序列表的合并
 * 例如:
 *  [1,3,6,7,9]
 *  [2,4,5,8,10,12]
 */
public class ArrayMerge {

    public static int[] merge(int[] arr1,int[] arr2){
        if(arr1 == null){
            return arr2;
        }
        if(arr2 == null){
            return arr1;
        }
        int[] newArray=new int[arr1.length+arr2.length];
        //记录第一个数组的index
        int index1=0;
        //记录第二行的index
        int index2=0;
        //记录结果的index
        int index=0;
        while(index1<arr1.length && index2<arr2.length){
            /**
             *  [1,3,6,7,9]
             *   [2,4,5,8,10,12]
             */
            if(arr1[index1]>arr2[index2]){
                newArray[index++]=arr2[index2++];
            }else {
                newArray[index++]=arr1[index1++];
            }
            if(index1 == arr1.length){
                //说明a已经没有了
                while(index2<arr2.length){
                    newArray[index++]=arr2[index2++];
                }
            }else if(index2 == arr2.length){
                while ((index1<arr1.length)){
                    newArray[index++]=arr1[index1++];
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr1=new int[]{1,3,6,7,9};
        int[] arr2=new int[]{2,4,5,8,10};
        int[] result=merge(arr1,arr2);
        for(int r:result){
            System.out.print(r+" ");
        }
    }
}
