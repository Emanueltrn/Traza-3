package entidades;


import lombok.*;
import lombok.experimental.SuperBuilder;

//import javax.persistence.Entity;



@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder// no es buena practica usar el superbuilder aca por que no hereda de nada
//la clase , pero tampoco hay problema por que todas las clses heredan de obj por eso es que esta andando
//con un @Builder seria mas que suficiente

public class ImagenArticulo {
    private Long id;
    private String name;
    private String url;

}
