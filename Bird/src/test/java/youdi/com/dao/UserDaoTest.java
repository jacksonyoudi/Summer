package youdi.com.dao;


import com.youdi.dao.UserDao;
import com.youdi.pojo.User;
import com.youdi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

// org.apache.ibatis.binding.BindingException: Type interface com.youdi.dao.UserDao is not known to the MapperRegistry.
// The error may exist in com/youdi/dao/UserMapper.xml

public class UserDaoTest {

    @Test
    public void test() {
        // 获取 sql session
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 执行
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
