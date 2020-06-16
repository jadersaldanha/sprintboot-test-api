# sprintboot-test-api

Um repositorio exemplo utilizando as tecnologias Java, Spring Boot e MongoDB Cloud Atlas para criacao e testes integrados de uma API em Rest.


# Execucao

Para executar locamente:

## Testes

Caso tenha o gradle instalado:

$ git clone https://github.com/jadersaldanha/sprintboot-test-api

$ cd sprintboot-test-api

$ gradle test

Caso nao tenha o gradle instalado:

$ ./gradlew test

## Api

$ git clone https://github.com/jadersaldanha/sprintboot-test-api

$ cd sprintboot-test-api

$ openssl enc -d -aes-256-ecb -md md5 -in src/main/resources/application-prod.properties.secrets -out src/main/resources/application-prod.properties -k ASK_FOR_THE_SECRET

$ gradle bootRun

ou

$ ./gradlew bootRun

# Swagger

Após a execucao dos passos acima, no navegador:

http://localhost:8080/swagger-ui.html    

# CircleCI

Pipelines de execucao no CI, artefatos gerados de teste:

https://app.circleci.com/pipelines/github/jadersaldanha/sprintboot-test-api

