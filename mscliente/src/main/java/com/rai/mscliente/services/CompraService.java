package com.rai.mscliente.services;

import com.rai.mscliente.domain.Compra;
import com.rai.mscliente.repository.ClienteRepository;
import com.rai.mscliente.repository.CompraRepository;
import com.rai.mscliente.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompraService {
    private final CompraRepository repository;

    private final ProdutoRepository produtoRepository;
    private final ClienteRepository clienteRepository;


    public Compra criarCompra(String cpf, Compra compra){
        Double valor_total = 0.0;
       var cliente = clienteRepository.findClienteByCpf(cpf);
       compra.setCliente(cliente.get());

        for(int i=0; i<compra.getProdutos().size(); i++){
            valor_total += compra.getProdutos().get(i).getValor(); //adicionando o valor de todos os produtos somados
        }

        compra.setValor(valor_total);

        repository.save(compra); //salvando primeiro a compra
        for(int i=0; i<compra.getProdutos().size(); i++){
            compra.getProdutos().get(i).setCompra(compra);//colocando a mesma compra para todos os produtos
            valor_total += compra.getProdutos().get(i).getValor();
            produtoRepository.save(compra.getProdutos().get(i));

        }
        return compra;

    }
}
