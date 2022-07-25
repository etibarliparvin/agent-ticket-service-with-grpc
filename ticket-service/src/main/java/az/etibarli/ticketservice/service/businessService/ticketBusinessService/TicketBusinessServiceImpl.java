package az.etibarli.ticketservice.service.businessService.ticketBusinessService;

import az.etibarli.ticketservice.dto.request.TicketRequest;
import az.etibarli.ticketservice.dto.response.TicketResponse;
import az.etibarli.ticketservice.mapper.businessMapper.TicketResponseMapper;
import az.etibarli.ticketservice.service.jooqService.ticketJooqService.TicketJooqService;
import com.example.models.TicketResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketBusinessServiceImpl implements TicketBusinessService {

    private final TicketJooqService ticketJooqService;

    private final TicketResponseMapper ticketResponseMapper;

    @Override
    public TicketResponse create(TicketRequest request) {
        return ticketResponseMapper.toResponse(ticketJooqService.create(request));
    }

    @Override
    public TicketResponse findById(Long id) {
        return ticketResponseMapper.toResponse(ticketJooqService.findById(id));
    }

    @Override
    public List<TicketResponse> findAll() {
        return ticketResponseMapper.toResponseList(ticketJooqService.findAll());
    }

    @Override
    public TicketResponse update(Long id, TicketRequest request) {
        return ticketResponseMapper.toResponse(ticketJooqService.update(id, request));
    }
}
