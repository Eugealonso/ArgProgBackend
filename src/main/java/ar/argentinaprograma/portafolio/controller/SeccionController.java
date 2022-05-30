package ar.argentinaprograma.portafolio.controller;

import ar.argentinaprograma.portafolio.dto.SeccionDto;
import ar.argentinaprograma.portafolio.service.ISeccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("secciones")
public class SeccionController {

    @Autowired
    private ISeccionService seccionService;

    @PostMapping(value = "/{idUsuario}/crear", consumes = "application/json", produces = "application/json")
    public SeccionDto crearSeccion(@PathVariable(value = "idUsuario") Long idUsuario, @RequestBody SeccionDto seccion){
        seccion = seccionService.crearSeccion(idUsuario, seccion);
        return seccion;
    }

    @PostMapping(value = "/editar", consumes = "application/json", produces = "application/json")
    public SeccionDto editarSeccion(@RequestBody SeccionDto seccion){
        seccion = seccionService.editarSeccion(seccion);
        return seccion;
    }

    @DeleteMapping(value = "/eliminar/{idSeccion}")
    public void eliminarSeccion(@PathVariable(value = "idSeccion") Long idSeccion){
        seccionService.eliminarSeccion(idSeccion);
    }

    @GetMapping(value = "/listar", produces = "application/json")
    public List<SeccionDto> listarSecciones() {
        return seccionService.listarSecciones();
    }
}
