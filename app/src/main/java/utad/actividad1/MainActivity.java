package utad.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button btnVolver;
    public Button btnEditar;
    public EditText nombre;
    public EditText email;
    public EditText tlf;
    public EditText direccion;

    public TextView campos;

    MainActivityController mainActivityController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityController=new MainActivityController(this);

        campos=(TextView) this.findViewById(R.id.textView10);

        btnVolver=(Button)this.findViewById(R.id.button);
        btnEditar=(Button)this.findViewById(R.id.button2);


        nombre=(EditText)this.findViewById(R.id.editText);
        email=(EditText)this.findViewById(R.id.editText2);
        tlf=(EditText)this.findViewById(R.id.editText3);
        direccion=(EditText)this.findViewById(R.id.editText4);



        nombre.setEnabled(false);
        email.setEnabled(false);
        tlf.setEnabled(false);
        direccion.setEnabled(false);





        campos.setOnClickListener(mainActivityController);

        nombre.setOnClickListener(mainActivityController);
        email.setOnClickListener(mainActivityController);
        tlf.setOnClickListener(mainActivityController);
        direccion.setOnClickListener(mainActivityController);
        btnVolver.setOnClickListener(mainActivityController);
        btnEditar.setOnClickListener(mainActivityController);




    }

}
