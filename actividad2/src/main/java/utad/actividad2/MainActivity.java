package utad.actividad2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    long tiempo1;
    long tiempo2;
    long tiempoFinal;
    long tiempoDentro;
    long tiempoFuera;
    EditText tmpDentro;
    EditText tmpFuera;

    @Override
    //Cuando abres por primera vez
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tiempo1=System.currentTimeMillis();
        tmpDentro=(EditText) this.findViewById(R.id.editText);
        tmpFuera=(EditText) this.findViewById(R.id.editText2);

    }

    @Override
    //Cuando esta en segundo plano
    protected void onPause() {
        super.onPause();
        tiempo2=System.currentTimeMillis();
    }

    @Override
    //Cuando vuelves a entrar
    protected void onResume() {
        super.onResume();
        tiempoFinal=System.currentTimeMillis();
        tiempoDentro=tiempo2-tiempo1;
        tiempoFuera=tiempoFinal-tiempo2;


        tmpDentro.setText( tiempoDentro+"");
        tmpFuera.setText(tiempoFuera+"");

    }



}
