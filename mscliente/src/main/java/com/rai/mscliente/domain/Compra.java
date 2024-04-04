package com.rai.mscliente.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "compras")
public class Compra implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_compras;

    private String produtos;
    private Double valor;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    @JsonIgnore
   private Cliente cliente;


}
