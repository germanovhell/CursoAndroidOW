package safedev.a01_listview_simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    String[] personas;
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView)findViewById(R.id.listView);

        personas = new String[] {"Maria","Ana","Camila", "Juana", "Raquel", "Pau"};

        ArrayAdapter<String> adaptadorPersonas = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,personas);

        lista.setAdapter(adaptadorPersonas);

        lista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Se ha seleccionado el elemento : "+personas[position], Toast.LENGTH_SHORT).show();
    }
}
