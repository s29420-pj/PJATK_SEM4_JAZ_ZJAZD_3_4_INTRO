package pl.pjatk.marlew.ZJAZD_3_4.Service;

import org.springframework.stereotype.Component;
import pl.pjatk.marlew.ZJAZD_3_4.Config.YmlPropertiesConfig;

@Component
public class PrintProperties {
    private final YmlPropertiesConfig ymlPropertiesConfig;
    public PrintProperties(YmlPropertiesConfig ymlPropertiesConfig) {
       this.ymlPropertiesConfig = ymlPropertiesConfig;
       printProperties();
    }

    public void printProperties() {
        System.out.println("Login URL: " + ymlPropertiesConfig.getLoginUrl());
        System.out.println("User: " + ymlPropertiesConfig.getCredentials().getUser());
        System.out.println("Password: " + ymlPropertiesConfig.getCredentials().getPassword());
    }
}
