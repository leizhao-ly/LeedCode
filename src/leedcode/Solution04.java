package leedcode;

/**
 * @author LY
 */
public class Solution04 {
    /**
     * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     *
     * 来源：力扣（LeetCode）
     * [
     *   [1,   4,  7, 11, 15],
     *   [2,   5,  8, 12, 19],
     *   [3,   6,  9, 16, 22],
     *   [10, 13, 14, 17, 24],
     *   [18, 21, 23, 26, 30]
     * ]
     *
     * 来源：力扣（LeetCode）
     * 给定 target = 5，返回 true。
     *
     * 给定 target = 20，返回 false。
     * @param matrix
     * @param target
     * @return
     */
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int length=matrix.length;
        for (int i=0;i<length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean findNumberIn2DArray2(int[][] matrix, int target) {
        int row=0;
        //进行严谨性判断，防止传[][]的二维数组
        if(matrix.length<=0){
            return false;
        }
        int col=matrix[0].length-1;
        while (true){
            if(col<0 || row>=matrix.length){
                return false;
            }
            if(target == matrix[row][col]){
                return true;
            }
            if(target< matrix[row][col]){
                col--;
                continue;
            }
            if(target>matrix[row][col]){
                row++;
                continue;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix=new int[][]{
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        boolean result=findNumberIn2DArray2(matrix,1);
        System.out.println(result);
    }
}
