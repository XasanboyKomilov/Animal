package com.example.animal;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.animal.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getValue();
    }

    private void getValue() {
        String extraValue;
        Intent intent = getIntent();
        extraValue = intent.getStringExtra("key");
        binding.tvAnswer.setText(extraValue);
    }
}