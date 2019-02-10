package marcosfernando.edu.mx.ipn.practicalogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {

    private EditText usu, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciaVariables();

    }

    private void iniciaVariables(){

        this.usu = (EditText) findViewById(R.id.txtUsu);
        this.pass = (EditText) findViewById(R.id.txtPass);

    }

    public void login(View v) {

        Intent envia = new Intent(this, dos.class);
        Bundle b = new Bundle();
        b.putString("u",this.usu.getText().toString());
        b.putString("p",this.pass.getText().toString());
        envia.putExtras(b);

        finish();
        startActivity(envia);

    }
}
