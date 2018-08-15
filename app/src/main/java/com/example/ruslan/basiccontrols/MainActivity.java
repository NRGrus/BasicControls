package com.example.ruslan.basiccontrols;

import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.button_layout);
    }

    public void sendMessage(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        EditText editText = (EditText) findViewById(R.id.editText);
        textView.setText("Welcome, " + editText.getText());
    }
//    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.activity_main);
//
//        EditText editText = (EditText) findViewById(R.id.editText);
//        editText.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                TextView textView = (TextView) findViewById(R.id.textView);
//                textView.setText(s);
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });

//        LinearLayout linearLayout = new LinearLayout(this);
//        TextView textView1 = new TextView(this);
//        // установка фонового цвета
//        textView1.setBackgroundColor(0xffe8eaf6);
//        // установка цвета текста
//        textView1.setTextColor(0xff5c6bc0);
//        // делаем все буквы заглавными
//        textView1.setAllCaps(true);
//        // устанавливаем вравнивание текста по центру
//        textView1.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
//        // устанавливаем текста
//        textView1.setText("Android Nougat 7");
//        // установка шрифта
//        textView1.setTypeface(Typeface.create("casual", Typeface.NORMAL));
//        // устанавливаем высоту текста
//        textView1.setTextSize(26);
//
//        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams
//                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        // установка внешних отступов
//        layoutParams.setMargins(20,20,20,20);
//        // устанавливаем размеры
//        textView1.setLayoutParams(layoutParams);
//        linearLayout.addView(textView1);
////        setContentView(linearLayout);
//
//        setContentView(R.layout.activity_main);
//    }
}
