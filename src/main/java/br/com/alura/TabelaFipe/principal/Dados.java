package br.com.alura.TabelaFipe.principal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record Dados(String codigo, String nome ) {
    
}
