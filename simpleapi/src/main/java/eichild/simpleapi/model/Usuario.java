package eichild.simpleapi.model;
import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codUsuario")
    private Long codUsuario;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    public static Usuario converter(Usuario u){
        var usuario = new Usuario();
        usuario.setCodUsuario(u.getCodUsuario());
        usuario.setNome(u.getNome());
        usuario.setEmail(u.getEmail());
        return usuario;
    }

    public Long getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Long codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
