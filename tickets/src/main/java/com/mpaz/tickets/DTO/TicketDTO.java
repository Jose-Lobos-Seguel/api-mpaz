package com.mpaz.tickets.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {

    private Integer ticket_id;

    private String ticket_titulo;

    private String ticket_descripcion;

    private String ticket_estado;

    private Integer ticket_prioridad;

    private String ticket_ubicacion;

    private Integer imagen_id;
}
