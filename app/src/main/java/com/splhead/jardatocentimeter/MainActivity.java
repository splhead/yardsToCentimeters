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

            String out = Utils.doubleToString(yards) +
                    " " +
                    Utils.unity(yards, "jarda") +
                    " é igual a " +
                    Utils.doubleToString(centimeters) +
                    " " +
                    Utils.unity(centimeters, "centímetro");

            binding.tvResultInCentimeters.setText(out);
            binding.eTNDJardas.setText("");
        });
    }
}