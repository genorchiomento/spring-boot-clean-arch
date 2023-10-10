package br.com.genorchiomento.springbootcleanarch.service;

import br.com.genorchiomento.springbootcleanarch.model.User;
import br.com.genorchiomento.springbootcleanarch.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(User user) {
        return userRepository.save(user);
    }
}
