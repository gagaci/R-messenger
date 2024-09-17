package hey.example.service;

import hey.example.entity.User;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<Void> create(User user);
}
