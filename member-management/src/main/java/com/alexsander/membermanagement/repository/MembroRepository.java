package com.alexsander.membermanagement.repository;

import com.alexsander.membermanagement.model.Membro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MembroRepository extends JpaRepository<Membro,Long> {

    Optional<Membro> findByCpf(String cpf);

    Boolean existsByCpf(String cpf);

}