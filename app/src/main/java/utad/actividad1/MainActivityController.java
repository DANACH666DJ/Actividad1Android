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
        if(view.getId()== vista.btnVolver.getId()){

            String nombre = vista.nombre.getText().toString();
            String email = vista.email.getText().toString();
            String tlf= vista.tlf.getText().toString();
            String direccion=vista.direccion.getText().toString();
                /* El metodo getText() obtiene el dato escrito con el metodo toString()
                    se convierte a String para poder manipularlo como tal, por ultimo
                    se muestra en el textView con el metodo .setText()
                  */
            vista.campos.setText("Hola" +nombre + "con email : "
                    +email+" , telefono :" +tlf+ " y direccion : "+direccion);
        }


    }



    @Override
    public void onFocusChange(View view, boolean b) {


    }
}
