package jianzhioffer;

import org.junit.Test;

public class Offer10 {


    @Test
    public void main(){
        int i = rectCover(4);
        System.out.println(i);
    }


    public int rectCover(int target) {
        if(target==0) return 0;
        if(target==1) return 1;
        if(target==2) return 2;
        return rectCover(target-1)+rectCover(target-2);
    }

}