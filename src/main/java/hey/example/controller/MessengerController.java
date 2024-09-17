package hey.example.controller;

import hey.example.entity.User;
import hey.example.service.UserService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import reactor.core.publisher.Mono;

@Controller("/messenger")
public class MessengerController {

    private UserService userService;

    @Post
    public Mono<Void> start(User user){

    }
}
