package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyJunit {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = BTest.class;
        //反射其中的成员，此处就是方法成员
        Method methods[] = clazz.getMethods();//得到DemoTest1中的所有公有的方法
        //
        Object s = new Object();
        for(Method m:methods){
            //谁有，就执行谁
            boolean b = m.isAnnotationPresent(MyAnnotation.class);
            System.out.println(b+"==="+m.getName());
            if(b){
                m.invoke(clazz.newInstance(),null);
            }
        }
    }
}
