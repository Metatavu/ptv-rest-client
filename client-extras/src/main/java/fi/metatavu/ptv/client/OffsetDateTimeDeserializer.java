package fi.metatavu.ptv.client;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class OffsetDateTimeDeserializer extends JsonDeserializer<OffsetDateTime> {

  @Override
  public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
    JsonToken currentToken = jsonParser.getCurrentToken();
    
    if (currentToken.equals(JsonToken.VALUE_STRING)) {
      String text = jsonParser.getText().trim();
      if (text != null) {
        try {
          return OffsetDateTime.parse(text);
        } catch (DateTimeParseException e) {
          return OffsetDateTime.parse(String.format("%sZ", text));
        }
      }
      
      throw deserializationContext.weirdStringException(text, TemporalAccessor.class, String.format("%s could not be deserialized", text));
    } else if (currentToken.equals(JsonToken.VALUE_NULL)) {
      return getNullValue(deserializationContext);
    }

    throw deserializationContext.mappingException(Boolean.class);
  }

}
