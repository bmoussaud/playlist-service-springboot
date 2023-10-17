package com.example.springboot;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zaxxer.hikari.HikariDataSource;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;

@RestController
public class ConfigurationController {

    private final HikariDataSource dataSource;

    public ConfigurationController(HikariDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @GetMapping(value = "/config", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, ?> config() {

        return Map.of(
                "url", dataSource.getJdbcUrl(),
                "driver", dataSource.getDriverClassName(),
                "username", dataSource.getUsername(),
                "password", dataSource.getPassword(),
                "hostname", getHostname());

    }

    private String getHostname() {
        try {
            return InetAddress.getLocalHost().getHostName().toString();
        } catch (UnknownHostException e) {
            return "Unknown";
        }
    }

}