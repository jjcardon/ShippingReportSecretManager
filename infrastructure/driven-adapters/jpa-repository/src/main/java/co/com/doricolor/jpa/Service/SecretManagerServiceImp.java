package co.com.doricolor.jpa.Service;

import co.com.doricolor.model.shippingreport.gateways.SecretManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecretManagerServiceImp implements SecretManagerService{
    private SecretManagerRepository secretManagerRepository;

    @Autowired
    public SecretManagerServiceImp(SecretManagerRepository secretManagerRepository) {
        this.secretManagerRepository = secretManagerRepository;
    }


    @Override
    public String getSecretValue(String secretName) {
        return secretManagerRepository.getSecretValue(secretName);
    }

}
