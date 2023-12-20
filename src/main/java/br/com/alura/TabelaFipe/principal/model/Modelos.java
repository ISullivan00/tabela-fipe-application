package br.com.alura.TabelaFipe.principal.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.alura.TabelaFipe.principal.Dados;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Modelos(List<Dados> modelos) {
    
}
