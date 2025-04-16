# CRUD Project - Spring Boot

Este projeto é um CRUD simples desenvolvido em **Spring Boot** com **JPA** e **Lombok**, projeto desenvolvido para uma avaliação pratica, este projeto permite o gerenciamento de dados 
sobre pessoas e seus respectivos trabalhos. O projeto tem a seguinte estrutura de entidades e funcionalidades:

### Endpoints da API

#### Pessoa

- **POST** `/pessoa/create`: Criação de uma nova pessoa.
- **PUT** `/pessoa/atualizar/{id}`: Atualiza os dados de uma pessoa.
- **DELETE** `/pessoa/delete/{id}`: Deleta uma pessoa pelo ID.
- **GET** `/pessoa`: Retorna todas as pessoas cadastradas.

#### Trabalho

- **POST** `/trabalho/create`: Criação de um novo trabalho.
- **PUT** `/trabalho/atualizar/{id}`: Atualiza os dados de um trabalho.
- **DELETE** `/trabalho/delete/{id}`: Deleta um trabalho pelo ID.
- **GET** `/trabalho`: Retorna todos os trabalhos cadastrados.

### Exemplos de Requisições

#### Criação de Pessoa
![image](https://github.com/user-attachments/assets/eb2cda2c-f99c-4bce-8645-0505020e9727)

#### Update de Pessoa
![image](https://github.com/user-attachments/assets/b7707fe3-ee0d-4e78-a9ba-d2c9f9dbc4f3)

#### Criação de Trabalho
![image](https://github.com/user-attachments/assets/4b925f20-0a3e-41c3-af9e-ea6d120d2b3a)

#### Update de Trabalho
![image](https://github.com/user-attachments/assets/ce4dbb18-35de-490e-91df-ce7b1a7e9a34)

### Estrutura do Projeto

- **Pessoas**: Representa os indivíduos com campos como CPF e idade.
- **Trabalhos**: Representa os trabalhos associados a uma pessoa, com campos como nome e endereço do trabalho.
