package raul.serrano.ejercicio02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import raul.serrano.ejercicio02.modelos.Usuario;

public class MainActivity extends AppCompatActivity {

    private EditText txtEmail;
    private EditText txtPassword;

    private Button btnRegistrar;

    ArrayList<Usuario> listaUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaUsuarios = new ArrayList<>();

        inicializarVista();

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = txtEmail.getText().toString();
                String password = txtPassword.getText().toString();

                if(email.isEmpty() && password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "FALTAN DATOS", Toast.LENGTH_SHORT).show();
                }else{
                    Usuario miusuario = new Usuario(email,password);

                    listaUsuarios.add(miusuario);

                    Toast.makeText(MainActivity.this, "GUARDADO: "+miusuario.toString(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
    }

    private void inicializarVista() {
        txtEmail = findViewById(R.id.txtEmailMain);
        txtPassword = findViewById(R.id.txtPasswordMain);
        btnRegistrar = findViewById(R.id.btnRegistrerMain);
    }
}