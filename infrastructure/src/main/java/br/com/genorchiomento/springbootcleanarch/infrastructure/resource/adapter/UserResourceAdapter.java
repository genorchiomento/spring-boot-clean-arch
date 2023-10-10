package br.com.genorchiomento.springbootcleanarch.infrastructure.resource.adapter;

import br.com.genorchiomento.springbootcleanarch.domain.entity.User;
import br.com.genorchiomento.springbootcleanarch.infrastructure.resource.CreateUserRequest;
import br.com.genorchiomento.springbootcleanarch.infrastructure.resource.CreateUserResponse;

public class UserResourceAdapter {

    public CreateUserResponse toResponse(User user) {
        return new CreateUserResponse(user.username(), user.email());
    }

   public User toUser(CreateUserRequest request) {
        return new User(request.username(), request.password(), request.email());
    }
}
