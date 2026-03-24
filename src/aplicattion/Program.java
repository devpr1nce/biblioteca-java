package application;

import entities.Biblioteca;
import entities.Livro;

import java.util.InputMismatchException; // Importação necessária
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Biblioteca minhaBiblioteca = new Biblioteca();
        int opcao = 0;

        System.out.println("=== BEM-VINDO AO SISTEMA DA BIBLIOTECA ===");

        while (opcao != 5) {
            // O bloco TRY envolve tudo que pode gerar erro de digitação.
            try {
                System.out.println("\n---------------------------------");
                System.out.println("1 - Adicionar Livro");
                System.out.println("2 - Listar Acervo");
                System.out.println("3 - Emprestar Livro");
                System.out.println("4 - Devolver Livro");
                System.out.println("5 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = sc.nextInt();
                sc.nextLine(); // Consumir a quebra de linha

                System.out.println("---------------------------------\n");

                switch (opcao) {
                    case 1:
                        System.out.println("--- NOVO LIVRO ---");
                        System.out.print("Digite o ID (apenas números): ");
                        Integer id = sc.nextInt();
                        sc.nextLine(); // Consumir a quebra de linha

                        System.out.print("Digite o Título: ");
                        String titulo = sc.nextLine();

                        System.out.print("Digite o Autor: ");
                        String autor = sc.nextLine();

                        Livro novoLivro = new Livro(id, titulo, autor);
                        minhaBiblioteca.adicionarLivro(novoLivro);
                        break;

                    case 2:
                        minhaBiblioteca.listarAcervo();
                        break;

                    case 3:
                        System.out.println("--- EMPRÉSTIMO ---");
                        System.out.print("Digite o ID do livro que deseja emprestar: ");
                        Integer idEmprestimo = sc.nextInt();
                        minhaBiblioteca.emprestarLivro(idEmprestimo);
                        break;

                    case 4:
                        System.out.println("--- DEVOLUÇÃO ---");
                        System.out.print("Digite o ID do livro que deseja devolver: ");
                        Integer idDevolucao = sc.nextInt();
                        minhaBiblioteca.devolverLivro(idDevolucao);
                        break;

                    case 5:
                        System.out.println("Encerrando o sistema... Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida! Escolha um número de 1 a 5.");
                }
            }
            // O bloco CATCH captura o erro específico do Scanner.
            catch (InputMismatchException e) {
                System.out.println("\n❌ ERRO DE ENTRADA: Por favor, digite apenas números inteiros.");
                sc.nextLine(); // Limpar o "lixo" que causou o erro do buffer
            }
            // Uma rede de segurança para qualquer outro erro inesperado.
            catch (Exception e) {
                System.out.println("\n❌ Ocorreu um erro inesperado: " + e.getMessage());
                sc.nextLine();
            }
        }

        sc.close();
    }
}
