package com.rai.msnotafiscal.clientesResponse;

import com.rai.msnotafiscal.DTO.ClienteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "http://localhost:8085/", name = "mscliente")
public interface ClientesFeing{

   @GetMapping("clientes")
    ClienteDTO obterClientePorCpf(@RequestParam("cpf") String cpf);

}
