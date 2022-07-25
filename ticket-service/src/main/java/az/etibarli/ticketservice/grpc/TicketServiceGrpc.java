package az.etibarli.ticketservice.grpc;

import az.etibarli.ticketservice.dto.request.TicketRequest;
import az.etibarli.ticketservice.dto.response.TicketResponse;
import az.etibarli.ticketservice.service.businessService.ticketBusinessService.TicketBusinessService;
import com.example.models.*;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static az.etibarli.ticketservice.utils.TimeConverter.localDateTimeToLong;

@Service
@GrpcService
@RequiredArgsConstructor
public class TicketServiceGrpc extends TicketProtoServiceGrpc.TicketProtoServiceImplBase {

    private final TicketBusinessService ticketBusinessService;

    @Override
    public void createTicket(TicketCreateRequest request, StreamObserver<TicketProtoResponse> responseObserver) {
        TicketRequest ticketRequest = new TicketRequest();
        ticketRequest.setCode(request.getCode());
        ticketRequest.setStatus(request.getStatus());
        ticketRequest.setIssuerAgent(request.getIssuerAgent());

        TicketResponse response = ticketBusinessService.create(ticketRequest);

        TicketProtoResponse protoResponse = TicketProtoResponse.newBuilder()
                .setId(response.getId())
                .setCode(response.getCode())
                .setStatus(response.getStatus())
                .setIssuerAgent(response.getIssuerAgent())
                .setCreationTime(localDateTimeToLong(response.getCreationTime()))
                .build();

        responseObserver.onNext(protoResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void findById(TicketFindByIdRequest request, StreamObserver<TicketProtoResponse> responseObserver) {
        TicketResponse response = ticketBusinessService.findById(request.getId());

        TicketProtoResponse protoResponse = TicketProtoResponse.newBuilder()
                .setId(response.getId())
                .setCode(response.getCode())
                .setStatus(response.getStatus())
                .setIssuerAgent(response.getIssuerAgent())
                .setCreationTime(localDateTimeToLong(response.getCreationTime()))
                .build();

        responseObserver.onNext(protoResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void findAll(Empty request, StreamObserver<TicketResponses> responseObserver) {
        List<TicketResponse> responses = ticketBusinessService.findAll();
        List<TicketProtoResponse> collect = responses.stream().map(TicketServiceGrpc::foo).collect(Collectors.toList());
        TicketResponses result = TicketResponses.newBuilder()
                .addAllData(collect).build();
        responseObserver.onNext(result);
        responseObserver.onCompleted();
    }

    @Override
    public void update(TicketUpdateRequest request, StreamObserver<TicketProtoResponse> responseObserver) {
        TicketRequest ticketRequest = new TicketRequest();
        ticketRequest.setCode(request.getCode());
        ticketRequest.setStatus(request.getStatus());
        ticketRequest.setIssuerAgent(request.getIssuerAgent());

        TicketResponse response = ticketBusinessService.update(request.getId(), ticketRequest);
        System.out.println(response);
        TicketProtoResponse protoResponse = TicketProtoResponse.newBuilder()
                .setId(response.getId())
                .setCode(response.getCode())
                .setStatus(response.getStatus())
                .setIssuerAgent(response.getIssuerAgent())
                .setCreationTime(localDateTimeToLong(response.getCreationTime()))
                .build();

        responseObserver.onNext(protoResponse);
        responseObserver.onCompleted();
    }

    private static TicketProtoResponse foo(TicketResponse response) {
        return TicketProtoResponse.newBuilder()
                .setId(response.getId())
                .setCode(response.getCode())
                .setStatus(response.getStatus())
                .setIssuerAgent(response.getIssuerAgent())
                .setCreationTime(localDateTimeToLong(response.getCreationTime()))
                .build();
    }
}
