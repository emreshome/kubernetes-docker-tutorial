package com.emre.k8demospring;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.ConnectException;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class Controller {


    @Value("${logic.url}")
    private String logicUrl;

    @ResponseBody
    @GetMapping("/")
    public String get() {

        InetAddress ip = null;
        String response = "no response";
        try {
            ip = InetAddress.getLocalHost();
            RestTemplate rest = new RestTemplate();

            response = rest.getForEntity(logicUrl + "/getlogic", String.class).getBody();

        } catch (Exception ignored) {
        }

        return String.format("<h3> webapp: %s <br> logic: %s <br> hello kubernetes</h3>", ip == null ? "no response" : ip.toString(), response);
    }
}
