package eichild.simpleapi.model;
import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_pessoa")
    private Long cod_usuario;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    public static Usuario converter(Usuario u){
        var usuario = new Usuario();
        usuario.setCod_usuario(u.getCod_usuario());
        usuario.setNome(u.getNome());
        usuario.setEmail(u.getEmail());
        return usuario;
    }

    public Long getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(Long cod_usuario) {
        this.cod_usuario = cod_usuario;
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
