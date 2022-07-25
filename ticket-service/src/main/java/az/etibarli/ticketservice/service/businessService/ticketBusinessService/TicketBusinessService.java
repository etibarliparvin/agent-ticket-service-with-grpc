package az.etibarli.ticketservice.service.businessService.ticketBusinessService;


import az.etibarli.ticketservice.dto.request.TicketRequest;
import az.etibarli.ticketservice.dto.response.TicketResponse;
import com.example.models.TicketResponses;

import java.util.List;

public interface TicketBusinessService {
    TicketResponse create(TicketRequest request);

    TicketResponse findById(Long id);

    List<TicketResponse> findAll();

    TicketResponse update(Long id, TicketRequest request);
}
