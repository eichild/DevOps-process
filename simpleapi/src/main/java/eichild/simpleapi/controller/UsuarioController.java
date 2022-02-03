package eichild.simpleapi.controller;

import eichild.simpleapi.model.Usuario;
import eichild.simpleapi.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/")
    public List<Usuario> findAll(){
        var usuario = usuarioRepository.findAll();
        return usuario
                .stream()
                .map(Usuario::converter)
                .collect(Collectors.toList());
    }
}
