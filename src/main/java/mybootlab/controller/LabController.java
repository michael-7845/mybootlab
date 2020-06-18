package mybootlab.controller;

import mybootlab.bean.MyBaseBean;
import mybootlab.config.AcmeProperties;
import mybootlab.bean.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Michael Yu
 * Dept: CAAS
 * Team: Mooncake
 */
@RestController
public class LabController {
    @Autowired
    private MyBean bean;

    @RequestMapping("/labs/showConfig")
    public MyBean showConfig() {
        return bean;
    }

    @Autowired
    private MyBaseBean byProfile;

    @RequestMapping("/labs/byProfile")
    public MyBaseBean showByProfile() {
        return byProfile;
    }

    @Autowired
    private AcmeProperties acme;

    @RequestMapping("/labs/showAcme")
    public AcmeProperties showAcme() {
        return acme;
    }
}
