package mx.edu.tesoem.p47s212022dse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class restaActivity2 extends AppCompatActivity {

    EditText txtnum1, txtnum2;
    Button btnsregresa, btncalcula;
    TextView lblresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta2);

        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);

        lblresult = findViewById(R.id.lblresult);

        btncalcula = findViewById(R.id.btncalcula);
        btnsregresa = findViewById(R.id.btnsregresa);

        btncalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 =Integer.parseInt(txtnum1.getText().toString());
                int num2 =Integer.parseInt(txtnum2.getText().toString());

                lblresult.setText("Resultado Resta: "+String.valueOf(num1-num2));
            }
        });

        btnsregresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();

            }
        });

    }
}