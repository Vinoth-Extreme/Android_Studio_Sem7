package com.example.ex01;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle abc) {
        super.onCreate(abc);
        setContentView(R.layout.activity_main);
        Toast.makeText(
                getApplicationContext(),
                "I am create method",
                Toast.LENGTH_SHORT
        ).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(
                getApplicationContext(),
                "I am start method",
                Toast.LENGTH_LONG
        ).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(
                getApplicationContext(),
                "I am resume method",
                Toast.LENGTH_LONG
        ).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(
                getApplicationContext(),
                "I am pause method",
                Toast.LENGTH_LONG
        ).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(
                getApplicationContext(),
                "I am stop method",
                Toast.LENGTH_LONG
        ).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(
                getApplicationContext(),
                "I am destroy method",
                Toast.LENGTH_LONG
        ).show();
    }

    public void onPress (View view) {
        EditText ip = findViewById(R.id.inp);
        TextView op = findViewById(R.id.op);
        op.setText(ip.getText().toString());
    }
}