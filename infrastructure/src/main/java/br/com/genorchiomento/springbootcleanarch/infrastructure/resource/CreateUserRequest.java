package br.com.genorchiomento.springbootcleanarch.infrastructure.resource;

public record CreateUserRequest(
        String username,
        String password,
        String email
) {
}
