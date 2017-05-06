package com.example.iossenac.gastos;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //CheckBox
        final CheckBox checkCelular = (CheckBox) findViewById(R.id.checkCelular);
        final CheckBox checkAgua = (CheckBox) findViewById(R.id.checkAgua);
        final CheckBox checkLuz = (CheckBox) findViewById(R.id.checkLuz);
        final CheckBox checkTelefone = (CheckBox) findViewById(R.id.checkTelefone);
        final TextView soma_check = (TextView)findViewById(R.id.soma_check);

        Button bt_check = (Button) findViewById(R.id.idButton);

        bt_check.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                int soma = 0;


                if (checkAgua.isChecked())
                    soma+= Integer.parseInt(checkAgua.getTag().toString());
                if (checkTelefone.isChecked())
                    soma+= Integer.parseInt(checkTelefone.getTag().toString());
                if (checkLuz.isChecked())
                    soma+= Integer.parseInt(checkLuz.getTag().toString());
                if (checkCelular.isChecked())
                    soma+= Integer.parseInt(checkCelular.getTag().toString());



            }
        });



        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
        dialogo.setTitle("Pagamento");
        dialogo.setMessage("Valor Total "+soma);
        dialogo.show();



    }

}