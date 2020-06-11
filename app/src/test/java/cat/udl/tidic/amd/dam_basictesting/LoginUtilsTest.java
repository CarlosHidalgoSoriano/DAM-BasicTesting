package cat.udl.tidic.amd.dam_basictesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginUtilsTest {


    @Test
    public void mail_isCorrect(){
        assertTrue(LoginUtils.isValidGmailAddress("xxx@gmail.com"));
        assertFalse(LoginUtils.isValidGmailAddress("xxx.com"));
    }

    @Test
    public void getUsername(){
        assertEquals(LoginUtils.getUserName("xxx@gmail.com"),"xxx");
    }
}
