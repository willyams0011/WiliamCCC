package pe.edu.upeu.sysventas.model;

import jakarta.persistence.*;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "upeu_unid_medida")
public class UnidadMedida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_unidad")
    private Long idUnidad;
    @Column(name = "nombre_medida", nullable = false, length = 60)
    private String nombreMedida;
}
