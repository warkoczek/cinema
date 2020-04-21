package pl.warkocz.cinema.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.warkocz.cinema.domain.User;
import pl.warkocz.cinema.service.UserService;

import java.util.Optional;


@Controller
@RequestMapping(value = "/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String showAllUsers(){
        return "users";
    }

    @GetMapping(value = "/user", produces = "application/json")
    public ResponseEntity<User> showUserByUsername(@RequestParam(required = false) String username){
        Optional<User> user = userService.showByUsername(username);
        if(user.isPresent()){
            return ResponseEntity.ok(user.get());
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.ok(userService.createUser(user));
    }
}
