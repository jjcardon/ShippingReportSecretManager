package co.com.doricolor.jpa.util;

import co.com.doricolor.jpa.entity.SecretEntity;
import co.com.doricolor.model.shippingreport.secret.SecretModel;


public class SecretBuilder {
    public SecretModel buildSecretModel(SecretEntity secretEntity) {
        return SecretModel.builder()
                .userName(secretEntity.getUserName())
                .passWord(secretEntity.getPassWord())
                .engine(secretEntity.getEngine())
                .host(secretEntity.getHost())
                .port(secretEntity.getPort())
                .dbName(secretEntity.getDbName())
                .build();
    }
}
