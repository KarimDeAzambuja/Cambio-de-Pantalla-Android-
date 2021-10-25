package es.ejemplo.android;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Actividad3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Logging", "creando");
        setContentView(R.layout.activity_main2);


        Button button_Atras = findViewById(R.id.button_id);
        button_Atras.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(Actividad3.this, Actividad2.class );
                startActivity(intent);
            }
        });


        Button button_Delante = findViewById(R.id.button_id3);
        button_Delante.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(Actividad3.this, Actividad4.class );
                startActivity(intent);
            }
        });
    }

    /*public void onClick(View v){
        Intent intent = new Intent(this, Actividad3.class);
        startActivity(intent);
    }*/

}