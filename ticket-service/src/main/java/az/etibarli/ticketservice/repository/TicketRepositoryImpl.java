package az.etibarli.ticketservice.repository;

import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.TicketRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static nu.studer.sample.Tables.TICKET;

@Repository
@RequiredArgsConstructor
public class TicketRepositoryImpl implements TicketRepository<TicketRecord> {

    private final DSLContext context;

    @Override
    public TicketRecord create(TicketRecord record) {
        return context.insertInto(TICKET)
                .set(record)
                .returning()
                .fetchOneInto(TicketRecord.class);
    }

    @Override
    public TicketRecord findById(Long id) {
        return context.select()
                .from(TICKET)
                .where(TICKET.ID.eq(id))
                .fetchOneInto(TicketRecord.class);
    }

    @Override
    public List<TicketRecord> findAll() {
        return context.select()
                .from(TICKET)
                .fetchInto(TicketRecord.class);
    }

    @Override
    public TicketRecord update(Long id, TicketRecord record) {
        return context.update(TICKET)
                .set(TICKET.CODE, record.getCode())
                .set(TICKET.ISSUER_AGENT, record.getIssuerAgent())
                .set(TICKET.STATUS, record.getStatus())
                .where(TICKET.ID.eq(id))
                .returning().fetchOneInto(TicketRecord.class);
    }
}
