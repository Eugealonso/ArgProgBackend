package ar.argentinaprograma.portafolio.controller;

import ar.argentinaprograma.portafolio.dto.HabilidadDto;
import ar.argentinaprograma.portafolio.service.IHabilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("habilidades")
public class HabilidadController {
    @Autowired
    private IHabilidadService habilidadService;

    @PostMapping(value = "/crear", consumes = "application/json", produces = "application/json")
    public HabilidadDto crearHabilidad(@RequestBody HabilidadDto habilidad){
        habilidad = habilidadService.crearHabilidad(habilidad);
        return habilidad;
    }

    @PostMapping(value = "/editar", consumes = "application/json", produces = "application/json")
    public HabilidadDto editarHabilidad(@RequestBody HabilidadDto habilidad){
        habilidad = habilidadService.editarHabilidad(habilidad);
        return habilidad;
    }

    @DeleteMapping(value = "/eliminar", consumes = "application/json")
    public void eliminarHabilidad(@RequestBody Long idHabilidad){
        habilidadService.eliminarHabilidad(idHabilidad);
    }

    @GetMapping(value = "/listar", produces = "application/json")
    public List<HabilidadDto> listarHabilidades(@RequestParam(name = "tipo") String tipo) {
        return habilidadService.listarHabilidades(tipo);
    }
}
