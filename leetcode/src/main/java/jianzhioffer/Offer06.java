package jianzhioffer;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 */

import javafx.scene.effect.Blend;
import org.junit.Test;

/**
 * 输入：
 * [3,4,5,1,2]
 * 返回值：
 * 1
 */

/**
 * 1 、while 循环
 * 2、mid<high   最小必在他们之间                      中间小   高位大    趋势：1、变小突变大   2、变大
 * 3、min=high    result:去掉高位                    中间=高位         趋势：1、增减小  2、减增
 * 4、mid>high                                    中间大   高位小    减小     增加大突变小
 */
public class Offer06 {

    @Test
    public  void main(){
        int[] a={1,2,3,4,0};
        int i = minNumberInRotateArray(a);
        System.out.println(i);
    }

        public int minNumberInRotateArray(int [] array) {
            int low = 0 ; int high = array.length - 1;
            while(low < high){
                int mid = low + (high - low) / 2;
                if(array[mid] > array[high]){
                    low = mid + 1;
                }else if(array[mid] == array[high]){
                    high = high - 1;
                }else{
                    high = mid;
                }
            }
            return array[low];
        }



}
