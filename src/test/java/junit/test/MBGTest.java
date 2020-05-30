package junit.test;

import com.secondgroup.bean.User;
import com.secondgroup.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author: alex
 * @date: 2020/5/27 11:38 下午
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MBGTest {

    @Autowired
    private UserService userService;

//    @Test
//    public void testQuery() {
//        List<User> userList = userService.getUserList();
//        for (User user : userList) {
//            System.out.println(user);
//        }
//    }
//
//    @Test
//    public void testUpdate() {
//        User user = new User();
//        user.setUid(6);
//        user.setName("费玉清");
//        userService.updateUSer(user);
//    }
}
