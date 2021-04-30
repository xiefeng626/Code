package test;

 public class Point
{
    private int x;
    private int y;
    public Point (int x,int y)
    {
        this . x = x;
        this . y = y;
    }
    public void setLocation (int x,int y)
    {
        this . x = x;
        this . y = y;
    }
    public static void main (String[] args)
    {
        String str = "String";
        int i=0;
        System.out.println(str+i);

    }
    public static void modifyPoint (Point p1 ,Point p2)
    {
        Point  tmpPoint = p1;
        p1 = p2;
        p2 = tmpPoint;
        p1.setLocation(5,5);
        p2 = new Point(5,5);
    }
}

