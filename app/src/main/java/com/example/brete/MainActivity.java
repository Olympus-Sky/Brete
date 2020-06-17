package com.example.brete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnTombarJ, btnLevantarJ, btnPararJ;
    private SeekBar barVelocidadeJ;
    private TextView txtVelocidadeJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Widgets();
        Buttons();
        Velocity();
    }

    public void Widgets() {
        btnTombarJ = (Button)findViewById(R.id.btnTombar);
        btnLevantarJ = (Button)findViewById(R.id.btnLevantar);
        btnPararJ = (Button)findViewById(R.id.btnParar);

        barVelocidadeJ = (SeekBar)findViewById(R.id.barVelocidade);
        txtVelocidadeJ = (TextView)findViewById(R.id.txtVelocidade);
    }

    public void Buttons() {
        btnTombarJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
            }
        });

        btnLevantarJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
            }
        });

        btnPararJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void Velocity() {
        barVelocidadeJ.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtVelocidadeJ.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}