package entidades;


import lombok.*;
import lombok.experimental.SuperBuilder;

//import javax.persistence.Entity;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
import java.util.HashSet;
import java.util.Set;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString(exclude = "sucursales")
@Setter
@SuperBuilder// usado cuanado tengo herencia


public class Articulo  {
    protected Long id;
    protected String denominacion;
    protected Double precioVenta;



    @Builder.Default

    protected Set<ImagenArticulo> imagenes = new HashSet<>();


    protected UnidadMedida unidadMedida;


    private Categoria categoria;

    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();


}

