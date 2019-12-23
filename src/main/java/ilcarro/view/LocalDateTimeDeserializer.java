package ilcarro.view;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LocalDateTimeDeserializer extends StdDeserializer<LocalDateTime> {
    public static final String PATTERN = "yyyy-MM-dd HH:mm:ss";
    static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PATTERN);

    protected LocalDateTimeDeserializer() {
        super(LocalDateTime.class);
    }

    @Override
    public LocalDateTime deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        return LocalDateTime.parse(parser.readValueAs(String.class), formatter);
    }
}