package az.etibarli.ticketservice.mapper.businessMapper;

import az.etibarli.ticketservice.dto.response.TicketResponse;
import nu.studer.sample.tables.records.TicketRecord;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TicketResponseMapper {

    public TicketResponse toResponse(TicketRecord record) {
        TicketResponse response = new TicketResponse();
        response.setId(record.getId());
        response.setCode(record.getCode());
        response.setStatus(record.getStatus());
        response.setIssuerAgent(record.getIssuerAgent());
        response.setCreationTime(record.getCreationTime());
        return response;
    }

    public List<TicketResponse> toResponseList(List<TicketRecord> records) {
        List<TicketResponse> responses = new ArrayList<>();
        responses.addAll(records.stream().map(this::toResponse).collect(Collectors.toList()));
        return responses;
    }
}
