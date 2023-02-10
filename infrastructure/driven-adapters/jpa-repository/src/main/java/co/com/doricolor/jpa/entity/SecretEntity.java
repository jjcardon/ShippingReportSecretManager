package co.com.doricolor.jpa.entity;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class SecretEntity {
    @SerializedName(value = "username")
    private String userName;
    @SerializedName(value = "password")
    private String passWord;
    @SerializedName(value = "engine")
    private String engine;
    @SerializedName(value = "host")
    private String host;
    @SerializedName(value = "port")
    private Integer port;
    @SerializedName(value = "dbname")
    private String dbName;
}
