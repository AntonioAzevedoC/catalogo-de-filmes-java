# catalogo-de-filmes-java
Trabalho de Programação Orientada a Objeto

Exercício: API de Cadastro de Filmes
Implemente uma API REST em Java com Spring Boot para gerenciar um catálogo de filmes, usando lista em memória (sem banco de dados).

A API deve expor as seguintes operações sobre objetos da classe Filme:

✅ Classe Filme (modelo)
Atributos:

Long id

String titulo

String diretor

int ano

float nota (avaliação entre 0 e 10)

Inclua:

Construtor vazio

Construtor com todos os atributos

Métodos getters e setters

toString() (opcional)

✅ Controller FilmeController
Use uma lista do tipo List<Filme> para armazenar os filmes na memória.

Implemente os seguintes métodos:

GET /filmes
Retorna todos os filmes.

POST /filmes
Adiciona um novo filme à lista.

DELETE /filmes/{id}
Remove o filme com o id informado.

PUT /filmes/{id}
Atualiza as informações do filme com o id informado, substituindo título, diretor, ano e nota.

🎯 Objetivo pedagógico
Este exercício reforça os seguintes conceitos:

Criação de APIs REST com Spring Boot

Manipulação de listas em memória

Uso dos verbos HTTP: GET, POST, PUT, DELETE

Uso de @RestController, @RequestMapping, @GetMapping, @PostMapping, @PutMapping, @DeleteMapping

Trabalho com @RequestBody e @PathVariable
