package br.com.genorchiomento.springbootcleanarch.infrastructure.gateway.adapter;

import br.com.genorchiomento.springbootcleanarch.domain.entity.User;
import br.com.genorchiomento.springbootcleanarch.infrastructure.persistence.UserEntity;

public class UserEntityAdapter {
    public UserEntity toEntity(User userDomainObj) {
        return new UserEntity(
                userDomainObj.username(),
                userDomainObj.password(),
                userDomainObj.email()
        );
    }

    public User toDomainObj(UserEntity userEntity) {
        return new User(
                userEntity.getUsername(),
                userEntity.getPassword(),
                userEntity.getEmail()
        );
    }
}
