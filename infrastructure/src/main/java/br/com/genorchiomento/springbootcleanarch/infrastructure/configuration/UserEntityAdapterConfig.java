package br.com.genorchiomento.springbootcleanarch.infrastructure.configuration;

import br.com.genorchiomento.springbootcleanarch.infrastructure.gateway.adapter.UserEntityAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserEntityAdapterConfig {

    @Bean
    UserEntityAdapter userEntityAdapter() {
        return new UserEntityAdapter();
    }
}
