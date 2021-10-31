package com.splhead.jardatocentimeter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.splhead.jardatocentimeter.databinding.ActivityMainBinding;
import com.splhead.jardatocentimeter.utils.Utils;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.bConverter.setOnClickListener(v -> {
            double yards = Double.parseDouble(binding.eTNDJardas.getText().toString());
            double centimeters = Utils.convertJardasToCentimeters(yards);

            String out = Utils.out(yards, centimeters);

            binding.tvResultInCentimeters.setText(out);
            binding.eTNDJardas.setText("");
        });
    }
}