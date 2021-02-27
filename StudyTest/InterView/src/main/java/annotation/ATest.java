package annotation;

import java.lang.reflect.Method;

public class ATest {
    @FirstDemo(name = "name1",value = "value2")
    public static void main2(String[] args) {
        System.out.println("this is Atest");
    }


    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("annotation.ATest");
        Method[] ms = clazz.getMethods();
        for (Method m : ms) {
            if(m.isAnnotationPresent(FirstDemo.class)){
                String value = m.getAnnotation(FirstDemo.class).value();
                String name = m.getAnnotation(FirstDemo.class).name();
                System.out.println("value:"+value);
                System.out.println("name:"+name);
            }
        }
    }
}
