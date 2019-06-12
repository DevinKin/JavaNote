package com.devinkin.tdd.repo.tddrepo;

import com.devinkin.tdd.domain.tdddomain.user.User;
import com.devinkin.tdd.repo.tddrepo.user.UserRepo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

/**
 * @program: TDD
 * @author: devinkin
 * @create: 2019-06-11 10:23
 * @description: UserRepo测试类
 **/
@RunWith(SpringRunner.class)
@EntityScan(basePackages = {"com.devinkin.tdd.domain.tdddomain"})
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class UserRepoTest {

    @Autowired
    private TestEntityManager entityManager;

    @Resource
    UserRepo userRepo;

    @Test
    public void testUserAdd() {
        User user = new User();
        user.setUserName("tdd");
        user.setUserNickName("mc");
        user.setGender("male");
        user.setAge(29);
        user.setId(10);
        user.setOccupation("spring boot developer");
        Integer result = userRepo.saveDto(user.getId(),user.getUserName(), user.getUserNickName(), user.getAge(), user.getGender(), user.getOccupation());
        Assert.assertEquals(result.intValue(), 1);
    }

    @Test
    public void testUserQuery() {
        User user = new User();
        user.setUserName("tdd1");
        user.setUserNickName("mc1");
        user.setGender("female");
        user.setAge(20);
        user.setOccupation("spring boot developer1");
        entityManager.persist(user);
        User result = userRepo.queryDto("tdd1");
        Assert.assertEquals("tdd1", result.getUserName());
    }

    @Test
    public void testUserList() {
        User user = new User();
        user.setUserName("tdd");
        user.setUserNickName("mc");
        user.setGender("male");
        user.setAge(29);
        user.setOccupation("spring boot developer");
        entityManager.persist(user);

        List<User> result = userRepo.listDto();
        Assert.assertEquals(Boolean.TRUE.booleanValue(), result.size() > 0);
    }
}
