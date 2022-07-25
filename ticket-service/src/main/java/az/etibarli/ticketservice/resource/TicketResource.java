package az.etibarli.ticketservice.resource;

import az.etibarli.ticketservice.dto.request.TicketRequest;
import az.etibarli.ticketservice.service.businessService.ticketBusinessService.TicketBusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TicketResource {
    private final TicketBusinessService businessService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody TicketRequest request) {
        return ResponseEntity.ok(businessService.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(businessService.findById(id));
    }
}
