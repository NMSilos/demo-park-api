package com.nmsilos.demoparkapi.service;

import com.nmsilos.demoparkapi.entity.Cliente;
import com.nmsilos.demoparkapi.exception.EntityNotFoundException;
import com.nmsilos.demoparkapi.repository.ClienteRepository;
import com.nmsilos.demoparkapi.web.exception.CpfUniqueViolationException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Transactional
    public Cliente salvar(Cliente cliente) {
        try {
            return clienteRepository.save(cliente);
        }
        catch (DataIntegrityViolationException ex) {
            throw new CpfUniqueViolationException(
                    String.format("CPF %s não pode ser cadastrado, já existe no sistema", cliente.getCpf())
            );
        }
    }

    @Transactional
    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException(String.format("Cliente id=%s não encontrado no sistema", id))
        );
    }
}
