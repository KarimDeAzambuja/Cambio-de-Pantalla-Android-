package es.ejemplo.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Logging", "creando");
        setContentView(R.layout.activity_main);

        EditText url = findViewById(R.id.idName);

        Button button_id = findViewById(R.id.button_id);
        button_id.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v){
                String urlText = url.getText().toString();
                Uri uri = Uri.parse("https://" + urlText);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }

        });

        Button button_Atras = findViewById(R.id.button2);
        button_Atras.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Actividad4.class);
                startActivity(intent);
            }
        });


        Button button_Delante = findViewById(R.id.button3);
        button_Delante.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Actividad2.class);
                startActivity(intent);
            }
        });


    }




    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Logging", "Comenzando");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Logging", "resumen");


    }


    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Logging", "pausando");
        /*Intent intent = new Intent(this, Actividad2.class);
        startActivity(intent);*/
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Logging", "parado");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("Logging", "Se ha restaurado la operacion");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Logging", "Se ha destruido la operacion");
        Uri uriUrl = Uri.parse("https://www.stucom.com/es/mystucom/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(intent);

    }


}