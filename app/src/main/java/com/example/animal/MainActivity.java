package com.example.animal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.animal.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Animal animal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initClicks();
    }

    private void initClicks() {
        binding.btnCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.animalImg.setImageResource(R.drawable.cat);
                animal = Animal.CAT;
            }
        });

        binding.btnDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.animalImg.setImageResource(R.drawable.dog);
                animal = Animal.DOG;
            }
        });

        binding.btnHorse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.animalImg.setImageResource(R.drawable.horse);
                animal = Animal.HORSE;
            }
        });

        binding.btnIsCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (animal == Animal.CAT) {
                    Toast.makeText(MainActivity.this, "Правильно!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не верно))", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.btnIsDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (animal == Animal.DOG) {
                    Toast.makeText(MainActivity.this, "Правильно!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не верно))", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.btnIsHorse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (animal == Animal.HORSE) {
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
                switch (animal) {
                    case CAT:
                        animalName = "Кошка";
                        break;

                    case DOG:
                        animalName = "Собака";
                        break;

                    case HORSE:
                        animalName = "Лошадь";
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