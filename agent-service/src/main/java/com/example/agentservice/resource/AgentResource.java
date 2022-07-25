package com.example.agentservice.resource;

import com.example.agentservice.dto.request.TicketRequest;
import com.example.agentservice.service.businessService.agentBusinessService.AgentBusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agents")
@RequiredArgsConstructor
public class AgentResource {

    private final AgentBusinessService agentBusinessService;

    @PostMapping("/createTicket")
    public ResponseEntity<?> create(@RequestBody TicketRequest request) {
        return ResponseEntity.ok(agentBusinessService.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(agentBusinessService.findById(id));
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(agentBusinessService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") Long id, @RequestBody TicketRequest request) {
        return ResponseEntity.ok(agentBusinessService.update(id, request));
    }
}
