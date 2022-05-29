package ar.argentinaprograma.portafolio.controller;

import ar.argentinaprograma.portafolio.dto.LoginDto;
import ar.argentinaprograma.portafolio.dto.UsuarioDto;
import ar.argentinaprograma.portafolio.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping(path = "/login", produces = "application/json", consumes = "application/json")
    public UsuarioDto login(@RequestBody LoginDto login){
        UsuarioDto usuario= usuarioService.login(login.getMail(), login.getPass());
        return usuario;
    }
}
