package com.nmsilos.demoparkapi.web.dto.mapper;

import com.nmsilos.demoparkapi.entity.Cliente;
import com.nmsilos.demoparkapi.web.dto.ClienteCreateDto;
import com.nmsilos.demoparkapi.web.dto.ClienteResponseDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteMapper {

    public static Cliente toCliente(ClienteCreateDto cliente) {
        return new ModelMapper().map(cliente, Cliente.class);
    }

    public static ClienteResponseDto toDto(Cliente cliente) {
        return new ModelMapper().map(cliente, ClienteResponseDto.class);
    }

}
