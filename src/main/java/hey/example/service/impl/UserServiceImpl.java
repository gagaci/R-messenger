package hey.example.service.impl;

import hey.example.entity.User;
import hey.example.service.UserService;
import jakarta.inject.Singleton;
import reactor.core.publisher.Mono;

@Singleton
public class UserServiceImpl implements UserService {



    @Override
    public Mono<Void> create(User user) {
        return null;
    }
}
