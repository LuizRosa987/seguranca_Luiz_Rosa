package application.model;
import jakarta.persistente.Entipy;
import jakarta.persistente.GenerationType;
import jakarta.persistente.Id;
import jakarta.persistente.Table;


@Entity
@Table(name="user")
public class User{
    @Id
    @GeneratedValue(strategy=GeneratedType.IDENTITY)
    private long id;
    private String username;
    private String password;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id=id;
    }
    public String getPassword(String password) {
        this.password=password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username=username;
    }
}
