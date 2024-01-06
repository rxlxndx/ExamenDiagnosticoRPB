package mx.edu.utez.diagnostico.service.impl;

import lombok.AllArgsConstructor;
import mx.edu.utez.diagnostico.model.dao.ClientesDao;
import mx.edu.utez.diagnostico.model.dto.ClientesDto;
import mx.edu.utez.diagnostico.model.entity.ClientesBean;
import mx.edu.utez.diagnostico.service.iClientes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientesImpl implements iClientes {
    private final ClientesDao clientesDao;

    @Override
    public ClientesBean save(ClientesDto clientesDto) {
        ClientesBean clientesBean = ClientesBean.builder()
                .nombre(clientesDto.getNombre())
                .apellidos(clientesDto.getApellidos())
                .curp(clientesDto.getCurp())
                .f_nacimiento(clientesDto.getF_nacimiento())
                .build();
        return clientesDao.save(clientesBean);
    }

    @Override
    public List<ClientesBean> findAll() {
        return (List<ClientesBean>) clientesDao.findAll();
    }

    @Override
    public ClientesBean findById(Integer id) {
        return clientesDao.findById(id).orElse(null);
    }

    @Override
    public void delete(ClientesBean clientesBean) {
        clientesDao.delete(clientesBean);

    }
}
