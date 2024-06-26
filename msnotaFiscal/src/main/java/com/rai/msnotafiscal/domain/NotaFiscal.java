package com.rai.msnotafiscal.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rai.msnotafiscal.DTO.ClienteDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Table(name = "tb_notafiscal")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotaFiscal {
    @Id
    private UUID codigoNotaFiscal = UUID.randomUUID();
    private Long id_cliente;
    private Long id_compra;
    private Double valor_da_compra;
}
