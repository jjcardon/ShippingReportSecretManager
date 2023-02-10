package co.com.doricolor.jpa.repository;

import co.com.doricolor.model.shippingreport.gateways.SecretManagerRepository;
import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.model.GetSecretValueRequest;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SecretManagerRepositoryImp implements SecretManagerRepository {
    private static final Logger log = LoggerFactory.getLogger(SecretManagerRepositoryImp.class);

    private AWSSecretsManager secretsManager;

    @Autowired
    public SecretManagerRepositoryImp(AWSSecretsManager secretsManager) {
        this.secretsManager = secretsManager;
    }

    @Override
    public String getSecretValue(String secretName) {
        try  {
            GetSecretValueRequest getSecretValueRequest  =  new GetSecretValueRequest().withSecretId(secretName);
            secretsManager.getSecretValue(getSecretValueRequest);
            ObjectMapper objectMapper  =  new  ObjectMapper();
            String secretValue= secretsManager.getSecretValue(getSecretValueRequest).getSecretString();
            JsonNode secretsJson  =  objectMapper.readTree(secretValue);
            String  host  =  secretsJson.get("host").textValue();
            String  port  =  secretsJson.get("port").textValue();
            String  dbname  =  secretsJson.get("dbClusterIdentifier").textValue();
            String  username  =  secretsJson.get("username").textValue();
            String  password  =  secretsJson.get("password").textValue();
            return secretValue;
        } catch(Exception e) {
            log.error("The requested secret "  +  secretName  +  " was not found");
            return "The requested secret "  +  secretName  +  " was not found";
        }
    }
}
