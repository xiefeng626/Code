package algorithm;

import java.util.ArrayList;

public class HalfSearch {

    public static  void main(String[] args) {

        int [] a={1,2,3,4,5,6,7,8,9,10};

        int half = Half(a, 1);

        System.out.println(half);


    }

    /**
     * 折半查找
     * @param a
     * @param aim
     * @return
     */
    static  int Half(int[] a,int aim){

        int low=0;
        int height=a.length-1;
        int mid=0;
        while(mid<=height && mid>=0){
            //重新界定 low 和 height
            if(a[mid]==aim){
                return mid;
            }else if(a[mid]<aim){
                low=mid+1;
            }else if(a[mid]>aim){
                height=mid-1;
            }
            //重新界定 mid
            mid=low+(height-low)/2;
        }
        return -1;
    }


}
