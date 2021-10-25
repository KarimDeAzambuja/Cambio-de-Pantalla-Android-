package es.ejemplo.android;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Actividad4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Logging", "creando");
        setContentView(R.layout.activity_main3);

        Button button_Atras = findViewById(R.id.button_id);
        button_Atras.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(Actividad4.this, Actividad3.class );
                startActivity(intent);
            }
        });


        Button button_Delante = findViewById(R.id.button_id2);
        button_Delante.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(Actividad4.this, MainActivity.class );
                startActivity(intent);
            }
        });
    }

    /*public void onClick(View v){
        Intent intent = new Intent(this, Actividad4.class);
        startActivity(intent);
    }*/

}