package youdi.com.dao;


import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import com.youdi.dao.UserMapper;
import com.youdi.pojo.User;
import com.youdi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

// org.apache.ibatis.binding.BindingException: Type interface com.youdi.dao.UserDao is not known to the MapperRegistry.
// The error may exist in com/youdi/dao/UserMapper.xml

public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void test() {
        logger.info("info test");
        logger.debug("debug test");
        logger.error("error test");


        // 获取 sql session
        SqlSession sqlSession = MybatisUtils.getSqlSession();


        try {
            // 执行
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userDao.getUserList();

//            List<User> userList = sqlSession.selectList("com.youdi.dao.UserDao.getUserList");


            for (User user : userList) {
                System.out.println(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }


    @Test
    public void testGetUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);

        System.out.println(user);


        sqlSession.close();
    }


    @Test
    public void testAddUser() {
        // 增删改 需要提交事务

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user1 = new User(4, "hello", "world");

        int result = userMapper.addUser(user1);
        if (result > 0) {
            System.out.println("ok");
        }

        sqlSession.commit();

        sqlSession.close();
    }


    @Test
    public void testUpdateUser() {
        // 增删改 需要提交事务

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user1 = new User(1, "youdi", "world");

        int result = userMapper.updateUser(user1);
        if (result > 0) {
            System.out.println("ok");
        }

        sqlSession.commit();

        sqlSession.close();
    }


    @Test
    public void testAddUserMap() {
        // 增删改 需要提交事务
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();

        map.put("id", 6);
        map.put("name", "hello");
        map.put("pwd", "mac");


        int result = userMapper.addUserOfMap(map);
        if (result > 0) {
            System.out.println("ok");
        }

        sqlSession.commit();

        sqlSession.close();
    }
}
