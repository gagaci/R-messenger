package hey.example.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import reactor.core.publisher.Flux;

@Getter
@Setter
@Data
public class User {
    private Integer id;
    private String name;
    private int age;
    private Flux<Message> messageList;

}
