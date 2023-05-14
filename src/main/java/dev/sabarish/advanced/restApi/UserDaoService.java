package dev.sabarish.advanced.restApi;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDaoService {
    private  static List<User> users = new ArrayList<>();
    static int count=0;

    // adding users manually
    static {
        users.add(new User(++count, "Sabarish Sankar", LocalDateTime.now().minusYears(23)));
        users.add(new User(++count, "Sankar J",LocalDateTime.now().minusYears(55)));
        users.add(new User(++count, "Bhuvana Amma", LocalDateTime.now().minusYears(51)));
    }
    // find userByID
    public User findUserByID(int id)
    {
       return users.stream()
                .filter(user -> user.getId()==id)
                .findFirst()
               //.get()
                .orElse(null);
    }
    //  delete userByID
    public void deleteUserByID(int id)
    {
        users.removeIf(user -> user.getId()==id);
    }

    //get all Users
    public List<User> findAll()
    {
        return users;
    }
    public User addNewUser(User user)
    {
        user.setId(++count);
        users.add(user);
        return  user;

    }
}
