package entidades;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString(exclude = "sucursales")//excluye sucursal para evitar recursion
@SuperBuilder //aca solo prodria usar builder solo,pero es lomismo commo todo hereda de obj
public class Empresa {
    private Long id;
    private String nombre;
    private String razonSocial;
    private Long cuil;

    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();

}
