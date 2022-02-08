package eichild.simpleapi.controller;

import eichild.simpleapi.model.Usuario;
import eichild.simpleapi.repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping(path = "/")
    public List<Usuario> findAll(){
        var usuario = usuarioRepository.findAll();
        return usuario
                .stream()
                .map(Usuario::converter)
                .collect(Collectors.toList());
    }

    @GetMapping(value= "/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Long codigo){
        return usuarioRepository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(value = "/salvar")
    public Usuario salvar(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
