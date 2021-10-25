package es.ejemplo.android;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Logging", "creando");
        setContentView(R.layout.activity_actividad2);



        Button button_Atras = findViewById(R.id.button4);
        button_Atras.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(Actividad2.this, MainActivity.class );
                startActivity(intent);
            }
        });


        Button button_Delante = findViewById(R.id.button5);
        button_Delante.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(Actividad2.this, Actividad3.class );
                startActivity(intent);
            }
        });
    }

}