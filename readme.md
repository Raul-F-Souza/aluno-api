# Projeto Escola em Java com MySQL

Este projeto é uma API simples de gestão de alunos, utilizando **Spring Boot** com **Gradle**, **MySQL** como banco de dados e uma interface web com **HTML**, **CSS** e **JavaScript**. Ele inclui uma entidade "Aluno" com operações CRUD (GET, POST, PUT, DELETE).

## Tecnologias Utilizadas

- **Spring Boot** (2.7.x ou versão mais recente)
- **Gradle** (com Groovy)
- **MySQL** (Banco de dados)
- **Thymeleaf** (Para renderização de HTML)
- **HTML**, **CSS**, **JavaScript** (Interface web)

## Funcionalidades

- **GET**: Obter todos os alunos ou um aluno específico.
- **POST**: Criar um novo aluno.
- **PUT**: Atualizar um aluno existente.
- **DELETE**: Excluir um aluno.

## Como Rodar o Projeto

### 1. Configuração do Projeto

#### 1.1 Criar o Projeto Spring Boot

1. Acesse o [Spring Initializr](https://start.spring.io/).
2. Configure o projeto com as seguintes opções:
   - **Project**: Gradle Project
   - **Language**: Java
   - **Spring Boot**: 2.7.x (ou a versão mais recente)
   - **Group**: `com.exemplo`
   - **Artifact**: `aluno-api`
   - **Name**: `aluno-api`
   - **Package Name**: `com.exemplo.alunoapi`
   - **Packaging**: Jar
   - **Java**: 11 (ou a versão que preferir)

3. Adicione as seguintes dependências:
   - Spring Web
   - Spring Data JPA
   - MySQL Driver
   - Thymeleaf

#### 1.2 Estrutura do Projeto

A estrutura do seu projeto será semelhante à seguinte:

```
aluno-api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── exemplo/
│   │   │           └── alunoapi/
│   │   │               ├── controller/
│   │   │               │   └── AlunoController.java
│   │   │               ├── model/
│   │   │               │   └── Aluno.java
│   │   │               ├── repository/
│   │   │               │   └── AlunoRepository.java
│   │   │               └── AlunoApiApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── css/
│   │       │   │   └── styles.css
│   │       │   └── js/
│   │       │       └── scripts.js
│   │       ├── templates/
│   │       │   └── index.html
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── exemplo/
│                   └── alunoapi/
│                       └── AlunoApiApplicationTests.java
└── build.gradle
```