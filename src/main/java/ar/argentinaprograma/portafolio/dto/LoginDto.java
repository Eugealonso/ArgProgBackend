package ar.argentinaprograma.portafolio.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LoginDto {

    @JsonProperty("mail")
    private String mail;

    @JsonProperty("pass")
    private String pass;
}
