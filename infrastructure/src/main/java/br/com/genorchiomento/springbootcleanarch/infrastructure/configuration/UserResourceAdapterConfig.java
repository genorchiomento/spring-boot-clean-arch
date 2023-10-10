package br.com.genorchiomento.springbootcleanarch.infrastructure.configuration;

import br.com.genorchiomento.springbootcleanarch.infrastructure.resource.adapter.UserResourceAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserResourceAdapterConfig {

    @Bean
    UserResourceAdapter userResourceAdapter() {
        return new UserResourceAdapter();
    }
}
