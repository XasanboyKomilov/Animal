package com.example.animal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.animal.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private PubgMobile pubg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initClicks();
    }

    private void initClicks() {
        binding.btnFrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.pubgImg.setImageResource(R.drawable.frown);
                pubg = PubgMobile.FROWN;
            }
        });

        binding.btnWorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.pubgImg.setImageResource(R.drawable.worn);
                pubg = PubgMobile.WORN;
            }
        });

        binding.btnPoseidon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.pubgImg.setImageResource(R.drawable.poseidon);
                pubg = PubgMobile.POSEIDON;
            }
        });

        binding.btnIsFrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pubg == PubgMobile.FROWN) {
                    Toast.makeText(MainActivity.this, "Правильно!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не верно))", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.btnIsWorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pubg == PubgMobile.WORN) {
                    Toast.makeText(MainActivity.this, "Правильно!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не верно))", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.btnIsPoseidon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pubg == PubgMobile.POSEIDON) {
                    Toast.makeText(MainActivity.this, "Правильно!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не верно))", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.nextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String animalName;
                switch (pubg) {
                    case FROWN:
                        animalName = "Frown";
                        break;

                    case WORN:
                        animalName = "Worn";
                        break;

                    case POSEIDON:
                        animalName = "Poseidon";
                        break;

                    default:
                        animalName = "Неизвестно";
                        break;
                }

                intent.putExtra("key", animalName);
                startActivity(intent);

            }
        });
    }
}