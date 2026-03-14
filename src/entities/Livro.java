package entities;

public class Livro {
    private Integer id;
    private String titulo;
    private String autor;
    private boolean disponivel;

    // Construtor
    public Livro(Integer id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; // Todo livro recém-cadastrado começa disponível
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    // Apenas o sistema pode alterar a disponibilidade via métodos de empréstimo/devolução
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // toString para facilitar a listagem
    @Override
    public String toString() {
        String status = disponivel ? "Disponível" : "Emprestado";
        return "ID: " + id + " | Título: " + titulo + " | Autor: " + autor + " | Status: " + status;
    }
}