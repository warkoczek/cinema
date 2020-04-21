package pl.warkocz.cinema.service;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void showUsersShouldReturnListSize3() {
        //given
        int expectedListSize = 3;
        //when
        int actualListSize = userService.showUsers().size();
        //then
        Assert.assertEquals(expectedListSize,actualListSize);

    }
}
