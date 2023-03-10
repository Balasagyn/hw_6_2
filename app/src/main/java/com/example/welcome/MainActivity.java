package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView enter_top_center = findViewById(R.id.toComeIn);
    TextView tv_enter_of_register_center = findViewById(R.id.instruction);
    EditText et_enter_email = findViewById(R.id.login);
    EditText et_enter_password_center = findViewById(R.id.password);
    Button enter_button = findViewById(R.id.main_btn);
    TextView forget_password_ = findViewById(R.id.lostPassword);
    TextView tv_click_hear_bottom = findViewById(R.id.clickHere);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.CUPCAKE) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        et_enter_email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (et_enter_email.getText().toString().equals("")) {
                    enter_button.setBackgroundColor(Color.GRAY);
                } else {
                    enter_button.setBackgroundColor(Color.YELLOW);
                }
            }
        });
        et_enter_password_center.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (et_enter_password_center.getText().toString().equals("")) {
                    enter_button.setBackgroundColor(Color.GRAY);
                } else {
                    enter_button.setBackgroundColor(Color.YELLOW);
                }
            }
        });
        enter_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_enter_email.getText().toString().equals("admin") && et_enter_password_center.getText().toString().equals("admin")) {
                    enter_top_center.setVisibility(View.GONE);
                    tv_enter_of_register_center.setVisibility(View.GONE);
                    et_enter_email.setVisibility(View.GONE);
                    et_enter_password_center.setVisibility(View.GONE);
                    enter_button.setVisibility(View.GONE);
                    forget_password_.setVisibility(View.GONE);
                    tv_click_hear_bottom.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "???? ?????????????? ????????????????????????????????????", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "???????????????????????? ?????????? ?? ????????????", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}