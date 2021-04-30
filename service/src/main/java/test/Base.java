package test;

class Base
{
    public Base()
    {
        System.out.println("Base()");
    }
    public Base(int i)
    {
        System.out.println("Base(int i)");
    }
}

class MyOver extends Base
{
    public void MyOver(int i)
    {
    }

    public static void main(String[] argv)
    {
        int a= (int) 123f;
    }
}
