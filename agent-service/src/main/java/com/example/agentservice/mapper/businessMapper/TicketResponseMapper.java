package com.example.agentservice.mapper.businessMapper;

import com.example.agentservice.dto.response.TicketResponse;
import com.example.models.TicketProtoResponse;
import com.example.models.TicketResponses;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.agentservice.utils.TimeConverter.longToLocalDateTime;

@Component
public class TicketResponseMapper {

    public static TicketResponse toResponse(TicketProtoResponse ticketProtoResponse) {
        TicketResponse response = new TicketResponse();
        response.setId(ticketProtoResponse.getId());
        response.setCode(ticketProtoResponse.getCode());
        response.setStatus(ticketProtoResponse.getStatus());
        response.setIssuerAgent(ticketProtoResponse.getIssuerAgent());
        response.setCreationTime(longToLocalDateTime(ticketProtoResponse.getCreationTime()));
        return response;
    }

    public static List<TicketResponse> toResponseList(TicketResponses ticketResponses) {
        List<TicketResponse> responses = new ArrayList<>();
        responses.addAll(ticketResponses
                        .getDataList()
                        .stream()
                        .map(TicketResponseMapper::toResponse)
                        .collect(Collectors.toList()));
        return responses;
    }
}
