package util.mybatis;



import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class MybatisUtils {

    private  static  SqlSessionFactory sqlSessionFactory;
    static {
        try{
            String resource ="mybatis.config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static SqlSession getSqlSession(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSessionFactory.openSession();
    }

    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
    }

}
