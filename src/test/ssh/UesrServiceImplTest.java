package test.ssh;

import com.ssh.model.User;
import com.ssh.service.UesrService;
import com.ssh.service.impl.UesrServiceImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2016/8/17.
 */
public class UesrServiceImplTest {
    private UesrService uesrService = new UesrServiceImpl();

    @Test
    public void exists() throws Exception {
        User user = new User();
        user.setUsername("a");
        boolean exists = uesrService.exists(user);
        Assert.assertEquals(true, exists);
    }

    @Test
    public void save() throws Exception {
        User user = new User();
        user.setUsername("e");
        user.setPassword("e");
        boolean exists = uesrService.exists(user);
        if(!exists)
        {
            uesrService.save(user);
            Assert.assertEquals(true, uesrService.exists(user));
        }else {
            Assert.fail("not add");
        }

    }

}