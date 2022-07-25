package az.etibarli.ticketservice.dto.request;

import lombok.Data;

@Data
public class TicketRequest {
    String code;
    Long status;
    Long issuerAgent;
}
