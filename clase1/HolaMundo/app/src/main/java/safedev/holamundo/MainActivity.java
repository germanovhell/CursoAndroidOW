package safedev.holamundo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText_nombre_usuario, edt_telefono_usuario;
    Button button_recoge_nombre, button_lanzar_evento, button_lanzar_activity;
    Button btn_llamar, btn_lanzar_activity_componentes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_nombre_usuario = (EditText)findViewById(R.id.editText);
        button_recoge_nombre = (Button)findViewById(R.id.button);
        button_lanzar_evento = (Button)findViewById(R.id.button2);
        button_lanzar_activity = (Button)findViewById(R.id.buttonLanzarActivity);
        btn_llamar = (Button)findViewById(R.id.buttonLlamarTelefono);
        edt_telefono_usuario = (EditText)findViewById(R.id.editTexttelefono);
        btn_lanzar_activity_componentes = (Button)findViewById(R.id.buttonLanzarChechBox);

        button_lanzar_evento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = editText_nombre_usuario.getText().toString();
                Toast.makeText(MainActivity.this, "Su nombre es = "+nombre, Toast.LENGTH_SHORT).show();
            }
        });

        button_lanzar_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_para_activity  = new Intent(MainActivity.this, SecondaryActivity.class);
                intent_para_activity.putExtra("nombre",editText_nombre_usuario.getText().toString());
                startActivity(intent_para_activity);
            }
        });

        btn_lanzar_activity_componentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_para_activity  = new Intent(MainActivity.this, ComponentesActivity.class);
                startActivity(intent_para_activity);
            }
        });

        btn_llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_para_activity  = new Intent(Intent.ACTION_DIAL);
                intent_para_activity.setData(Uri.parse("tel:"+edt_telefono_usuario.getText().toString()));
                startActivity(intent_para_activity);
            }
        });
    }

    public void obtenerNombre(View v){
        String nombre = editText_nombre_usuario.getText().toString();
        Toast.makeText(MainActivity.this, "Su nombre es = "+nombre, Toast.LENGTH_SHORT).show();
    }
}
