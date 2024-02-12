package example.jasypt.properties.encryptor;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;

@ConfigurationPropertiesBinding
public record JasyptEncryptorProperties(
        String password,
        String algorithm,
        Integer poolSize
) {
    public JasyptEncryptorProperties {
        if (algorithm == null) {
            algorithm = "PBEWithMD5AndDES";
        }
        if (poolSize == null) {
            poolSize = 1;
        }
    }
}