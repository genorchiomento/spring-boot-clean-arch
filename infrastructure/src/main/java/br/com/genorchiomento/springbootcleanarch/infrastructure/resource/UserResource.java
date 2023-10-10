package br.com.genorchiomento.springbootcleanarch.infrastructure.resource;

import br.com.genorchiomento.springbootcleanarch.application.usecase.CreateUserInteractor;
import br.com.genorchiomento.springbootcleanarch.domain.entity.User;
import br.com.genorchiomento.springbootcleanarch.infrastructure.resource.adapter.UserResourceAdapter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserResource {
    private final CreateUserInteractor createUserInteractor;
    private final UserResourceAdapter userResourceAdapter;

    public UserResource(CreateUserInteractor createUserInteractor, UserResourceAdapter userResourceMapperm) {
        this.createUserInteractor = createUserInteractor;
        this.userResourceAdapter = userResourceMapperm;
    }

    @PostMapping
    CreateUserResponse create(@RequestBody CreateUserRequest request) {
        User userBusinessObj = userResourceAdapter.toUser(request);
        User user = createUserInteractor.createUser(userBusinessObj);

        return userResourceAdapter.toResponse(user);
    }
}