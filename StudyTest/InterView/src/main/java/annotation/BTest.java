package annotation;

public class BTest {


    public void test1(){
        System.out.println("test1执行了");
    }
    @MyAnnotation
    public void test2(){
        System.out.println("test2执行了");
    }

}
