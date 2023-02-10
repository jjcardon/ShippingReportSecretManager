package co.com.doricolor.jpa.repository;

public interface SecretManagerRepository {

    String getSecretValue(String secretName);

}

