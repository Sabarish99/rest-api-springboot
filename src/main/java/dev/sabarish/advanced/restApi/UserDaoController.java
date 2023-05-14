package dev.sabarish.advanced.restApi;

import dev.sabarish.advanced.restApi.error.ErrorHandling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;

@RestController
//@RequestMapping(value = "/", method = RequestMethod.GET)
public class UserDaoController {
    private final UserDaoService service;


    @Autowired
    public UserDaoController(UserDaoService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers()
    {

        return  ResponseEntity.ok(service.findAll());

    }
    @PostMapping("/users")
    public ResponseEntity<User> insertUser(@RequestBody User user)
    {
        return new ResponseEntity<>(service.addNewUser(user), HttpStatus.CREATED);
    }
    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id)
    {
        User user = service.findUserByID(id);
        if(user == null ) throw  new UserNotFoundException("ID :"+ id + "Error Code "+ HttpStatus.NOT_FOUND) ;

        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUserByID(@PathVariable int id)
    {
        service.deleteUserByID(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
