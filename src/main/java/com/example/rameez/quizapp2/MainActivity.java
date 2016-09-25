package com.example.rameez.quizapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increament(View view){
        TextView tv_counter = (TextView) findViewById(R.id.counter);
        tv_counter.setText("" + (++this.counter));
    }
    public void decreament(View view){
        TextView tv_counter = (TextView) findViewById(R.id.counter);
        if(this.counter > 0) {
            tv_counter.setText("" + (--this.counter));
        }
    }
    public void place_order(View vew){
        String order_type = "";
        String total_price = "";
        TextView tv1 = (TextView) findViewById(R.id.order_details1);
        if(this.counter!=0) {
            total_price = "" + this.counter * 45;
            String order_summary = "Name: Rameez Masood";
            order_summary += "\nQuantity: " + counter;
            order_summary = order_summary + "\nTotal: $" + total_price;
            order_summary = order_summary + "\nThank You! ";
            //Toast.makeText(this,order_summary,Toast.LENGTH_SHORT).show();
            tv1.setText(order_summary);
        }else {
            tv1.setText("");
            Toast.makeText(this,"You have not placed any order.",Toast.LENGTH_SHORT).show();
        }

    }
}
