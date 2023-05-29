package com.src.practise.oog_data_structure.a_sparsearray;

/**
 * 功能:稀疏数组
 *
 * @author caojianbang
 * @date 4.1.22 9:14 PM
 */
public class SparseArray {
    public static void main(String[] args) {
        int chessArray[][] = new int[11][11];
        chessArray[1][2] = 1;
        chessArray[2][3] = 2;
        chessArray[4][5] = 2;
        //输出原始二维数组
        for (int[] row : chessArray) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        //将二维数组转化成稀疏数组
        //1.先遍历二维数组，得到非0元素个数
        int sum = 0;
        for (int i = 0; i < chessArray.length; i++) {
            for (int j = 0; j < chessArray[i].length; j++) {
                if (chessArray[i][j] != 0) {
                    sum++;
                }

            }
        }
        //2.创建稀疏数组
        int sparse[][] = new int[sum + 1][3];
        sparse[0][0] = 11;
        sparse[0][1] = 11;
        sparse[1][2] = sum;
        //3.遍历二维数组，将非0的值存放到sparse中
        int count = 0;
        for (int i = 0; i < chessArray.length; i++) {
            for (int j = 0; j < chessArray[i].length; j++) {
                if (chessArray[i][j]!=0){
                    count++;
                    sparse[count][0] = i;
                    sparse[count][1] = j;
                    sparse[count][2] = chessArray[i][j];
                }
            }
        }
        for (int i = 0; i < sparse.length; i++) {
            for (int j = 0; j < sparse[i].length; j++) {
                System.out.print(sparse[i][j]+"\t");
            }
            System.out.println();
        }
        //将稀疏数组转化成二维数组
        int chessArr2[][] = new int[sparse[0][0]][sparse[0][1]];

        for (int i = 1; i <sparse.length ; i++) {
            chessArr2[sparse[i][0]][sparse[i][1]]=sparse[i][2];
        }
        //恢复过后的而为数组
        for (int[] row:chessArr2
             ) {
            for (int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}