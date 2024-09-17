package hey.example.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Message {

    private Integer messageId;

    private Integer sender;

    private String text;


}
