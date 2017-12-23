package com.prathameshmore.weightonotherworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText weight;
    Button calculate;
    Button btnAbout;
    TextView mercuryTextView,vinusTextView,MoonTextView,MarsTextView,SaturnTextView,JupiterTextView,UranusTextView,NeptuneTextView,IOTextView,
            EuropaTextView,GanymedeTextView,CallistoTextView,SunTextView,PlutoTextView;

    double mercuryGravity = 0.38;
    double vinusGravity = 0.9;
    double marsGravity = 0.38;
    double jupiterGravity = 2.36;
    double saturnGravity = 1.08;
    double uranusGravity = 8;
    double neptuneGravity = 1.12;
    double moonGravity = 1.62;
    double ioGravity = 1.76;
    double europaGravity = 1.31;
    double ganymedeGravity = 1.42;
    double callistoGravity = 1.23;
    double sunGravity = 9.80;
   // double plutoGravity = 0.62;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = (EditText) findViewById(R.id.weightEdit);
        calculate = (Button) findViewById(R.id.btnCal);
        mercuryTextView = (TextView) findViewById(R.id.setMercuryText);
        vinusTextView = (TextView) findViewById(R.id.setVenusText);
        MoonTextView = (TextView) findViewById(R.id.setMoonText);
        MarsTextView = (TextView) findViewById(R.id.setMarsText);
        SaturnTextView = (TextView) findViewById(R.id.setSaturnText);
        JupiterTextView = (TextView) findViewById(R.id.setJupiterText);
        UranusTextView = (TextView) findViewById(R.id.setUranusText);
        NeptuneTextView = (TextView) findViewById(R.id.setNeptuneText);
        IOTextView = (TextView) findViewById(R.id.setIOText);
        EuropaTextView = (TextView) findViewById(R.id.setEuropaText);
        GanymedeTextView = (TextView) findViewById(R.id.setGanymedeText);
        SunTextView = (TextView) findViewById(R.id.setSunText);
        CallistoTextView = (TextView) findViewById(R.id.setCallistoText);
        btnAbout = (Button) findViewById(R.id.btnAbout);
       // PlutoTextView = (TextView) findViewById(R.id.setPlutoText);



        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,About.class));
                Toast.makeText(MainActivity.this, "Thank you for downloading", Toast.LENGTH_LONG).show();
            }
        });


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getWeight = weight.getText().toString();

                if (getWeight.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Your Weight in Kilo Gram's...", Toast.LENGTH_SHORT).show();
                } else {
                    double getWeightDouble = Double.parseDouble(getWeight);
                    String mercuryResult = String.valueOf(mercuryGravity * getWeightDouble);
                    mercuryTextView.setText(mercuryResult);

                    String venusResult = String.valueOf(vinusGravity * getWeightDouble);
                    vinusTextView.setText(venusResult);

                    String moonResult = String.valueOf(moonGravity * getWeightDouble);
                    MoonTextView.setText(moonResult);

                    String marsResult = String.valueOf(marsGravity * getWeightDouble);
                    MarsTextView.setText(marsResult);

                    String saturnResult = String.valueOf(saturnGravity * getWeightDouble);
                    SaturnTextView.setText(saturnResult);

                    String jupiterResult = String.valueOf(jupiterGravity * getWeightDouble);
                    JupiterTextView.setText(jupiterResult);

                    String uranusResult = String.valueOf(uranusGravity * getWeightDouble);
                    UranusTextView.setText(uranusResult);

                    String neptuneResult = String.valueOf(neptuneGravity * getWeightDouble);
                    NeptuneTextView.setText(neptuneResult);

                    String ioResult = String.valueOf(ioGravity * getWeightDouble);
                    IOTextView.setText(ioResult);

                    String europaResult = String.valueOf(europaGravity * getWeightDouble);
                    EuropaTextView.setText(europaResult);

                    String ganymedResult = String.valueOf(ganymedeGravity * getWeightDouble);
                    GanymedeTextView.setText(ganymedResult);

                    String callistoResult = String.valueOf(callistoGravity * getWeightDouble);
                    CallistoTextView.setText(callistoResult);

                    String sunResult = String.valueOf(sunGravity * getWeightDouble);
                    SunTextView.setText(sunResult);

                   // String plutoResult = String.valueOf(plutoGravity * getWeightDouble);
                   // PlutoTextView.setText(plutoResult);

                    Toast.makeText(MainActivity.this, "Weight is in Kilo Grams", Toast.LENGTH_LONG).show();

            }
        }

        });
}
}
