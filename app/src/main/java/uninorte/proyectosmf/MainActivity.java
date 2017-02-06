package uninorte.proyectosmf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView t1;
    private TextView t2;
    private TextView t3;
    private TextView t4;
    private TextView t5;
    private TextView t6;
    private TextView t7;
    private TextView t8;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView) findViewById(R.id.tv1);
        t2 = (TextView) findViewById(R.id.tv2);
        t3 = (TextView) findViewById(R.id.tv3);
        t4 = (TextView) findViewById(R.id.tv4);
        t5 = (TextView) findViewById(R.id.tv5);
        t6 = (TextView) findViewById(R.id.tv6);
        t7 = (TextView) findViewById(R.id.tv7);
        t8 = (TextView) findViewById(R.id.tv8);


    }

    public void onclickP(View view) {
        Intent i = new Intent(this, Main2Activity.class);

        switch(view.getTag().toString()){
            case "p1":
                i.putExtra("Proyecto", 1);
                break;
            case "p2":
                i.putExtra("Proyecto", 2);
                break;
            case "p3":
                i.putExtra("Proyecto", 3);
                break;
            case "p4":
                i.putExtra("Proyecto", 4);
                break;

        }
        startActivityForResult(i,1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch(resultCode){
            case 1:
               double n1= data.getDoubleExtra("nota1", 0);
                t2.setText(n1+"");
                break;
            case 2:
                double n2= data.getDoubleExtra("nota2", 0);
                t4.setText(n2+"");
                break;
            case 3:
                double n3= data.getDoubleExtra("nota3", 0);
                t6.setText(n3+"");
                break;
            case 4:
                double n4= data.getDoubleExtra("nota4", 0);
                t8.setText(n4+"");
                break;

        }
    }
}
