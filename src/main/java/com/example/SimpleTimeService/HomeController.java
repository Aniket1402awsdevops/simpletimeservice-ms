package com.example.simpletimeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, String> home() throws UnknownHostException {
        Map<String, String> response = new HashMap<>();
        response.put("timestamp", LocalDateTime.now().toString());
        response.put("ip", InetAddress.getLocalHost().getHostAddress());
        return response;
    }

}
