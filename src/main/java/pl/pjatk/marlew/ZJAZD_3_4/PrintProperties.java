package pl.pjatk.marlew.ZJAZD_3_4;

import org.springframework.stereotype.Component;
import pl.pjatk.marlew.ZJAZD_3_4.Model.YmlPropertiesConfig;

@Component
public class PrintProperties {
    public PrintProperties(YmlPropertiesConfig ymlPropertiesConfig) {
        System.out.println("Login URL: " + ymlPropertiesConfig.getLoginUrl());
//        System.out.println("User: " + ymlPropertiesConfig.getUser());
//        System.out.println("Password: " + ymlPropertiesConfig.getPassword());
        System.out.println("User: " + ymlPropertiesConfig.getCredentials().getUser());
        System.out.println("Password: " + ymlPropertiesConfig.getCredentials().getPassword());
    }
}
