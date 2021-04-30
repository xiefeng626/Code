import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserInterface {
    @Select("Select * from user order by id desc")
    List<User> getUsers();

    @Update("update user set age=#{age} where id=1")
    int  updateage(int age);

    @Delete("delete from user where id>#{id}")
    int delete(int id);

    @Insert("insert into user(name,age,date) values (#{user.name},#{user.age},#{user.date});")
     void insert(@Param("user")User user);
}
