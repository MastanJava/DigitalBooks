package digitalbooks.user.controller;

import digitalbooks.user.entity.User;
import digitalbooks.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public void UserController(@PathVariable("id") Long userId) {
        log.info("Inside getUserWithDepartment of UserController");
        userService.getUser(userId);
    }


}
