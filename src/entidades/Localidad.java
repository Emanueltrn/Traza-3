package entidades;

import lombok.*;
import lombok.experimental.SuperBuilder;



@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@SuperBuilder
@ToString(exclude = "domicilio")
public class Localidad {
    private Long id;
    private String nombre;
    private Provincia provincia;

    private Domicilio domicilio;

//    @Override
//    public String toString() {
//        return "Localidad{" +
//                "id=" + id +
//                ", nombre='" + nombre + '\'' +
//                ", provincia=" + (provincia != null ? provincia.getNombre() : null) + // Evitar recursión infinita
//                '}';
//    }
}
