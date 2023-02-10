package co.com.doricolor.model.shippingreport.secret;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
public class SecretModel {

    private String userName;
    private String passWord;
    private String engine;
    private String host;
    private Integer port;
    private String dbName;

}
