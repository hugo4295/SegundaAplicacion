package mx.edu.tesoem.hugo4295.itics.segundaaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button saludobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saludobtn = (Button) findViewById(R.id.btnsaludo);

        saludobtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Bienvenido a tu segundo programa", Toast.LENGTH_LONG).show();
        saludobtn.setEnabled(false);
    }

    public void saludos2(View v){
        Toast.makeText(this, "Tu segundo saludo...", Toast.LENGTH_LONG).show();
        saludobtn.setEnabled(true);
    }

    public void llamarbtn(View v){
        Intent cargar = new Intent(this, SegundaActivity.class);
        startActivity(cargar);
    }
}
