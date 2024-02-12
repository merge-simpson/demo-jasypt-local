package example.demo.controller;

import example.demo.dto.ExampleDto.ExampleApiKeyQueryResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public final class ExampleApi {
    private final String apiKey;

    public ExampleApi(
            @Value("${app.example.api-key}")
            String apiKey
    ) {
        this.apiKey = apiKey;
        log.debug("Example API Key: {}", apiKey);
    }

    @GetMapping("/examples/api-key")
    public ExampleApiKeyQueryResponseDto getApiKey() {
        return ExampleApiKeyQueryResponseDto.builder()
                .apiKey(apiKey)
                .build();
    }
}
