package com.example.alexanderschink.drumapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private SoundManager soundManager;
    public Button bass;
    public Button tom;
    public Button crash;
    public Button snare;
    public Button fart;

    private int bassSound;
    private int tomSound;
    private int crashSound;
    private int snareSound;
    private int fartSound;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundManager = new SoundManager(this);
        bass = (Button) findViewById(R.id.bass);
        tom = (Button) findViewById(R.id.tom);
        crash = (Button) findViewById(R.id.crash);
        snare = (Button) findViewById(R.id.snare);
        fart = (Button) findViewById(R.id.fart);

        bassSound = soundManager.addSound(R.raw.bass);
        tomSound = soundManager.addSound(R.raw.tom);
        crashSound = soundManager.addSound(R.raw.crash);
        snareSound = soundManager.addSound(R.raw.snare);
        fartSound = soundManager.addSound(R.raw.fart);

        bass.setSoundEffectsEnabled(false);
        tom.setSoundEffectsEnabled(false);
        snare.setSoundEffectsEnabled(false);
        crash.setSoundEffectsEnabled(false);
        fart.setSoundEffectsEnabled(false);




        bass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              soundManager.play(bassSound);
            }
        });

        snare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundManager.play(snareSound);
            }
        });

        crash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundManager.play(crashSound);
            }
        });

        tom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundManager.play(tomSound);
            }
        });

        fart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundManager.play(fartSound);
            }
        });

    }
}
