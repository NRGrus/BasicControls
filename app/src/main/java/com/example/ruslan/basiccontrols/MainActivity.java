package com.example.ruslan.basiccontrols;

import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        TextView textView1 = new TextView(this);
        // установка фонового цвета
        textView1.setBackgroundColor(0xffe8eaf6);
        // установка цвета текста
        textView1.setTextColor(0xff5c6bc0);
        // делаем все буквы заглавными
        textView1.setAllCaps(true);
        // устанавливаем вравнивание текста по центру
        textView1.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        // устанавливаем текста
        textView1.setText("Android Nougat 7");
        // установка шрифта
        textView1.setTypeface(Typeface.create("casual", Typeface.NORMAL));
        // устанавливаем высоту текста
        textView1.setTextSize(26);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        // установка внешних отступов
        layoutParams.setMargins(20,20,20,20);
        // устанавливаем размеры
        textView1.setLayoutParams(layoutParams);
        linearLayout.addView(textView1);
//        setContentView(linearLayout);

        setContentView(R.layout.activity_main);
    }
}
