package ar.argentinaprograma.portafolio.controller;

import ar.argentinaprograma.portafolio.dto.HabilidadDto;
import ar.argentinaprograma.portafolio.service.IHabilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("habilidad")
public class HabilidadController {
    @Autowired
    private IHabilidadService habilidadService;

    @PostMapping(value = "crear", consumes = "application/json", produces = "application/json")
    public HabilidadDto crearHabilidad(@RequestBody HabilidadDto habilidad){
        habilidad = habilidadService.crearHabilidad(habilidad);
        return habilidad;
    }

    @PostMapping(value = "editar", consumes = "application/json", produces = "application/json")
    public HabilidadDto editarHabilidad(@RequestBody HabilidadDto habilidad){
        habilidad = habilidadService.editarHabilidad(habilidad);
        return habilidad;
    }

    @PostMapping(value = "eliminar", consumes = "application/json", produces = "application/json")
    public void eliminarHabilidad(@RequestBody Long idHabilidad){
        habilidadService.eliminarHabilidad(idHabilidad);
    }
}
