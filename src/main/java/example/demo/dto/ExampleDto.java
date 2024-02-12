package example.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

public final class ExampleDto {

    private ExampleDto() {}

    @Builder
    public record ExampleApiKeyQueryResponseDto(
            @JsonProperty("api_key")
            @JsonInclude(Include.NON_EMPTY)
            String apiKey
    ) {}
}
