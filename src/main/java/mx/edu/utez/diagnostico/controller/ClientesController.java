package mx.edu.utez.diagnostico.controller;

import lombok.AllArgsConstructor;
import mx.edu.utez.diagnostico.model.dto.ClientesDto;
import mx.edu.utez.diagnostico.model.entity.ClientesBean;
import mx.edu.utez.diagnostico.service.impl.ClientesImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@AllArgsConstructor
public class ClientesController {
    private final ClientesImpl clientesService;
    @PostMapping
    public ClientesDto create(ClientesDto clientesDto){
        ClientesBean clientes = clientesService.save(clientesDto);
        return clientesDto.builder()
                .nombre(clientes.getNombre())
                .apellidos(clientes.getApellidos())
                .curp(clientes.getCurp())
                .f_nacimiento(clientes.getF_nacimiento())
                .build();
    }
    @GetMapping
    public List<ClientesBean> findAll(){
        return clientesService.findAll();
    }
    @GetMapping("/{id}")
    public ClientesBean findById(@PathVariable Integer id){
        return clientesService.findById(id);
    }
    @PutMapping
    public ClientesDto update(ClientesDto clientesDto){
        ClientesBean clientes = clientesService.save(clientesDto);
        return clientesDto.builder()
                .nombre(clientes.getNombre())
                .apellidos(clientes.getApellidos())
                .curp(clientes.getCurp())
                .f_nacimiento(clientes.getF_nacimiento())
                .build();
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        ClientesBean clientes = clientesService.findById(id);
        clientesService.delete(clientes);
    }

}
