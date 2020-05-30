package junit.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;

/**
 * @author: alex
 * @date: 2020/5/27 11:27 上午
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AppTest {

    @Autowired
    private DruidDataSource druidDataSource;

    @Test
    public void test01() {
        DruidPooledConnection connection = null;
        try {
            connection = druidDataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(connection);
    }
}
