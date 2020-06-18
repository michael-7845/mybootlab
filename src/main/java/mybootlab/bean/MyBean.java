package mybootlab.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.InetAddress;

/**
 * Author: Michael Yu
 * Dept: CAAS
 * Team: Mooncake
 */
@Component
public class MyBean {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRandomString() {
        return randomString;
    }

    public void setRandomString(String randomString) {
        this.randomString = randomString;
    }

    public Integer getRandomInt() {
        return randomInt;
    }

    public void setRandomInt(Integer randomInt) {
        this.randomInt = randomInt;
    }

    public String getRandomUuid() {
        return randomUuid;
    }

    public void setRandomUuid(String randomUuid) {
        this.randomUuid = randomUuid;
    }

    @Value("${my.name}")
    private String name;

    @Value("${my.secret}")
    private String randomString;

    @Value("${my.number}")
    private Integer randomInt;

    @Value("${my.uuid}")
    private String randomUuid;

//    @Value("${acme.enabled}")
//    public Boolean enabled;
}
