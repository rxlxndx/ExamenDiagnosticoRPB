package mx.edu.utez.diagnostico.model.dto;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ClientesDto {

    private Integer id_cliente;

    private String nombre;

    private String apellidos;

    private String curp;

    private String f_nacimiento;

}
