package com.example.uts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SiswaActivity extends AppCompatActivity {

    private Button btnOk;
    private EditText editTxtNIS;
    private EditText editTxtNama;
    private EditText editTxtAlamat;
    private EditText editTxtHandphone;
    private EditText editTxtKeterangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa);
        btnOk = (Button) findViewById(R.id.btn_ok_siswa);
        editTxtNIS = (EditText) findViewById(R.id.edtxt_NIS);
        editTxtNama = (EditText) findViewById(R.id.edtxt_Nama);
        editTxtAlamat = (EditText) findViewById(R.id.edtxt_Alamat);
        editTxtHandphone = (EditText) findViewById(R.id.edtxt_Handphone);
        editTxtKeterangan = (EditText) findViewById(R.id.edtxt_keterangan);

    }

    public void popUp(View view) {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);


        alertDialogBuilder.setTitle("Siswa");
        alertDialogBuilder.setMessage("NIS :" + this.editTxtNIS.getText().toString() + "\n"
                                    +"Nama :" + this.editTxtNama.getText().toString() + "\n"
                                    +"Alamat :" + this.editTxtAlamat.getText().toString() + "\n"
                                    +"Handphone :" + this.editTxtHandphone.getText().toString() + "\n"
                                    +"Keterangan :" + this.editTxtKeterangan.getText().toString())
                .setCancelable(false)
                .setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
