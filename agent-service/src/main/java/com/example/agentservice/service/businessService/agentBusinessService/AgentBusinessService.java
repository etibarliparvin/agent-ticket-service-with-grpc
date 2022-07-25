package com.example.agentservice.service.businessService.agentBusinessService;

import com.example.agentservice.dto.request.TicketRequest;
import com.example.agentservice.dto.response.TicketResponse;

import java.util.List;

public interface AgentBusinessService {

    TicketResponse create(TicketRequest request);

    TicketResponse findById(Long id);

    List<TicketResponse> findAll();

    TicketResponse update(Long id, TicketRequest request);
}
