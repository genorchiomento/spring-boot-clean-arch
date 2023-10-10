package br.com.genorchiomento.springbootcleanarch.application.gateway;

import br.com.genorchiomento.springbootcleanarch.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
