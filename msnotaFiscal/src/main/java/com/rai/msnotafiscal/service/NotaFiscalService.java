package com.rai.msnotafiscal.service;

import com.rai.msnotafiscal.clientesResponse.ClientesFeing;
import com.rai.msnotafiscal.domain.NotaFiscal;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotaFiscalService {

        private final ClientesFeing clientesFeing;

        public NotaFiscal criarNotaFiscal(String cpf){
                NotaFiscal notaFiscal = new NotaFiscal();
                var cliente = clientesFeing.obterClientePorCpf(cpf);
                notaFiscal.setCliente(cliente);
                return notaFiscal;
        }


}

