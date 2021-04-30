package othertest.basetest;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class ClassToClass {
    public static void main(String[] args) {



    }
    /**
     * 类型转换
     */
    @Test
    public void ClassToOtherClass(){
        short s=1;
//        s=s+1;             //类型只能小给大 不能大给小
        s+=1;                 //相当于：s=(short)s+1;
        int a=3;
        a=a+(short)1;
    }

    /**
     * jdk1。5实现了自动拆箱和装箱    在编译阶段就完成了
     * 自动装箱和拆箱
     */
    @Test
    public void pakingAndUnpaking(){
        Integer a=3;
        //拆箱
        int i = a.intValue();
        //装箱
        Integer integer = Integer.valueOf(i);

        Integer integer1 = Integer.valueOf("123123123");
        int c = integer1;
        System.out.println(integer1);

        //自动装箱
        Integer b=3;
        //自动拆箱
        int d= b;
        //更精确的数字 更大的数字
        BigDecimal bigDecimal = new BigDecimal(123);
        BigInteger bigInteger = new BigInteger("123124231324513413241234134324132413243214132432415312412353241324123451515");
        System.out.println(bigDecimal);
        System.out.println(bigInteger);


    }

    @Test
    public  void timeApi(){
        LocalDate localDate =  LocalDate.now();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);
    }

    @Test
    public  void tes2(){
        Integer a=new Integer("123123");
        int i = a.intValue();
        System.out.println(i);

    }


}
