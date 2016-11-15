package utad.actividad1;

import android.content.Intent;
import android.view.View;

/**
 * Created by Daniel on 14/11/2016.
 */

public class SegundoActivityController implements View.OnClickListener,View.OnFocusChangeListener{

    SegundoActivity vistaSeg;

    String titulos[];
    String textos[];

    public SegundoActivityController (SegundoActivity vistaSeg) {
        this.vistaSeg = vistaSeg;
        titulos=new String[]{
                vistaSeg.getResources().getString(R.string.titulo1),
                vistaSeg.getResources().getString(R.string.titulo2),
                vistaSeg.getResources().getString(R.string.titulo3)
        };

        textos=new String[]{
                vistaSeg.getResources().getString(R.string.texto1),
                vistaSeg.getResources().getString(R.string.texto2),
                vistaSeg.getResources().getString(R.string.texto3)
        };
    }



    public void onClick(View view) {
        if (view.getId() == vistaSeg.btnPerfil.getId()) {
            Intent intent = new Intent(vistaSeg, MainActivity.class);
            vistaSeg.startActivity(intent);
            vistaSeg.finish();
        }else if(view.getId() == vistaSeg.btnSiguiente.getId()){


        }


    }





        @Override
    public void onFocusChange(View view, boolean b) {


    }







}
