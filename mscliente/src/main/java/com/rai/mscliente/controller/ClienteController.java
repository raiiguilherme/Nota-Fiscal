package com.rai.mscliente.controller;

import com.rai.mscliente.DTO.ClienteDTO;
import com.rai.mscliente.domain.Cliente;
import com.rai.mscliente.domain.Compra;
import com.rai.mscliente.domain.Produto;
import com.rai.mscliente.exceptions.DomainException;
import com.rai.mscliente.services.ClienteService;
import com.rai.mscliente.services.CompraService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService service;
    private final CompraService compraService;

    @PostMapping
    public ResponseEntity<Cliente> criarCliente(@RequestBody ClienteDTO clienteDTO){
        var cliente = new Cliente();
          BeanUtils.copyProperties(clienteDTO,cliente);
         if(service.obterClientePorCpf(cliente.getCpf()).isEmpty()){

        service.criarCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
        }
         throw new DomainException("O cpf informado ja existe");



    }

    @GetMapping
    public ResponseEntity<Cliente> obterClientePorCpf(@RequestParam(name = "cpf") String cpf){
      var cliente =  service.obterClientePorCpf(cpf);
      return ResponseEntity.ok(cliente.get());

    }

    @PostMapping("/compra/{cpf}")
    public ResponseEntity<Compra> criarCompra(@PathVariable String cpf , @RequestBody Compra compra){

        var compras = compraService.criarCompra(cpf, compra);

        return ResponseEntity.ok(compras);




    }



}
