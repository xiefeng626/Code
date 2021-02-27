package reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class FirstTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        String name = "reflex.User";
        Class user = Class.forName(name);
//        Constructor[] constructors = user.getDeclaredConstructors();
//        Object o = constructors[0].newInstance("zhao", "nan", 12);
//        Object o1 = constructors[1].newInstance();
////        User o = (User) user.newInstance();
////        o.setAge(12);
//        for(Constructor a:constructors){
//            System.out.println(a);
//        }
//
//        System.out.println(o+"\n"+o1+"\n");

        Constructor constructor = user.getDeclaredConstructor(String.class, String.class, Integer.class);
        constructor.setAccessible(true);
        Object o2 = constructor.newInstance("li", "wang", 22);
        System.out.println(o2);

    }
}
