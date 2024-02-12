package example.jasypt.config;

import example.jasypt.properties.JasyptProperties;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local")
@ConfigurationPropertiesScan(basePackageClasses = JasyptProperties.class)
public class LocalJasyptConfiguration {

    @Bean("jasyptStringEncryptor") // <<< required bean name
    public StringEncryptor jasyptStringEncryptor(JasyptProperties jasyptProperties) {
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();

        config.setPassword(jasyptProperties.encryptor().password());
        config.setAlgorithm(jasyptProperties.encryptor().algorithm());
        config.setPoolSize(jasyptProperties.encryptor().poolSize());

        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        encryptor.setConfig(config);
        return encryptor;
    }

}
