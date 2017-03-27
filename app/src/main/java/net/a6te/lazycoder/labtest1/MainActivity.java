package net.a6te.lazycoder.labtest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText priceET;
    private EditText vatET;
    private EditText discountET;
    private Button calculatebtn;
    private TextView finalPriceTV;

    private Calculation calculation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        priceET = (EditText) findViewById(R.id.productPriceET);
        vatET = (EditText) findViewById(R.id.vatET);
        discountET = (EditText) findViewById(R.id.discountET);
        calculatebtn = (Button) findViewById(R.id.Calculatebtn);
        finalPriceTV = (TextView) findViewById(R.id.finalPriceTV);

        calculation = new Calculation();

    }

    public void calculate(View view) {
        try{
            double proPrice = Double.parseDouble(priceET.getText().toString());
            double vat = Double.parseDouble(vatET.getText().toString());
            double discount = Double.parseDouble(discountET.getText().toString());

            calculation.setPrice(proPrice);
            calculation.setVat(vat);
            calculation.setDiscount(discount);
            double final_price = ((proPrice*vat)/100)+proPrice-((((proPrice*vat)/100)+proPrice)*5)/100;
            finalPriceTV.setText(String.valueOf(final_price));

           // Toast.makeText(this, String.valueOf(final_price), Toast.LENGTH_SHORT).show();


        }catch (Exception e)
        {

        }
    }
}
