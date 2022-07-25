package az.etibarli.ticketservice.mapper.recordMapper;

import az.etibarli.ticketservice.dto.request.TicketRequest;
import nu.studer.sample.tables.records.TicketRecord;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TicketRecordMapper {

    public TicketRecord toRecord(TicketRequest request) {
        TicketRecord record = new TicketRecord();
        record.setCode(request.getCode());
        record.setStatus(request.getStatus());
        record.setIssuerAgent(request.getIssuerAgent());
        record.setCreationTime(LocalDateTime.now());
        return record;
    }

    public List<TicketRecord> toRecordList(List<TicketRequest> requests) {
        List<TicketRecord> records = new ArrayList<>();
        records.addAll(requests.stream().map(this::toRecord).collect(Collectors.toList()));
        return records;
    }
}
