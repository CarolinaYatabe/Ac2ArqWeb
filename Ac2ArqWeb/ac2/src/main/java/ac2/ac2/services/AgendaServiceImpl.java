package ac2.ac2.services;

import org.springframework.stereotype.Service;

import ac2.ac2.dtos.AgendaDTO;
import ac2.ac2.exceptions.RegraNegocioException;
import ac2.ac2.models.Agenda;
import ac2.ac2.repositories.AgendaRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AgendaServiceImpl implements AgendaService {
    private AgendaService agendaService;

    public AgendaServiceImpl(AgendaService agendaService) {
        this.agendaService = agendaService;
    }

    @Override
    @Transactional
    public Agenda salvarAgenda(AgendaDTO agendaDTO){
        Agenda agenda = AgendaRepository.findById(agendaDTO.getId())
        .orElseThrow(
            () -> new RegraNegocioException("Agenda não encontrada"));

        Agenda agenda = new Agenda();
        agenda.setId(agendaDTO.getId());
        agenda.setCurso(agendaDTO.getCurso());
        agenda.setDataHoraInicio(agendaDTO.getDataHoraInicio());
        agenda.setDataHoraFim(agendaDTO.getDataHoraFim());
        agenda.setProfessores(agendaDTO.getProfessores());
        agenda.setCidade(agendaDTO.getCidade());
        agenda.setEstado(agendaDTO.getEstado());
        agenda.setCep(agendaDTO.getCep());
   
    }


    
    
}
