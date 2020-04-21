package pl.warkocz.cinema.service;

import org.springframework.stereotype.Service;
import pl.warkocz.cinema.domain.User;
import pl.warkocz.cinema.repository.UserRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> showUsers(){

        return userRepository.findAll();

    }

    public Optional<User> showByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public User createUser(User user){
        return userRepository.save(user);
    }
}
