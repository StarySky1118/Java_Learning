package diagonalorder;

public class Solution {
    public static int[] findDiagonalOrder(int[][] mat) {
        int width = mat[0].length; // 矩阵宽
        int height = mat.length; // 矩阵高
        int totalNumOfLine = width + height - 1; // 需要遍历的总线数
        int[] retValue = new int[width*height]; // 返回数组
        boolean flag = true; // true:向右上遍历 false:向左下遍历
        int count = 0; // 遍历数目

        for(int i = 0; i < totalNumOfLine; i++) { // 遍历每一条线
            // 确定遍历开始横坐标

            if(flag) { // 向右上遍历
                for(int j = i; j >=0; j--) { // 横坐标从i减到0
                    retValue[count] = mat[j][i-j];
                    count++;
                }
                flag = false;
            } else { // 向左下遍历
                // 确定开始横坐标

                for(int j = 0; j <= i; j++) { // 横坐标从0加到i
                    retValue[count] = mat[j][i-j];
                    count++;
                }
                flag = true;
            }
        }

        return retValue;
    }
}
