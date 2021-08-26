package jianzhioffer;

import org.junit.Test;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵：
 */
public class Offer19 {

    @Test
    public  void main() {
        int [][] a={    {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        int [][] bd={    {1,2,3},
                {5,6,7},
                {9,10,11}};
        int [][] c={{1}};
        int [][] e={{1,2,3,4,5,6}};
        int [][] e2={{1},{2},{3}};


        max.clear();
        printMatrix2(e2,0,0);
        for(Integer i:max){
            System.out.println(i);
        }





    }
    ArrayList<Integer> max = new ArrayList<Integer>();





    public void  printMatrix2(int [][] matrix,int xL,int yL) {


        int x0=xL;
        int x1=matrix[0].length-1-xL;
        int y0=yL;
        int y1=matrix.length-1-yL;
        if(x0<=x1 && y0<=y1){

            for (int i = x0; i <= x1; i++) {
                max.add(matrix[y0][i]);
            }
            //只有行
            if(y0==y1) return;

            for (int j = y0 + 1; j <= y1; j++) {
                max.add(matrix[j][x1]);
            }



            for (int x = x1 - 1; x >= x0; x--) {
                max.add(matrix[y1][x]);
            }
            //只有竖行
            if(x0!=x1) {
                for (int y = y1 - 1; y > y0; y--) {
                    max.add(matrix[y][x0]);
                }
            }
            printMatrix2(matrix,++xL,++yL);


        }





    }
}
