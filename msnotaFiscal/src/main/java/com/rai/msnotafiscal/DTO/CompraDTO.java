package com.rai.msnotafiscal.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompraDTO {   //sempre lembrar de colocar exatamente os mesmos nomes nas variaveis
    private Long id_compras;
    private String produtos;
    private Double valor;
    @JsonIgnore
    private ClienteDTO cliente;
}
