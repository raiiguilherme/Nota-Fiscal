package com.rai.msnotafiscal.repository;

import com.rai.msnotafiscal.domain.NotaFiscal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NotaFiscalRepository extends JpaRepository<NotaFiscal, UUID> {
}
