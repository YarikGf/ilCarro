package ilcarro.view;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class LocalDateDeserializer extends StdDeserializer<LocalDate> {
    public static final String PATTERN = "yyyy-MM-dd";
    static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PATTERN);

    protected LocalDateDeserializer() {
        super(LocalDate.class);
    }

    @Override
    public LocalDate deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        return LocalDate.parse(parser.readValueAs(String.class), formatter);
    }
}