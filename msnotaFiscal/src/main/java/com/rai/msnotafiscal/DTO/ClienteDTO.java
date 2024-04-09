package com.rai.msnotafiscal.DTO;

import com.rai.msnotafiscal.domain.NotaFiscal;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO { //sempre lembrar de colocar exatamente os mesmos nomes nas variaveis
    private Integer id;
    private String nome;
    private String cpf;
    private List<CompraDTO> compras = new ArrayList<>();



}
