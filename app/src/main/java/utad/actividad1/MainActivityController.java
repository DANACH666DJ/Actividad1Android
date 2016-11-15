package utad.actividad1;

import android.util.Log;
import android.view.View;
import android.content.Intent;
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


        //Cambiamos el nombre de los botones al pulsar en el boton editar y los activamos
        if(view.getId()== vista.btnEditar.getId() && vista.btnEditar.getText().toString().equals("Editar")){
            vista.btnEditar.setText("guardar");
            vista.btnVolver.setText("cancelar");
            vista.nombre.setEnabled(true);
            vista.email.setEnabled(true);
            vista.tlf.setEnabled(true);
            vista.direccion.setEnabled(true);




        } else if (view.getId() == vista.btnVolver.getId() && vista.btnVolver.getText().toString().equals("Volver") ) {
            Intent intent = new Intent(vista, SegundoActivity.class);
            vista.startActivity(intent);
            vista.finish();


        } else if( vista.btnEditar.getText().toString().equals("guardar") && view.getId()== vista.btnEditar.getId()){
            //String nombre = vista.nombre.getText().toString();
            //String email = vista.email.getText().toString();
            //int tlf= Integer.parseInt(vista.tlf.getText().toString());
            //String direccion=vista.direccion.getText().toString();

            DataHolder.sNombre=vista.nombre.getText().toString();
            DataHolder.sEmail=vista.email.getText().toString();
            DataHolder.sTlf=vista.tlf.getText().toString();
            DataHolder.sDireccion=vista.direccion.getText().toString();


            vista.nombre.setEnabled(false);
            vista.email.setEnabled(false);
            vista.tlf.setEnabled(false);
            vista.direccion.setEnabled(false);



                /* El metodo getText() obtiene el dato escrito con el metodo toString()
                    se convierte a String para poder manipularlo como tal, por ultimo
                    se muestra en el textView con el metodo .setText()
                  */



            Log.d("myTag", "Hola " +DataHolder.sNombre + "con email : "
                    +DataHolder.sEmail+" , telefono :" +DataHolder.sTlf
                    + " y direccion : "+DataHolder.sDireccion);



            cambiarBtnEditar();



        }else if (view.getId() == vista.btnVolver.getId() && vista.btnVolver.getText().toString().equals("cancelar") ) {
            vista.btnEditar.setText("Editar");
            vista.btnVolver.setText("Volver");
            vista.nombre.setEnabled(false);
            vista.email.setEnabled(false);
            vista.tlf.setEnabled(false);
            vista.direccion.setEnabled(false);


        }



    }




    public void cambiarBtnEditar(){
        vista.btnEditar.setText("Editar");
        vista.btnVolver.setText("Volver");
    }



    @Override
    public void onFocusChange(View view, boolean b) {


    }
}
