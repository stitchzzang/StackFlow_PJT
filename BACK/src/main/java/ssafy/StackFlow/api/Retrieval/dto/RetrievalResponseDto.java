package ssafy.StackFlow.api.Retrieval.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RetrievalResponseDto {
    private String status;
    private Object data;
}
