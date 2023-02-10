package co.com.doricolor.jpa.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;



@Configuration
public class SecretsConfig {
    @Value("${aws.secret.region}")
    private String secretRegion;

    @Value("${aws.secret.secretName}")
    private String secretName;

    @Bean
    public AWSSecretsManager smClient() {

        AWSSecretsManagerClientBuilder  clientBuilder  =  AWSSecretsManagerClientBuilder.standard();
        AwsClientBuilder.EndpointConfiguration  config  =  new  AwsClientBuilder.EndpointConfiguration(secretName, secretRegion);
        clientBuilder.setEndpointConfiguration(config);
        return clientBuilder.build();
    }

}
