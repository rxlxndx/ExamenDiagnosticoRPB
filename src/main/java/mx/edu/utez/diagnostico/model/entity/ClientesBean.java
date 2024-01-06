package mx.edu.utez.diagnostico.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ClientesBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cliente;
    @Column
    private String nombre;
    @Column
    private String apellidos;
    @Column(unique = true)
    private String curp;
    @Column
    private String f_nacimiento;

}
