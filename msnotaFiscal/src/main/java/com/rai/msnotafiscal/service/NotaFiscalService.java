package com.rai.msnotafiscal.service;

import com.rai.msnotafiscal.clientesResponse.ClientesFeing;
import com.rai.msnotafiscal.domain.NotaFiscal;
import com.rai.msnotafiscal.repository.NotaFiscalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotaFiscalService {

        private final ClientesFeing clientesFeing;
        private final NotaFiscalRepository repository;

        public NotaFiscal criarNotaFiscal(String cpf){
                NotaFiscal notaFiscal = new NotaFiscal();
                var cliente = clientesFeing.obterClientePorCpf(cpf);
                notaFiscal.setId_cliente(cliente.getId());
                repository.save(notaFiscal);
                return notaFiscal;
        }


}

