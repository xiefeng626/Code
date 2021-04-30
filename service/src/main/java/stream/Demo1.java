package stream;

import entity.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

    /**
     * 过滤
     */
    @Test
    public void filter(){
        List<String> list= Arrays.asList("1","2","32","4");
        List<String> collect = list.stream().filter(a -> a.contains("2")).collect(Collectors.toList());
        System.out.println(collect);
    }

    /**
     * 去重
     */
    @Test
    public void distinct(){
        List<String> list= Arrays.asList("1","2","2","4");
        List<String> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
//        -----------比较对象是不能去重的 因为比较的是地址-----------------------
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("1","2",12,new Date()));
        users.add(new User("2","2",12,new Date()));
        users.add(new User("3","2",12,new Date()));

        


    }


}
