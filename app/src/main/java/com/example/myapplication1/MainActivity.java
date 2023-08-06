package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tv_pass;
    Switch special_symbol,numbers,small_letter,
    capital_letter;

    SeekBar seek_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Random random =new Random();
        //int rno = random.nextInt(9);
        findviewbyids();

        //String str =getRandomString(seek_bar.getProgress(),capital_letter.isChecked(),capital_letter.isChecked(),capital_letter.isChecked(),capital_letter.isChecked());
        String str =getRandomString(20,true,true,true,true);

        tv_pass.setText("Random String is"+ str);

    }
    public String getRandomString(int length,boolean hasUpperAlphas, boolean hasLowerAlphas, boolean hasNumbers,
                                  boolean hasSpecialCharacters)
    {
        String randomString ="";
        String upperAlphas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphas = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "@#$%^&*";
        if (length < 4) {
            //throw RuntimeException("Length < 4")
            //randomString = "";
            //Toast.makeText(this, "Please provide length greater then 4", Toast.LENGTH_SHORT).show();
        }else {
            StringBuilder stringBuilder  = new StringBuilder();
            //val stringBuilder = StringBuilder()
            if (hasUpperAlphas) {
                stringBuilder.append(upperAlphas);
            }
            if (hasLowerAlphas) {
                stringBuilder.append(lowerAlphas);
            }
            if (hasNumbers) {
                stringBuilder.append(numbers);
            }
            if (hasSpecialCharacters) {
                stringBuilder.append(specialChars);
            }

            randomString = String.valueOf(stringBuilder);

        }

    return randomString;

    }

    private void findviewbyids() {
        tv_pass=findViewById(R.id.tv_pass);
                special_symbol=findViewById(R.id.special_symbol);
        numbers=findViewById(R.id.numbers);
                small_letter=findViewById(R.id.small_letter);
        capital_letter=findViewById(R.id.capital_letter);
                seek_bar=findViewById(R.id.seek_bar);
    }

    /**
     * Generate Random String
     * returns String of specified length
     */
   /* fun getRandomString(
            length: Int,
            hasUpperAlphas: Boolean = true,
            hasLowerAlphas: Boolean = true,
            hasNumbers: Boolean = true,
            hasSpecialCharacters: Boolean = true
    ): String {

    }*/










}