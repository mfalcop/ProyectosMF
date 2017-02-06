package uninorte.proyectosmf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private EditText ed1;
    private EditText ed2;
    private EditText ed3;
    private Button b;
    private TextView tv;
    private int proyecto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ed1= (EditText)findViewById(R.id.EditText1);
        ed2= (EditText)findViewById(R.id.editText7);
        ed3= (EditText)findViewById(R.id.editText8);
        b = (Button)findViewById(R.id.button);
        tv = (TextView)findViewById(R.id.textView);
        Intent i = getIntent();
        proyecto = i.getIntExtra("Proyecto",0);
        tv.setText("Proyecto"+proyecto);





    }

    public void onclicbtn(View view) {

        Intent i2 = new Intent();
        double nota1 = Double.parseDouble(ed1.getText().toString());
        double nota2 = Double.parseDouble(ed2.getText().toString());
        double nota3= Double.parseDouble(ed3.getText().toString());
        double nota= nota1*0.5+nota2*0.25+nota3*0.25;
            Toast.makeText(this, "Debe digitar una nota", Toast.LENGTH_LONG).show();
            if (nota1 <= 5 && nota1 >= 0 && nota2 <= 5 && nota2 >= 0 && nota3 <= 5 && nota3 >= 0) {

                switch (proyecto) {
                    case 1:
                        i2.putExtra("nota1", nota);
                        break;
                    case 2:
                        i2.putExtra("nota2", nota);
                        break;
                    case 3:
                        i2.putExtra("nota3", nota);
                        break;
                    case 4:
                        i2.putExtra("nota4", nota);
                        break;
                }
                setResult(proyecto, i2);
                finish();

            } else {
                Toast.makeText(this, "La nota debe estar en un rango de 0 a 5", Toast.LENGTH_LONG).show();
            }

    }
}
