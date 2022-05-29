package ar.argentinaprograma.portafolio.controller;

import ar.argentinaprograma.portafolio.dto.SeccionDto;
import ar.argentinaprograma.portafolio.service.ISeccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("seccion")
public class SeccionController {

    @Autowired
    private ISeccionService seccionService;

    @PostMapping(value = "crear", consumes = "application/json", produces = "application/json")
    public SeccionDto crearSeccion(@RequestBody SeccionDto seccion){
        seccion = seccionService.crearSeccion(seccion);
        return seccion;
    }

    @PostMapping(value = "editar", consumes = "application/json", produces = "application/json")
    public SeccionDto editarSeccion(@RequestBody SeccionDto seccion){
        seccion = seccionService.editarSeccion(seccion);
        return seccion;
    }

    @PostMapping(value = "eliminar", consumes = "application/json", produces = "application/json")
    public void eliminarSeccion(@RequestBody Long idSeccion){
        seccionService.eliminarSeccion(idSeccion);
    }

}
