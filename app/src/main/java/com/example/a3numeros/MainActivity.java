package com.example.a3numeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtNumero1;
    private EditText txtNumero2;
    private EditText txtNumero3;
    private TextView lblDisplay1;
    private TextView lblDisplay2;
    private TextView lblDisplay3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNumero2);
        txtNumero3 = findViewById(R.id.txtNumero3);
        lblDisplay1 = findViewById(R.id.lblDisplay1);
        lblDisplay2 = findViewById(R.id.lblDisplay2);
        lblDisplay3 = findViewById(R.id.lblDisplay3);

        lblDisplay1.setText("");
        lblDisplay2.setText("");
        lblDisplay3.setText("");
    }

    public void mayor(View v) {
        try {
            long n1 = Long.parseLong(txtNumero1.getText().toString());
            long n2 = Long.parseLong(txtNumero2.getText().toString());
            long n3 = Long.parseLong(txtNumero3.getText().toString());

            lblDisplay1.setText("");
            lblDisplay2.setText("" + (Math.max(Math.max(n1, n2), n3)));
            lblDisplay3.setText("");
        } catch (Exception e) {
            Toast.makeText(this, "Datos incorrectos o vacíos.", Toast.LENGTH_SHORT).show();
        }
    }

    public void menor(View v) {
        try {
            long n1 = Long.parseLong(txtNumero1.getText().toString());
            long n2 = Long.parseLong(txtNumero2.getText().toString());
            long n3 = Long.parseLong(txtNumero3.getText().toString());

            lblDisplay1.setText("");
            lblDisplay2.setText("" + (Math.min(Math.min(n1, n2), n3)));
            lblDisplay3.setText("");
        } catch (Exception e) {
            Toast.makeText(this, "Datos incorrectos o vacíos.", Toast.LENGTH_SHORT).show();
        }
    }

    public void ordenarAscendente(View v) {
        try {
            long n1 = Long.parseLong(txtNumero1.getText().toString());
            long n2 = Long.parseLong(txtNumero2.getText().toString());
            long n3 = Long.parseLong(txtNumero3.getText().toString());

            if (n1 < n2 && n1 < n3) {
                lblDisplay1.setText("" + n1);
                if (n2 < n3) {
                    lblDisplay2.setText("" + n2);
                    lblDisplay3.setText("" + n3);
                } else {
                    lblDisplay2.setText("" + n3);
                    lblDisplay3.setText("" + n2);
                }
            } else if (n2 < n1 && n2 < n3) {
                lblDisplay1.setText("" + n2);
                if (n1 < n3) {
                    lblDisplay2.setText("" + n1);
                    lblDisplay3.setText("" + n3);
                } else {
                    lblDisplay2.setText("" + n3);
                    lblDisplay3.setText("" + n1);
                }
            } else {
                lblDisplay1.setText("" + n3);
                if (n1 < n2) {
                    lblDisplay2.setText("" + n1);
                    lblDisplay3.setText("" + n2);
                } else {
                    lblDisplay2.setText("" + n2);
                    lblDisplay3.setText("" + n1);
                }
            }
        } catch (Exception e) {
            Toast.makeText(this, "Datos incorrectos o vacíos.", Toast.LENGTH_SHORT).show();
        }
    }

    public void ordenarDescendente(View v) {
        try {
            long n1 = Long.parseLong(txtNumero1.getText().toString());
            long n2 = Long.parseLong(txtNumero2.getText().toString());
            long n3 = Long.parseLong(txtNumero3.getText().toString());

            if (n1 > n2 && n1 > n3) {
                lblDisplay1.setText("" + n1);
                if (n2 > n3) {
                    lblDisplay2.setText("" + n2);
                    lblDisplay3.setText("" + n3);
                } else {
                    lblDisplay2.setText("" + n3);
                    lblDisplay3.setText("" + n2);
                }
            } else if (n2 > n1 && n2 > n3) {
                lblDisplay1.setText("" + n2);
                if (n1 > n3) {
                    lblDisplay2.setText("" + n1);
                    lblDisplay3.setText("" + n3);
                } else {
                    lblDisplay2.setText("" + n3);
                    lblDisplay3.setText("" + n1);
                }
            } else {
                lblDisplay1.setText("" + n3);
                if (n1 > n2) {
                    lblDisplay2.setText("" + n1);
                    lblDisplay3.setText("" + n2);
                } else {
                    lblDisplay2.setText("" + n2);
                    lblDisplay3.setText("" + n1);
                }
            }
        } catch (Exception e) {
            Toast.makeText(this, "Datos incorrectos o vacíos.", Toast.LENGTH_SHORT).show();
        }
    }

    public void borrar(View v) {
        txtNumero1.setText("");
        txtNumero2.setText("");
        txtNumero3.setText("");
        lblDisplay1.setText("");
        lblDisplay2.setText("");
        lblDisplay3.setText("");

        Toast.makeText(this, "Datos borrados.", Toast.LENGTH_SHORT).show();
    }
}