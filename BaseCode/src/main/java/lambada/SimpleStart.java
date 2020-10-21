package lambada;

import java.util.*;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntBinaryOperator;

public class SimpleStart {
    public static void main(String[] args) {
        //遍历List集合
        List<String> languages = Arrays.asList("java","scala","python");

        languages.forEach(x-> System.out.println(x));
        for(String a:languages){System.out.println(a);}

        languages.forEach(x->{ x+=x;System.out.println(x);});
        for(String a:languages){a+=a;System.out.println(a);}


        //遍历Map集合
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1,"2");
        integerStringMap.put(2,"2");
        integerStringMap.put(3,"2");
        integerStringMap.put(4,"2");
        integerStringMap.forEach( (k,v)->{System.out.println(k+" "+v);});
    }

}
