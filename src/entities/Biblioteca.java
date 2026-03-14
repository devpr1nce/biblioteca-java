package entities;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    // Nossa lista encapsulada
    private List<Livro> acervo = new ArrayList<>();

    // --- C R U D ---

    // CREATE (Adicionar)
    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
        System.out.println("Livro '" + livro.getTitulo() + "' adicionado com sucesso!");
    }

    // READ (Listar todos)
    public void listarAcervo() {
        System.out.println("\n--- Acervo da Biblioteca ---");
        if (acervo.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            for (Livro livro : acervo) {
                System.out.println(livro); // Chama o toString automaticamente
            }
        }
    }

    // Método auxiliar de busca (READ específico)
    public Livro buscarPorId(Integer id) {
        for (Livro livro : acervo) {
            if (livro.getId().equals(id)) {
                return livro;
            }
        }
        return null; // Retorna nulo se não achar
    }

    // --- LÓGICA DE NEGÓCIO ---

    // Emprestar
    public void emprestarLivro(Integer id) {
        Livro livro = buscarPorId(id);

        if (livro == null) {
            System.out.println("Erro: Livro não encontrado.");
        } else if (!livro.isDisponivel()) {
            System.out.println("Erro: O livro '" + livro.getTitulo() + "' já está emprestado.");
        } else {
            livro.setDisponivel(false);
            System.out.println("Sucesso: Livro '" + livro.getTitulo() + "' Emprestado!");
        }
    }

    // Devolver
    public void devolverLivro(Integer id) {
        Livro livro = buscarPorId(id);

        if (livro == null) {
            System.out.println("Erro: Livro não encontrado.");
        } else if (livro.isDisponivel()) {
            System.out.println("Erro: O livro '" + livro.getTitulo() + "' já consta como disponível.");
        } else {
            livro.setDisponivel(true);
            System.out.println("Sucesso: Livro '" + livro.getTitulo() + "' devolvido!");
        }
    }
}