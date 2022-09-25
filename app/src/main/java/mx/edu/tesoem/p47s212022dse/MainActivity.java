package mx.edu.tesoem.p47s212022dse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnmsuma,btnmresta, btnmulti,btndiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmsuma = findViewById(R.id.btnmsuma);
        btnmresta = findViewById(R.id.btnmresta);
        btnmulti = findViewById(R.id.btnmulti);
        btndiv = findViewById(R.id.btndiv);

        btnmsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent psuma = new Intent(MainActivity.this,sumaMainActivity2.class );
                startActivity(psuma);

            }
        });

        btnmresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent presta = new Intent(MainActivity.this,restaActivity2.class );
                startActivity(presta);

            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pmulti = new Intent(MainActivity.this,MultiplicarActivity.class );
                startActivity(pmulti);

            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pdiv = new Intent(MainActivity.this,dividirActivity.class );
                startActivity(pdiv);

            }
        });
    }
}