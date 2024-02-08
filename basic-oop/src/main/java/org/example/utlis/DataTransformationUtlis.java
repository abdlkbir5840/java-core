package org.example.utlis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataTransformationUtlis {
    public static String toJson(Object o) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return  mapper
                    .writerWithDefaultPrettyPrinter()
                    .writeValueAsString(o);
        } catch (JsonProcessingException e) {
            return "{}";
        }
    }
}
