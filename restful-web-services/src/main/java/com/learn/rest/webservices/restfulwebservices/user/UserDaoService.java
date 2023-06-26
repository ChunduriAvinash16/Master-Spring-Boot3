package com.learn.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    //JPA/Hibernate > DataBase

    private static List<User> users = new ArrayList<User>();
    private static int counter = 0;
    static {
        users.add(new User(++counter,"Jim", LocalDate.now().minusYears(25)));
        users.add(new User(++counter,"Tom", LocalDate.now().minusYears(15)));
        users.add(new User(++counter,"Jimmy", LocalDate.now().minusYears(18)));
    }
    //findAll
    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        user.setId(++counter);
        users.add(user);
        return user;
    }

    public User findOne(Integer id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }
}
