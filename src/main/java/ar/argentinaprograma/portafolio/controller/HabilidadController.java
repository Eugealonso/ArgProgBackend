package ar.argentinaprograma.portafolio.controller;

import ar.argentinaprograma.portafolio.dto.HabilidadDto;
import ar.argentinaprograma.portafolio.service.IHabilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("habilidades")
public class HabilidadController {
    @Autowired
    private IHabilidadService habilidadService;

    @PostMapping(value = "/{idUsuario}/crear", consumes = "application/json", produces = "application/json")
    public HabilidadDto crearHabilidad(@PathVariable(value = "idUsuario") Long idUsuario, @RequestBody HabilidadDto habilidad){
        habilidad = habilidadService.crearHabilidad(idUsuario, habilidad);
        return habilidad;
    }

    @PostMapping(value = "/editar", consumes = "application/json", produces = "application/json")
    public HabilidadDto editarHabilidad(@RequestBody HabilidadDto habilidad){
        habilidad = habilidadService.editarHabilidad(habilidad);
        return habilidad;
    }

    @DeleteMapping(value = "/eliminar/{idHabilidad}")
    public void eliminarHabilidad(@PathVariable(value = "idHabilidad") Long idHabilidad){
        habilidadService.eliminarHabilidad(idHabilidad);
    }

    @GetMapping(value = "/listar", produces = "application/json")
    public List<HabilidadDto> listarHabilidades(@RequestParam(name = "tipo") String tipo) {
        return habilidadService.listarHabilidades(tipo);
    }
}
