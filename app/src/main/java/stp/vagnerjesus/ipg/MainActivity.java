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
        AlertDialog.Builder alertDialogBuilder =new AlertDialog.Builder(this);
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

    public void onclikEstg(View view) { //Botão "Estg"
        //Intent i = new Intent(this, EstgActivity.class);
        //startActivity(i);
        Toast toast = Toast.makeText(this, R.string.mensagemErroHTTP, Toast.LENGTH_LONG);
        toast.show();
    }

    public void onclikSigarra(View view) { //Botão "Sigarra"
        Intent i = new Intent(this, SigarraActivity.class);
        startActivity(i);
    }

    public void onclikMoodle(View view) { //Botão "Moodle"
        Intent i = new Intent(this, MoodleActivity.class);
        startActivity(i);
    }
}