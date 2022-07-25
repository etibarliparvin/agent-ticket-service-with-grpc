package com.example.agentservice.mapper.recordMapper;

import com.example.agentservice.dto.request.TicketRequest;
import com.example.models.TicketCreateRequest;
import com.example.models.TicketFindByIdRequest;
import com.example.models.TicketUpdateRequest;
import org.springframework.stereotype.Component;

@Component
public class TicketProtoMapper {

    public TicketCreateRequest toTicketCreateRequest(TicketRequest request) {
        return TicketCreateRequest.newBuilder()
                .setCode(request.getCode())
                .setStatus(request.getStatus())
                .setIssuerAgent(request.getIssuerAgent())
                .build();
    }

    public TicketFindByIdRequest toTicketFindByIdRequest(Long id) {
        return TicketFindByIdRequest.newBuilder()
                .setId(id)
                .build();
    }

    public TicketUpdateRequest toTicketUpdateRequest(Long id, TicketRequest request) {
        return TicketUpdateRequest.newBuilder()
                .setId(id)
                .setCode(request.getCode())
                .setStatus(request.getStatus())
                .setIssuerAgent(request.getIssuerAgent())
                .build();
    }
}
