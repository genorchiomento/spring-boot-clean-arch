<h1 align="center">
  Spring Boot Clean Architecture
</h1>

<p align="center">
<a href="https://twitter.com/genorchiomento" target="_blank">
    <img align="center" src="https://img.shields.io/static/v1?label=Twitter&message=@genorchiomento&style=flat&logo=Twitter&logoColor=white&color=00acee&labelColor=000000" alt="twitter"/>  
</a>
<img align="center" src="https://img.shields.io/static/v1?label=Tipo&message=Demo&color=8257E5&labelColor=000000" alt="Demo"/>

</p>

Demo para implementar a arquitetura limpa utilizando Spring Boot.

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JDBC](https://spring.io/projects/spring-data-jdbc)
- [H2](https://www.h2database.com)

## Como Executar

- Clonar repositório git:

```
git clone https://github.com/genorchiomento/spring-boot-clean-arch
```

- Construir o projeto:

```
./mvnw clean package
```

- Executar:

```
java -jar ./target/spring-boot-clean-arch-0.0.1-SNAPSHOT.jar
```

- Testar

```
POST/http

{
    "email": "email",
    "password": "password",
    "username": "username"
}
```