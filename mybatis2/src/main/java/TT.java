import org.junit.jupiter.api.Test;

import java.util.Date;

public class TT
{

    @Test
     public  void main(String[] args)
     {
         User name = new User("name", 1, new Date());
         fun(name);
         System.out.println(name);
    }

    void fun(User a){
         a.setAge(1211);
    }
}
