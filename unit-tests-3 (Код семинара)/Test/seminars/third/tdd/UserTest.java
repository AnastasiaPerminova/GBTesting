package seminars.third.tdd;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    User user = new User("login", "password");
    User user2 = new User("login1", "password2");
    User admin = new User("admin", "admin", true);

    @Test
    public void getAuthorized(){
        assertTrue(user.authenticate("login", "password"));
    }
    @Test
    public void getNotAuthorized(){
        assertFalse(user.authenticate("login", "password1"));
    }

    @Test
    public void getItAuth(){
        user.authenticate("login", "password");
        assertTrue(user.isAuthenticate());
    }

    @Test
    public void getItAdded(){
        user.authenticate("login", "password");
        UserRepository userRepository = new UserRepository();
        userRepository.addUser(user);
        assertThat(userRepository.data).contains(user);

    }
    @Test
    public void getItNotAdded(){
        user.authenticate("login1", "password2");
        UserRepository userRepository = new UserRepository();
        userRepository.addUser(user);
        assertThat(userRepository.data).doesNotContain(user);

    }

    @Test
    public void getItLogOut(){
        user.authenticate("login", "password");
        user2.authenticate("login1", "password2");

        UserRepository userRepository = new UserRepository();
        userRepository.addUser(user);
        userRepository.addUser(user2);
        userRepository.logOut();
        assertFalse(user.isAuthenticate());
        assertFalse(user2.isAuthenticate());
    }

    @Test
    public void getItNotLogOut(){
        admin.authenticate("admin", "admin");
        UserRepository userRepository = new UserRepository();
        userRepository.addUser(admin);
        userRepository.logOut();
        assertTrue(admin.isAuthenticate());
    }


}