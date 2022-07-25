package com.example.agentservice.grpc;

import com.example.agentservice.dto.response.TicketResponse;
import com.example.models.*;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AgentServiceGrpc {

    private TicketProtoServiceGrpc.TicketProtoServiceBlockingStub stub;

    @PostConstruct
    public void init() {
        ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 1991).usePlaintext().build();
        stub = TicketProtoServiceGrpc.newBlockingStub(channel);
        System.out.println(channel);
    }

    public TicketProtoResponse create(TicketCreateRequest request) {
        return stub.createTicket(request);
    }

    public TicketProtoResponse findByID(TicketFindByIdRequest request) {
        return stub.findById(request);
    }

    public TicketResponses findAll() {
        return stub.findAll(Empty.newBuilder().build());
    }

    public TicketProtoResponse update(TicketUpdateRequest request) {
        return stub.update(request);
    }
}
