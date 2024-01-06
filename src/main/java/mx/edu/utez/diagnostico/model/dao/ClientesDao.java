package mx.edu.utez.diagnostico.model.dao;

import mx.edu.utez.diagnostico.model.entity.ClientesBean;
import org.springframework.data.repository.CrudRepository;

public interface ClientesDao extends CrudRepository<ClientesBean, Integer> {
}
