package com.example.agentservice.service.businessService.agentBusinessService;

import com.example.agentservice.dto.request.TicketRequest;
import com.example.agentservice.dto.response.TicketResponse;
import com.example.agentservice.grpc.AgentServiceGrpc;
import com.example.agentservice.mapper.businessMapper.TicketResponseMapper;
import com.example.agentservice.mapper.recordMapper.TicketProtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.agentservice.mapper.businessMapper.TicketResponseMapper.toResponse;
import static com.example.agentservice.mapper.businessMapper.TicketResponseMapper.toResponseList;

@Service
@RequiredArgsConstructor
public class AgentBusinessServiceImpl implements AgentBusinessService {

    private final TicketResponseMapper ticketResponseMapper;
    public final TicketProtoMapper ticketProtoMapper;
    private final AgentServiceGrpc agentServiceGrpc;

    @Override
    public TicketResponse create(TicketRequest request) {
        return toResponse(agentServiceGrpc.create(ticketProtoMapper.toTicketCreateRequest(request)));
    }

    @Override
    public TicketResponse findById(Long id) {
        return toResponse(agentServiceGrpc.findByID(ticketProtoMapper.toTicketFindByIdRequest(id)));
    }

    @Override
    public List<TicketResponse> findAll() {
        return toResponseList(agentServiceGrpc.findAll());
    }

    @Override
    public TicketResponse update(Long id, TicketRequest request) {
        return toResponse(agentServiceGrpc.update(ticketProtoMapper.toTicketUpdateRequest(id, request)));
    }
}
