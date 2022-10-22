package digitalbooks.user.service;

import digitalbooks.user.entity.User;
import digitalbooks.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }

    public UserService(Long userId) {
        log.info("Inside getUserWithDepartment of UserService");
        User user = userRepository.findByUserId(userId);
    }

    public void getUser(Long userId) {
    }
}
