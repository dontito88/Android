package com.softuni.justjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private String username;
    private boolean hasCreamTopping = false;
    private boolean hasExtraSugar = false;
    private int coffeCount = 0;

    @BindView(R.id.btn_order) Button btnOrder;
    @BindView(R.id.edt_username) EditText edtUsername;
    @BindView(R.id.chbx_cream) CheckBox chbxCream;
    @BindView(R.id.chbx_sugar) CheckBox chbxSugar;
    @BindView(R.id.txt_coffee_count) TextView txtCoffeeCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_less)
    public void otLessClicked() {
        this.coffeCount = Integer.parseInt(txtCoffeeCount.getText().toString());
        coffeCount--;
        txtCoffeeCount.setText(String.valueOf(coffeCount));
        if (coffeCount <= 0){
            Toast.makeText(MainActivity.this, "You should order at least 1 coffee!", Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick(R.id.btn_more)
    public void otMoreClicked() {
        this.coffeCount = Integer.parseInt(txtCoffeeCount.getText().toString());
        coffeCount++;
        txtCoffeeCount.setText(String.valueOf(coffeCount));
    }

    @OnClick(R.id.btn_order)
    public void onClickOrdered() {
        this.username = edtUsername.getText().toString();
        this.hasCreamTopping = chbxCream.isChecked();
        this.hasExtraSugar = chbxSugar.isChecked();
        this.coffeCount = Integer.parseInt(txtCoffeeCount.getText().toString());
        String orderText = "Hello from " + username + "\nplease get me " + coffeCount + " coffees.";
        if (hasCreamTopping) {
            orderText += " Also add cream.";
        }
        if (hasExtraSugar) {
            orderText += " Also add extra sugar.";
        }

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"service1@cefin.bg"});
        intent.putExtra(Intent.EXTRA_SUBJECT, orderText);
        startActivity(intent);
    }
}
