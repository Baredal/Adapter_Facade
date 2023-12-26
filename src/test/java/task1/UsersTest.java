package task1;


import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.task1.Auth;
import ua.edu.ucu.apps.task1.FacebookUser;
import ua.edu.ucu.apps.task1.MyFacebookUser;
import ua.edu.ucu.apps.task1.MyTwitterUser;
import ua.edu.ucu.apps.task1.TwitterUser;
import ua.edu.ucu.apps.task1.User;

public class UsersTest {

    @Test
    public void testMyFacebookUser() {
        FacebookUser fbUser = new FacebookUser();
        fbUser.setEmail("test@example.com");
        fbUser.setUserCountry("USA");
        fbUser.setUserActiveTime(LocalDateTime.now());

        MyFacebookUser myFbUser = new MyFacebookUser(fbUser);

        Assertions.assertEquals("test@example.com", myFbUser.getEmail());
        Assertions.assertEquals("USA", myFbUser.getCountry());
        Assertions.assertEquals(LocalDate.now(), myFbUser.getLastActiveDate());
        Assertions.assertTrue(myFbUser instanceof User);
    }

    @Test
    public void testMyTwitterUser() {
        TwitterUser twitterUser = new TwitterUser();
        twitterUser.setUserMail("test@example.com");
        twitterUser.setCountry("Canada");
        twitterUser.setLastActiveTime(LocalDateTime.now());

        MyTwitterUser myTwitterUser = new MyTwitterUser(twitterUser);

        Assertions.assertEquals("test@example.com", myTwitterUser.getEmail());
        Assertions.assertEquals("Canada", myTwitterUser.getCountry());
        Assertions.assertEquals(LocalDate.now(), myTwitterUser.getLastActiveDate());
        Assertions.assertTrue(myTwitterUser instanceof User);
    }


    @Test
    public void testAuthProcessData() {
        Auth auth = new Auth();

        MyFacebookUser myFbUser = new MyFacebookUser(new FacebookUser());
        auth.processData(myFbUser);
    }
    
}
