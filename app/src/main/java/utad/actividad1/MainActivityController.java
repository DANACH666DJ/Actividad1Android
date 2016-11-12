package utad.actividad1;

import android.view.View;

/**
 * Created by daniel.garcimartin on 08/11/2016.
 */
public class MainActivityController implements View.OnClickListener,View.OnFocusChangeListener{

    MainActivity vista;
    boolean blEditable=false;



    MainActivityController(MainActivity vista){
        this.vista=vista;
    }
    @Override



    public void onClick(View view) {

        if(view.getId()== vista.btnEditar.getId()){
            vista.btnEditar.setText("cancelar");
            vista.btnVolver.setText("guardar");
            vista.btnEditar.setTextColor( -65536);
            vista.nombre.setEnabled(true);
            vista.email.setEnabled(true);
            vista.tlf.setEnabled(true);
            vista.direccion.setEnabled(true);
        }
    }

    @Override
    public void onFocusChange(View view, boolean b) {
     

    }
}
