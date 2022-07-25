package az.etibarli.ticketservice.service.jooqService.ticketJooqService;

import az.etibarli.ticketservice.dto.request.TicketRequest;
import az.etibarli.ticketservice.mapper.recordMapper.TicketRecordMapper;
import az.etibarli.ticketservice.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.TicketRecord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketJooqServiceImpl implements TicketJooqService {

    private final TicketRecordMapper ticketRecordMapper;
    private final TicketRepository<TicketRecord> ticketRepository;

    @Override
    public TicketRecord create(TicketRequest request) {
        return ticketRepository.create(ticketRecordMapper.toRecord(request));
    }

    @Override
    public TicketRecord findById(Long id) {
        return ticketRepository.findById(id);
    }

    @Override
    public List<TicketRecord> findAll() {
        return ticketRepository.findAll();
    }

    @Override
    public TicketRecord update(Long id, TicketRequest request) {
        return ticketRepository.update(id, ticketRecordMapper.toRecord(request));
    }
}
