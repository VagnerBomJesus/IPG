package stp.vagnerjesus.ipg;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Caixa de dialogo para sair
    public void onBackPressed(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Light_Dialog_Alert);
       // AlertDialog.Builder alerta = new AlertDialog.Builder(this,
                //android.R.style.Theme_Material_Light_Dialog_Alert);
        alertDialogBuilder.setTitle(getString(R.string.Comfirme));
        alertDialogBuilder.setIcon(R.drawable.ic_exit);
        alertDialogBuilder.setMessage(getString(R.string.realmenteSair));
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();

            }
        });
        alertDialogBuilder.setNegativeButton("NÃO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void onclikIpg(View view) {//botão "IPG"
        Intent i = new Intent(this, IpgActivity.class);
        startActivity(i);
    }
    public void onclikEstg(View view) { //Botão "Estg"
        Intent i = new Intent(this, EstgActivity.class);
        startActivity(i);
        //Toast toast = Toast.makeText(this, R.string.mensagemErroHTTP, Toast.LENGTH_LONG);
       // toast.show();
    }

    public void onclikSigarra(View view) { //Botão "Sigarra"
        Intent i = new Intent(this, SigarraActivity.class);
        startActivity(i);
    }

    public void onclikMoodle(View view) { //Botão "Moodle"
        Intent i = new Intent(this, MoodleActivity.class);
        startActivity(i);
    }

    public void onclikCantina(View view) { //Botão "Loupe"
        Intent i = new Intent(this, CantinaActivity.class);
        startActivity(i);
    }


    public void onclikEsecd(View view) {//Botão "Esecd"
        Intent i = new Intent(this, EsecdActivity.class);
        startActivity(i);
    }

    public void onclikEsth(View view) {
        Intent i = new Intent(this, EsthActivity.class);
        startActivity(i);
    }

    public void onclikEss(View view) {
        Intent i = new Intent(this, EssActivity.class);
        startActivity(i);
    }
}