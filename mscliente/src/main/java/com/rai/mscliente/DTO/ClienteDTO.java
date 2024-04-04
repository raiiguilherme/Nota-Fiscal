package com.rai.mscliente.DTO;

import com.rai.mscliente.domain.Compra;

import java.util.List;

public record ClienteDTO(
         String nome,
         String cpf,
         List<Compra> compras
) {
}
