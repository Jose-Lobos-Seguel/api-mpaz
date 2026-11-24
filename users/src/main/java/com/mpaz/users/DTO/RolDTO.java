package com.mpaz.users.DTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolDTO {

    private Integer rol_id;

    private String rol_nombre;

    private List<Integer> usuarios_id;
}
