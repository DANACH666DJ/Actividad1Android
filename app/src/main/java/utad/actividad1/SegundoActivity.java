package utad.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SegundoActivity extends AppCompatActivity {

    public Button btnPerfil;
    public Button btnAnterior;
    public Button btnSiguiente;
    public EditText Titulo;
    public EditText Texto;


    SegundoActivityController segundoActivityController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);



        btnPerfil=(Button)this.findViewById(R.id.btnPerfil);
        btnAnterior=(Button)this.findViewById(R.id.btnAnterior);
        btnSiguiente=(Button)this.findViewById(R.id.btnSiguiente);


        Titulo=(EditText)this.findViewById(R.id.editTextTitulo);
        Texto=(EditText)this.findViewById(R.id.editTextTexto);

        segundoActivityController=new SegundoActivityController(this);

        btnPerfil.setOnClickListener(segundoActivityController);
        btnAnterior.setOnClickListener(segundoActivityController);
        btnSiguiente.setOnClickListener(segundoActivityController);

        Titulo.setOnClickListener(segundoActivityController);
        Texto.setOnClickListener(segundoActivityController);






    }
}
