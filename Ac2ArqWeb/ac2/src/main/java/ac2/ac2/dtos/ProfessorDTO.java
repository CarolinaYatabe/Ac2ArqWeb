package ac2.ac2.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProfessorDTO {
    private Long id;
    private String nome;
    private String cpf;
    private String rg;
    private String cidade;
    private String estado;
    private String cep;
    private String celular;
}
