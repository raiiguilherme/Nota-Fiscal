package com.rai.msnotafiscal.controller;

import com.rai.msnotafiscal.DTO.ClienteDTO;
import com.rai.msnotafiscal.clientesResponse.ClientesFeing;
import com.rai.msnotafiscal.domain.NotaFiscal;
import com.rai.msnotafiscal.service.NotaFiscalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nota")
@RequiredArgsConstructor
public class NotaController {
    private final ClientesFeing clientesFeing;
    private final NotaFiscalService notaFiscalService;
   @GetMapping
    public ResponseEntity<ClienteDTO> obterClientePorId(@RequestParam("cpf") String cpf){
        var cliente = clientesFeing.obterClientePorCpf(cpf);
        return  ResponseEntity.ok(cliente);
    }

    @PostMapping("/criar")
    public ResponseEntity<NotaFiscal> criarNotaFiscal(@RequestParam("cpf") String cpf){
        var notafiscal = notaFiscalService.criarNotaFiscal(cpf);
        return ResponseEntity.status(HttpStatus.CREATED).body(notafiscal);
    }
}
