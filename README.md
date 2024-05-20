
# Desafio em Angular/Spring

![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)

Este projeto especificamente trata-se do Backend desenvolvido em spring/boot.

## Índice
- [Sobre](#sobre)
- [Instalação](#instalação)
- [Uso](#uso)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Sobre
Você está trabalhando em um projeto de uma aplicação web usando Java (Spring) no
back-end e angular no front-end. Sua tarefa é criar a funcionalidade de cadastro de
usuários com asseguintes regras:

API de Back-end (Java/ Spring):
• Crie uma API RESTful em Java para processar o registro de usuários.
• Valide os dados recebidos da solicitação, incluindo a confirmação de senha.
• Armazene os usuários registrados em um banco de dados PostgreSQL.
• Retorne uma resposta apropriada para o front-end. (por exemplo, sucesso ou
erro).


## Instalação
1. Clone o repositório:
   ```sh
   git clone https://github.com/usuario/repo.git](https://github.com/marcosgsilva/desafiospringboot.git#

# requisitos
1. Ter o Java 17 no minimo intalado na máquina.
2. Ter o Docker instalado na máquina.
3. Ter o Intelij ou outra IDE de sua preferência
4. Integrar o tomcat ao seu servidor.

## Uso
1. Abra o terminal ou a ide e execute o docker-compose.yml, esse arquivo contem os ambientes do Postgres e adminer(Gerenciador do Postgres)
2. Atualizar suas depedências pela ferramenta ou rode pelo terminal

```
   mvn clean install 
   mvn install
```
3. Tenha o insomnia instalado na sua máquina.
4. Para abrir o Swagger
 ```
   http://localhost:8080/api/user/swagger-ui/index.html
```



![Captura de tela de 2024-05-20 12-57-01](https://github.com/marcosgsilva/desafiospringboot/assets/12539016/43853449-934e-4167-9d57-ef9281d3e8db)
