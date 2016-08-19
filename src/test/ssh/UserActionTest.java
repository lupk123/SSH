package test.ssh;

import com.ssh.action.UserAction;
import com.ssh.model.User;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2016/8/18.
 */
public class UserActionTest {
    @Test
    public void execute() throws Exception {
        UserAction userAction = new UserAction();
        User user = new User();
        user.setUsername("b");
        user.setPassword("b");
        String ans = userAction.execute();
        Assert.assertEquals("success", ans);
    }

    @Test
    public void list() throws Exception{
        UserAction userAction = new UserAction();
        userAction.list();
        Assert.assertTrue(userAction.getUsers().size() > 0);
    }
}