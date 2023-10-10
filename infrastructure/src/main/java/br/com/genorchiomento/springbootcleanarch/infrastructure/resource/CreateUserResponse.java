package br.com.genorchiomento.springbootcleanarch.infrastructure.resource;

public record CreateUserResponse(
        String username,
        String email
) {
}
