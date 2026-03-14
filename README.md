# 📚 Sistema de Gerenciamento de Biblioteca (Console App)

Um sistema de gerenciamento de biblioteca desenvolvido em Java, focado na aplicação prática de conceitos fundamentais de Programação Orientada a Objetos (POO).

Este projeto foi construído para consolidar o aprendizado em estruturação de código, encapsulamento, manipulação de coleções em memória e tratamento de exceções.

## 🛠️ Tecnologias Utilizadas

* **Java (Core):** Linguagem principal do projeto.
* **Paradigma POO:** Uso intensivo de classes, objetos, encapsulamento e composição.
* **Collections:** Utilização de `ArrayList` para simular um banco de dados em memória.
* **Tratamento de Exceções:** Implementação de `try-catch` para garantir a resiliência do sistema contra entradas inválidas do usuário.

## ✨ Funcionalidades (CRUD e Lógica de Negócio)

O sistema opera via terminal (console) de forma interativa e contínua, oferecendo as seguintes funcionalidades:

1. **Adicionar Livro:** Cadastro de novos exemplares com ID, Título e Autor.
2. **Listar Acervo:** Exibição completa de todos os livros cadastrados e seus respectivos status.
3. **Emprestar Livro:** Validação de disponibilidade e alteração do status do livro para "Emprestado".
4. **Devolver Livro:** Validação e retorno do status do livro para "Disponível".
5. **Tratamento de Falhas:** O sistema é imune a falhas de digitação (ex: letras em campos numéricos), retornando mensagens amigáveis graças à captura de `InputMismatchException`.

## 🏗️ Estrutura do Projeto

O código foi organizado visando boas práticas de separação de responsabilidades, preparando o terreno para futuras implementações de frameworks como o Spring Boot:

* `entities/`: Contém as entidades do domínio (`Livro`) e a classe com as regras de negócio e manipulação de dados (`Biblioteca`).
* `application/`: Contém a classe `Program`, responsável exclusivamente pela interface com o usuário (Menu via Scanner) e injeção das dependências.

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   git clone (https://github.com/devpr1nce/biblioteca-java.git)