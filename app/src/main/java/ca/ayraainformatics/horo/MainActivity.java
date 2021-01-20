package ca.ayraainformatics.horo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mesha(View view){
        Toast.makeText(getApplicationContext(), "Mesha", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Deatails.class);
        intent.putExtra("sign", "mesha".toString());
        startActivity(intent);
    }

    public void vrishabha(View view){
        Toast.makeText(getApplicationContext(), "Vrishabha", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Deatails.class);
        intent.putExtra("sign", "vrishabha".toString());
        startActivity(intent);
    }
    public void dhanu(View view){
        Toast.makeText(getApplicationContext(), "dhanu", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Deatails.class);
        intent.putExtra("sign", "dhanu_text".toString());
        startActivity(intent);
    }

}