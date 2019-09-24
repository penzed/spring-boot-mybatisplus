package com.pinux.springbootmybatisPlus;

import com.pinux.controller.user.UserController;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * UserController Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 24, 2019</pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    UserController userController;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getAllList()
     */
    @Test
    public void testGetAllList() throws Exception {
//TODO: Test goes here...
        System.out.println(userController.getAllList());
    }


}
