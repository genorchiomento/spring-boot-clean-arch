package br.com.genorchiomento.springbootcleanarch.infrastructure.configuration;

import br.com.genorchiomento.springbootcleanarch.application.gateway.UserGateway;
import br.com.genorchiomento.springbootcleanarch.application.usecase.CreateUserInteractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateUserInteractorConfig {

    @Bean
    CreateUserInteractor createUserInteractor(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }
}
