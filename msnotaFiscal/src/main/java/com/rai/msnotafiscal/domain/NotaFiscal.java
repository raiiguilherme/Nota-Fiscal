package com.rai.msnotafiscal.domain;

import com.rai.msnotafiscal.DTO.ClienteDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotaFiscal {
    private UUID codigoNotaFiscal = UUID.randomUUID();
    private ClienteDTO cliente;
}
