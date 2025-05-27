package catalogo.model;

public class Filme {
    private Long id;
    private String titulo;
    private String diretor;
    private int ano;
    private Float nota;

    // GET/SET id
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // GET/SET titulo
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // GET/SET diretor
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    // GET/SET ano
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) { this.ano = ano; }

    // GET/SET nota
    public Float getNota() {
        return nota;
    }
    public void setNota(Float nota) { this.nota = nota; }
}
