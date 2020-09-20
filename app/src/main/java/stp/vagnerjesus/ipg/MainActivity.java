package stp.vagnerjesus.ipg;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Caixa de dialogo para sair
    public void onBackPressed(){
        /*AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Light_Dialog_Alert);
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
        alertDialog.show();*/
        showSuccessDialog();
    }
    private void showSuccessDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, R.style.AlertDialogTheme);
        View view = LayoutInflater.from(MainActivity.this).inflate(
                R.layout.layout_dialog,
                (ConstraintLayout) findViewById(R.id.layoutDialog_Constraint)
        );
        builder.setView(view);
        ((TextView) view.findViewById(R.id.textTitulo)).setText(getResources().getString(R.string.Comfirme));
        ((TextView) view.findViewById(R.id.dialgoDescrica)).setText(getResources().getString(R.string.realmenteSair));

        ((Button) view.findViewById(R.id.buttonNo)).setText(getResources().getString(R.string.Nao));
        ((Button) view.findViewById(R.id.buttonSi)).setText(getResources().getString(R.string.sim));

        ((ImageView) view.findViewById(R.id.imagemAlerta)).setImageResource(R.drawable.iconipg);

        final AlertDialog alertDialog = builder.create();

        view.findViewById(R.id.buttonSi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
                //Toast.makeText(MainActivity.this,"Sim", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        view.findViewById(R.id.buttonNo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
                //Toast.makeText(MainActivity.this,"Não", Toast.LENGTH_LONG).show();
            }
        });

        if(alertDialog.getWindow() !=null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));

        }
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