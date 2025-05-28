package catalogo.model;

public class Filme {
    private Long id;
    private String titulo;
    private String diretor;
    private int ano;
    private Float nota;

    // Constructor
    public Filme() {
        this.id = null;
        this.titulo = "Titulo";
        this.diretor = "Diretor";
        this.ano = 0;
        this.nota = 0.0f;
    }
    public Filme(Long id, String titulo, String diretor, int ano, Float nota) {
        this.id = id;
        this.titulo = titulo;
        this.diretor = diretor;
        this.ano = ano;
        this.nota = nota;
    }

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
    public void setNota(Float nota) {
        if (nota > 10 || nota < 0) {
            System.out.println("Nota deve estar entre 0 e 10");
            this.nota = 0.0f;
        } else {
            this.nota = nota;
        }
    }
}
