package utad.actividad1;

import android.view.View;

/**
 * Created by daniel.garcimartin on 08/11/2016.
 */
public class MainActivityController implements View.OnClickListener,View.OnFocusChangeListener{

    MainActivity vista;

    MainActivityController(MainActivity vista){
        this.vista=vista;
    }
    @Override
    public void onClick(View view) {
        vista.btnEditar.setText("cancelar");
        vista.btnVolver.setText("guardar");
        vista.txtHolaMundo.setText("HolaMundo");
        vista.btnHolaMundo.setBackgroundColor(1111);
    }

    @Override
    public void onFocusChange(View view, boolean b) {


    }
}
