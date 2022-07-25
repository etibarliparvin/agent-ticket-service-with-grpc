package az.etibarli.ticketservice;

import az.etibarli.ticketservice.dto.request.TicketRequest;
import az.etibarli.ticketservice.dto.response.TicketResponse;
import az.etibarli.ticketservice.mapper.businessMapper.TicketResponseMapper;
import az.etibarli.ticketservice.mapper.recordMapper.TicketRecordMapper;
import az.etibarli.ticketservice.repository.TicketRepository;
import az.etibarli.ticketservice.repository.TicketRepositoryImpl;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.TicketRecord;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketServiceApplication.class, args);
    }

}
