package jianzhioffer;

import org.junit.Test;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，
 * 偶数和偶数之间的相对位置不变。
 */
public class Offer13 {
    @Test
    public void main(){
        int [] a={2,4,6,1,3,5,7};
        reOrderArray(a);
        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }



    public int[] reOrderArray (int[] array) {
        // write code here
        int length=array.length;
        for(int i=0;i<length;i++){
            if(array[i]%2==0){
                int value=array[i];
                for(int j=i;j<array.length-1;j++){
                    array[j]=array[j+1];
                }
                array[array.length-1]=value;
                length--;
                i--;
            }
        }
        return array;

    }
}
