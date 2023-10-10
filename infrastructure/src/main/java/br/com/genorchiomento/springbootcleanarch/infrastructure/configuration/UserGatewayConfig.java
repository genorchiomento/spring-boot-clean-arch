package br.com.genorchiomento.springbootcleanarch.infrastructure.configuration;

import br.com.genorchiomento.springbootcleanarch.application.gateway.UserGateway;
import br.com.genorchiomento.springbootcleanarch.infrastructure.gateway.UserRepositoryGateway;
import br.com.genorchiomento.springbootcleanarch.infrastructure.gateway.adapter.UserEntityAdapter;
import br.com.genorchiomento.springbootcleanarch.infrastructure.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserGatewayConfig {

    @Bean
    UserGateway userGateway(
            UserRepository userRepository,
            UserEntityAdapter userEntityMapper
    ) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

}
