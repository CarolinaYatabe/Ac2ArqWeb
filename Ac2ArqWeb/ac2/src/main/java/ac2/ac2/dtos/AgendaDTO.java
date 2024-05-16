package ac2.ac2.dtos;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AgendaDTO {
    private Long id;
    private String curso;
    private String conteudoCurso;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private String professores;
    private String cidade;
    private String estado;
    private String cep;

}
