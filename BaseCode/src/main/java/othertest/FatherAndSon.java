package othertest;

/**
 *
 */
public class FatherAndSon {
    public static void main(String[] args) {
        //不可以调用子类特有的方法 但是属性可以接收过来
        //这样的Father类似于一个接口 子类实现他的方法 如何让没有重写就调父类自己的方法 重写了就调自己的
        //虽然Father类似于接口 但是不会对属性进行限制
        Father fa = new Son("son","23","man","game","unkonw");



        fa.havesifangqian();
        String s = fa.toString();
        System.out.println(s);
        String havesifangqian = fa.havesifangqian();
        System.out.println(havesifangqian);

        Father father =  new Father("12","21","man");
        Son son4 = new Son();
        son4.sonss();

//        Son son2 = (Son) new Father();
//        System.out.println(father);


    }


}


class Father {
    public String name;
    public String age;
    public String sex;

    public String getName() {
        return this.name;
    }

    private String sifangqian(){
        System.out.println("我的私房钱！");
        return "OK";
    }

    public String havesifangqian(){
        return sifangqian();
    }

    public Father(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    Father() {

    }

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}

class Son extends Father{
    Son() {

    }
    private String hobby;
    private String wife;

    public Son(String name, String age, String sex,String hobby,String wife) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hobby=hobby;
        this.wife=wife;

    }
    public void sonss(){
        System.out.println("wo shi son");
    }

    @Override
    public String havesifangqian() {
        return "儿子没有私房钱";
    }

    @Override
    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", hobby='" + hobby + '\'' +
                ", wife='" + wife + '\'' +
                '}';
    }
}