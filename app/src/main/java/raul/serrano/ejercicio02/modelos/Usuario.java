package raul.serrano.ejercicio02.modelos;

public class Usuario {
    private String mail;
    private String password;

    public Usuario() {
    }

    public Usuario(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
