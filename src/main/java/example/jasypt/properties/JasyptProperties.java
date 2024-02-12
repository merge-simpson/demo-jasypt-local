package example.jasypt.properties;

import example.jasypt.properties.encryptor.JasyptEncryptorProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Profile;

@ConfigurationProperties("app.jasypt")
@ConfigurationPropertiesBinding
@Profile("local")
public record JasyptProperties(
        @NestedConfigurationProperty
        JasyptEncryptorProperties encryptor
) {
}