package catalogo.controller;

import catalogo.model.Filme;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // indica que a classe recebe e responde requisição REST
@RequestMapping("/filme") // recebe e responde o endpoint /filme
public class FilmeController {
    List<Filme> filmes = new ArrayList<>();

    // Método para requisição GET
    @GetMapping
    public List<Filme> getFilmes(){
        return this.filmes;
    } // Retorna lista de filmes

    // Método para requisição POST
    @PostMapping
    public Filme addFilme(@RequestBody Filme filme){
        this.filmes.add(filme); // adiciona livro no vetor
        return filme;
    }

    // Método para requisição PUT
    @PutMapping("/{id}")
    public Filme updateFilme(@PathVariable Long id, @RequestBody Filme novo){
        // percorre o vetor de filmes
        for(Filme filme : this.filmes){
            // Verifica se o id do filme da iteração atual é igual ao if de entrada
            if(filme.getId() == id){
                // Atualiza dados do filme
                filme.setTitulo(novo.getTitulo());
                filme.setDiretor(novo.getDiretor());
                filme.setAno(novo.getAno());
                filme.setNota(novo.getNota());
                return filme; // retorna filme atualizado
            }
        }
        return null; // Caso não seja encontrado id do filme
    }

    // Método para requisição DELETE
    @DeleteMapping("/{id}")
    public String deleteFilme(@PathVariable Long id){
        // removeIf percorre o vetor e remove caso a condição seja verdadeira
        boolean resp = this.filmes.removeIf(filme -> filme.getId() == id);
        if(resp){
            return "Filme removido com sucesso!";
        } else {
            return "Filme não encontrado.";
        }
    }
}
