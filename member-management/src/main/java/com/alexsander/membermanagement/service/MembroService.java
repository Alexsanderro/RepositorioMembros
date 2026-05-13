package com.alexsander.membermanagement.service;

import com.alexsander.membermanagement.model.Membro;
import com.alexsander.membermanagement.repository.MembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembroService {

    @Autowired
    private MembroRepository repository;

    public Membro cadastrar(Membro membro) {

        validarIdade(membro.getAniversario());
        validarCpf(membro.getCpf());

        String cpfnumeros = membro.getCpf().replaceAll("\\D", "");
        membro.setCpf(cpfnumeros);

        return repository.save(membro);
    }

}