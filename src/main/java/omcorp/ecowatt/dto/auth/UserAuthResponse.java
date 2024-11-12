package omcorp.ecowatt.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAuthResponse {

    private UUID id;
    private String nome;
    private String email;
    private String token;
}
