package pl.pjatk.marlew.ZJAZD_3_4.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import pl.pjatk.marlew.ZJAZD_3_4.Model.Credentials;

@Configuration
@ConfigurationProperties(prefix = "custom")
public class YmlPropertiesConfig {
    private String loginUrl;
    private Credentials credentials;

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }
}
