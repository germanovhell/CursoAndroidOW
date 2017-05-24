package safedev.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class ComponentesActivity extends AppCompatActivity {
    CheckBox checkBox_condiciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_componentes);

        //checkBox_condiciones = (CheckBox)findViewById(R.id.checkBoxCondiciones);

    }

    public void clickCheckBox(View v){
        // Is the view now checked?
        boolean checked = ((CheckBox) v).isChecked();

        // Check which checkbox was clicked
        switch(v.getId()) {
            case R.id.checkBoxCondiciones:
                if (checked)
                    Toast.makeText(this, "Click en condiciones " +checked, Toast.LENGTH_SHORT).show();
            else
                    Toast.makeText(this, "Sacado el Click en condiciones " +checked, Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBoxSexo:
                if (checked)
                    Toast.makeText(this, "Click en sexo " +checked, Toast.LENGTH_SHORT).show();
            else
                    Toast.makeText(this, "Sacado el Click en sexo " +checked, Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
