package ac2.ac2.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CursoDTO {
    private Long id;
    private String descricao;
    private Integer cargaHoraria;
    private String objetivos;
    private String ementa;
}
