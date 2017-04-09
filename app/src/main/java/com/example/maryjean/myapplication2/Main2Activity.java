package com.example.maryjean.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import static com.example.maryjean.myapplication2.R.id.FacultyBar;
import static com.example.maryjean.myapplication2.R.id.StudentBar;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SeekBar seekBar = (SeekBar)findViewById(StudentBar);
        int value = seekBar.getProgress();
        seekBar.setMax(100);
        final TextView seekBarValue = (TextView)findViewById(R.id.studentbardata);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue.setText(String.valueOf(progress));

                PrintWriter writer;
                try {
                    writer = new PrintWriter(new FileOutputStream("a.txt"));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    System.err.println("Error: couldn't find output file!!!");
                }
                writer.println(progress);
                writer.close();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        SeekBar seekBar2 = (SeekBar)findViewById(FacultyBar);
        int value2 = seekBar.getProgress();
        seekBar.setMax(100);
        final TextView seekBarValue2 = (TextView)findViewById(R.id.facultybardata);

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar2, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue2.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });
    }

}

