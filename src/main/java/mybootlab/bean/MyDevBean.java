package mybootlab.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Author: Michael Yu
 * Dept: CAAS
 * Team: Mooncake
 */
@Component
@Profile("dev")
public class MyDevBean extends MyBaseBean {

    public String getName() {
        return name;
    }

    public void setName(String ip) {
        this.name = name;
    }

    @Value("${my.name}")
    private String name;
}
