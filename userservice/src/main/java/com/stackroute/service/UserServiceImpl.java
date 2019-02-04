package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.exception.UserAlreadyExistsException;
import com.stackroute.exception.UserNotFoundException;
import com.stackroute.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Primary
@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser (User user) throws UserAlreadyExistsException {
        if(userRepository.existsById(user.getUserId())){
            throw new UserAlreadyExistsException("User already exists");
        }
        User user1 = userRepository.save(user);
        if(user1 == null) {
            throw new UserAlreadyExistsException("User already exists");
        }
        return user1;
    }
    public List<User> getAllUsers() {
        List<User> userList = (List<User>) userRepository.findAll();
        return userList;
    }

    public User deleteUser(int userId)  throws UserNotFoundException {
        Optional<User> user1 = userRepository.findById(userId);
        if(userRepository.existsById(userId))
            userRepository.deleteById(userId);
        else {
            throw new UserNotFoundException("User not found");
        }
        return user1.get();

    }
    public User updateUser(int userId, User user)  throws UserNotFoundException{
        if(userRepository.existsById(userId)) {
            User user1= userRepository.save(user);
            return user1;
        }
        else
            throw new UserNotFoundException("User not found");

    }

}
