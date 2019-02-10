package marcosfernando.edu.mx.ipn.practicalogin;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class dos extends AppCompatActivity {

    private String pass, usu;
    private TextView usuario, msj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);
        
        obtenDatos();
        iniciaVariables();

        if(verifica()){
            this.usuario.setText("Bienvenido: " + usu);
            this.msj.setText("Inicio de sesion correcto!!");
            this.msj.setTextColor(Color.GREEN);
        }
        else{
            this.msj.setText("Usuario o contraseña incorrectos");
            this.msj.setTextColor(Color.RED);
        }


    }

    private void iniciaVariables() {
        this.usuario = (TextView) findViewById(R.id.txtUsu);
        this.msj = (TextView) findViewById(R.id.txtMsj);
    }

    private boolean verifica() {
         if(this.pass.equals("123")){
             if(this.usu.equals("abc")){
                return true;
             }
         }
        return false;
    }

    public void obtenDatos(){
        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        this.pass = recibe.getString("p");
        this.usu = recibe.getString("u");
    }
}
