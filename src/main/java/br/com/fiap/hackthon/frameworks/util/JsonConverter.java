package br.com.fiap.hackthon.frameworks.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JsonConverter {
    private final ObjectMapper objectMapper;

    public Object jsonToObject(final String jsonString, final Class<?> valueType) throws Exception {
        return objectMapper.readValue(jsonString, valueType);
    }
}
