package com.mpaz.users.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer usuario_id;

    @Column(nullable = false, length = 120)
    @Size(min = 4, message = "El campo debe contener al menos 4 caracteres")
    @NotBlank(message = "El campo no puede estar vacio")
    private String usuario_nombre;

    @Column(nullable = false, length = 60)
    @Email(message = "Correo invalido")
    @NotBlank(message = "El campo no puede estar vacio")
    private String usuario_correo;

    @Column(nullable = false, length = 20)
    @Size(min = 4, message = "El campo debe contener al menos 4 caracteres")
    @NotBlank(message = "El campo no puede estar vacio")
    private String usuario_contraseña;

    @ManyToOne
    @JoinColumn(name = "rol_id", nullable = false)
    private Rol rol;

}
