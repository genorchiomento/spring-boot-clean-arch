package br.com.genorchiomento.springbootcleanarch.application.usecase;

import br.com.genorchiomento.springbootcleanarch.application.gateway.UserGateway;
import br.com.genorchiomento.springbootcleanarch.domain.entity.User;

public class CreateUserInteractor {
    private final UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user) {
        return userGateway.createUser(user);
    }
}
