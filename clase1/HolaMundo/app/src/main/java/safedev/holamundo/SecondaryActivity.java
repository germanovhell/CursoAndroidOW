package safedev.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {
    TextView nombre_a_mostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        nombre_a_mostrar = (TextView)findViewById(R.id.textViewNombreRecibido);

        Bundle datos_main_activity = getIntent().getExtras();
        String nombre_usuario = datos_main_activity.getString("nombre");
        nombre_a_mostrar.setText("Nombre recibido = "+nombre_usuario);

    }
}
