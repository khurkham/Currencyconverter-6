package com.example.mlrit.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spn;
    String str;
    String[] names={"Dollar","Pound","Yen","Dinar","Kwanza","Peso"};
    EditText et1;
    Button b1;
    TextView tv1;
    Integer pos,c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn=(Spinner)findViewById(R.id.sp1);
        et1=(EditText)findViewById(R.id.et1);
        b1=(Button)findViewById(R.id.b1);
        tv1=(TextView)findViewById(R.id.tv);

        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,names);
        spn.setAdapter(aa);
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
                                          @Override
       public void onItemSelected(AdapterView<?> adapterview, View view, int i,long l) {
                                              pos=i;
                                          }

                                          @Override
          public void onNothingSelected(AdapterView<?> adapterView) {

                                          }

    });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View v) {
                String s1=et1.getText().toString();
                long val=Long.parseLong(s1);
                if(pos==0)
                {
                    val=val*64;
                    tv1.setText(""+val);
                }
                if(pos==1)
                {
                    val=val*84;
                    tv1.setText(""+val);
                }
                if(pos==2)
                {
                    val=val*57;
                    tv1.setText(""+val);
                }
                if(pos==3)
                {
                    val=val*173;
                    tv1.setText(""+val);
                }
                if(pos==4)
                {
                    val=val*3;
                    tv1.setText(""+val);
                }
                if(pos==5)
                {
                    val=val*4;
                    tv1.setText(""+val);
                }
            }
        });
    }
}
