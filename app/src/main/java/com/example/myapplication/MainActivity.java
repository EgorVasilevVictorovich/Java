package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float sh = 70;
    byte shs = 77;
    float p = 25;
    byte ps = 37;
    float dk = 53;
    byte dks = 44;
    float s = 19;
    byte ss = 0;
    float t = 41;
    byte ts = 32;
    float account = 312;


    private float calculation() {

        float count = (sh * (100 - shs) + p * (100 - ps)
                + dk * (100 - dks) + s * (100 - ss)
                + t * (100 - ts)) / 100;
        return count;
    }


    private boolean possibility() {
        if (calculation() <= account) {
            return true;
        } else {
            return false;
        }
    }


    private float balance() {
        if(possibility()) {
            return account - calculation();
        } else {
            return -1;
        }
    }


    private TextView possibilityOut;
    private TextView balanceOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        possibilityOut = findViewById(R.id.possibilityOut);
        balanceOut = findViewById(R.id.balanceOut);


        if (possibility()) {
            possibilityOut.setText("Имеется достаточно средств для покупки делового костюма");
            balanceOut.setText("Остаток от покупки " + balance() + " серебрянных монет");
        } else {
            possibilityOut.setText("Недостаточно средств для покупки делового костюма");
            balanceOut.setText(" - ");
        }
    }
}