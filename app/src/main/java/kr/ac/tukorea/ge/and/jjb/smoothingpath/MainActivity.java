package kr.ac.tukorea.ge.and.jjb.smoothingpath;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import kr.ac.tukorea.ge.and.jjb.smoothingpath.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private @NonNull ActivityMainBinding ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());
    }
}