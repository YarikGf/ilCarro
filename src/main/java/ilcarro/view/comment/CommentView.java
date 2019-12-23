package ilcarro.view.comment;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ilcarro.view.LocalDateDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class CommentView {
    private String firstName;
    private String secondName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = LocalDateDeserializer.PATTERN)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate postDate;
}