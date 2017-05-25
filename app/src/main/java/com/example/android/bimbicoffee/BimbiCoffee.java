package com.example.android.bimbicoffee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class BimbiCoffee extends AppCompatActivity {
    String toToast = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bimbi_coffee);
    }
    public void clickMe(View view){
        toToast += getString(R.string.empty) + getString(R.string.click_method);
        Toast.makeText(this, toToast, Toast.LENGTH_SHORT).show();
    }
}