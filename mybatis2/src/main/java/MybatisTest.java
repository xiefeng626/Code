
import org.apache.ibatis.session.SqlSession;
import util.mybatis.MybatisUtils;

import java.util.Date;
import java.util.List;

public class MybatisTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserInterface mapper = sqlSession.getMapper(UserInterface.class);


        User user = new User("name",33, new Date());

//        mapper.delete(1);

        for(int i=0;i<30;i++){
            user = new User("赵"+i,i, new Date());
            mapper.insert(user);
            sqlSession.commit();
        }

        sqlSession.commit();
        List<User> users = mapper.getUsers();
        sqlSession.close();

        System.out.println(users);
    }
}
