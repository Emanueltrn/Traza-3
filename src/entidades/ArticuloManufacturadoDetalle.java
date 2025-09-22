package entidades;


import lombok.*;
import lombok.experimental.SuperBuilder;

//import javax.persistence.Entity;
//import javax.persistence.ManyToOne;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString


@SuperBuilder
public class ArticuloManufacturadoDetalle {

    private Long id;
    private Integer cantidad;


    private ArticuloInsumo articuloInsumo; //1 detalle exclusivo de un solo articulos
}
