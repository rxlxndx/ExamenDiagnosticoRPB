package mx.edu.utez.diagnostico.service;

import mx.edu.utez.diagnostico.model.dto.ClientesDto;
import mx.edu.utez.diagnostico.model.entity.ClientesBean;

import java.util.List;

public interface iClientes {
    ClientesBean save(ClientesDto clientesDto);
   List<ClientesBean>  findAll();

    ClientesBean findById(Integer id);

    void delete(ClientesBean clientesBean);
}
