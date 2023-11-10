package com.example.springboot;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zaxxer.hikari.HikariDataSource;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ConfigurationController {

    static Logger logger = LoggerFactory.getLogger(PlaylistController.class);

    @Value("${k8s.bindings.configuration.provider:xxxxxxxx}")
    String provider;

    private final HikariDataSource dataSource;

    public ConfigurationController(HikariDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @GetMapping(value = "/config", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, ?> config() {
        logger.info("get configuration");
        return Map.of(
                "url", dataSource.getJdbcUrl(),
                "driver", dataSource.getDriverClassName(),
                "username", dataSource.getUsername(),
                "password", dataSource.getPassword(),
                "hostname", getHostname(),
                "color", "green",
                "provider", provider);
    }

    private String getHostname() {
        try {
            return InetAddress.getLocalHost().getHostName().toString();
        } catch (UnknownHostException e) {
            return "Unknown";
        }
    }

    public String getProvider() {
        return provider;
    }

}