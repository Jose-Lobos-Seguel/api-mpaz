package com.mpaz.tickets.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "tickets")
public class Ticket{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticket_id;

    @Column(nullable = false, length = 40)
    @Size(min = 4, message = "El campo debe contener almenos 4 caracteres")
    @NotBlank(message = "Este campo no puede estar vacio")
    private String ticket_titulo;

    @Column(nullable = false, length = 200)
    @Size(min = 4, message = "El campo debe contener almenos 4 caracteres")
    @NotBlank(message = "Este campo no puede estar vacio")
    private String ticket_descripcion;

    @Column(nullable = false, length = 30)
    @Size(min = 4, message = "El campo debe contener almenos 4 caracteres")
    @NotBlank(message = "Este campo no puede estar vacio")
    //Esto no puede ser modificado directamente
    //Tiene estados
    //"Esperando revision" "Revisado" "Resuelto"
    private String ticket_estado;

    @Column(nullable = false)
    @NotNull(message = "Este campo no puede estar vacio")
    @Min(value = 1, message = "Este campo no puede tener un valor menor a 1")
    @Max(value = 3, message = "Este campo no puede tener un valor mayor a 3")
    //Este campo se mide en numeros del 1 al 3
    //Este campo solo se puede modificar por ciertos roles
    private Integer ticket_prioridad;

    @Column(nullable = false, length = 200)
    @Size(min = 4, message = "El campo debe contener almenos 4 caracteres")
    @NotBlank(message = "Este campo no puede estar vacio")
    //Estos datos estaran en una lista desplegable
    //Estos datos estaran precargados
    private String ticket_ubicacion;

    @OneToOne
    @JoinColumn(name = "imagen_id", nullable = false)
    private Imagen imagen;


    //PONER AQUI RELACION A USUARIO QUE CREA EL TICKET CUANDO LA RELACION ESTE LISTA
}
