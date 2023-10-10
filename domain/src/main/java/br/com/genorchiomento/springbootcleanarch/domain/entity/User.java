package br.com.genorchiomento.springbootcleanarch.domain.entity;

public record User(
        String username,
        String password,
        String email
) {
}
