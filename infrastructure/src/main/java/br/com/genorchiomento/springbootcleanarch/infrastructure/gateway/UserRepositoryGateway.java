package br.com.genorchiomento.springbootcleanarch.infrastructure.gateway;

import br.com.genorchiomento.springbootcleanarch.application.gateway.UserGateway;
import br.com.genorchiomento.springbootcleanarch.domain.entity.User;
import br.com.genorchiomento.springbootcleanarch.infrastructure.gateway.adapter.UserEntityAdapter;
import br.com.genorchiomento.springbootcleanarch.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;
    private final UserEntityAdapter userEntityAdapter;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityAdapter userEntityAdapter) {
        this.userRepository = userRepository;
        this.userEntityAdapter = userEntityAdapter;
    }

    @Override
    public User createUser(User userDomainObj) {
        var save = userRepository.save(userEntityAdapter.toEntity(userDomainObj));

        return userEntityAdapter.toDomainObj(save);
    }
}
