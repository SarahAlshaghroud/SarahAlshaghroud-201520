package com.example.sarahalshaghroud_201520;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
int numberOfTickets;
double totalCost;
final double gold=200;
final double silver=100;
final double bronze=50;
String groupChoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText tickets=(EditText) findViewById(R.id.txtTickets);
        final Spinner group=(Spinner) findViewById(R.id.txtGroup);
         Button cost=(Button) findViewById(R.id.btnCost);
         cost.setOnClickListener(new View.OnClickListener() {
             final TextView result=((TextView) findViewById(R.id.txtResult));
             @Override
             public void onClick(View view) {
                 numberOfTickets=Integer.parseInt(tickets.getText().toString());

                 DecimalFormat currency=new DecimalFormat("$###,###.##");
                 groupChoice=group.getSelectedItem().toString();
                 if(groupChoice.equals("Gold")){
                     totalCost=gold*numberOfTickets;
                 }
                 else if(groupChoice.equals("Silver")){
                     totalCost=silver*numberOfTickets;
                 }
                 else if(groupChoice.equals("Bronze")){
                     totalCost=bronze*numberOfTickets;
                 }
                 result.setText("Cost for "+groupChoice+" is "+currency.format(totalCost));
             }
         });

    }

}