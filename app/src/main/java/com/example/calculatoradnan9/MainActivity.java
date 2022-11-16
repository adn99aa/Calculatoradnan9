package com.example.calculatoradnan9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText editText1;
private EditText editText2;
private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText) findViewById(R.id.editText1);
        editText2=(EditText) findViewById(R.id.editText2);
        textView1=(TextView) findViewById(R.id.textView1);

    }

    public void btnsum(View view) {
        int n1=Integer.parseInt(editText1.getText().toString());
        int n2=Integer.parseInt(editText2.getText().toString());
        int sum=n1+n2;
        textView1.setText(String.valueOf(sum));
    }

    public void btnsub(View view) {
        int n1=Integer.parseInt(editText1.getText().toString());
        int n2=Integer.parseInt(editText2.getText().toString());
        int sub=n1-n2;
        textView1.setText(String.valueOf(sub));
    }

    public void btnmulti(View view) {
        int n1=Integer.parseInt(editText1.getText().toString());
        int n2=Integer.parseInt(editText2.getText().toString());
        int multi=n1*n2;
        textView1.setText(String.valueOf(multi));
    }

    public void btndiv(View view) {
        int n1=Integer.parseInt(editText1.getText().toString());
        int n2=Integer.parseInt(editText2.getText().toString());
        int div=n1/n2;
        textView1.setText(String.valueOf(div));
    }
}