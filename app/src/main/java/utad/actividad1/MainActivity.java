package utad.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button btnHolaMundo;
    public TextView txtHolaMundo;
    public Button btnVolver;
    public Button btnEditar;
    MainActivityController mainActivityController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityController=new MainActivityController(this);


        btnVolver=(Button)this.findViewById(R.id.button);
        btnEditar=(Button)this.findViewById(R.id.button2);



        btnVolver.setOnClickListener(mainActivityController);
        btnEditar.setOnClickListener(mainActivityController);




    }

}
