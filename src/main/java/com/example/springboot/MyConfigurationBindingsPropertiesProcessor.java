package com.example.springboot;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.bindings.Binding;
import org.springframework.cloud.bindings.Bindings;
import org.springframework.cloud.bindings.boot.BindingsPropertiesProcessor;
import org.springframework.core.env.Environment;

public class MyConfigurationBindingsPropertiesProcessor implements BindingsPropertiesProcessor {

    public static final String TYPE = "postgresql";

    static Logger logger = LoggerFactory.getLogger(MyConfigurationBindingsPropertiesProcessor.class);

    @Override
    public void process(Environment environment, Bindings bindings, Map<String, Object> properties) {
        logger.error("process " + TYPE + " bindings");
        List<Binding> myBindings = bindings.filterBindings(TYPE);
        if (myBindings.size() == 0) {
            return;
        }
        Binding binding = myBindings.get(0);
        String provider = binding.getProvider();
        logger.error("provider value is " + provider);
        properties.put("k8s.bindings.configuration.provider", provider);

    }

}
