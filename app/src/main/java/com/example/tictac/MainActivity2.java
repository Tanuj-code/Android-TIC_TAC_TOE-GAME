package com.example.tictac;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    int t=1;
    String s="";
    int col=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);
    for(int i=2; i<=10; i++){

        int id=getResources().getIdentifier("textView"+i, "id", getPackageName());
        TextView txt= findViewById(id);
        txt.setBackgroundColor(Color.DKGRAY);
        txt.setTextColor(Color.rgb(255, 255, 255));
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt.getText().toString().equals("X") || txt.getText().toString().equals("O")){
                    return;
                }
                if(t==1){
                    txt.setText("X");
                    txt.setBackgroundColor(Color.BLACK);
                    t=0;
                    col++;
                }
                else{
                    txt.setText("O");
                    txt.setBackgroundColor(Color.rgb(255, 87, 34));
                    t=1;
                    col++;
                }

                check();
            }
        });
    }
    }
   public void check(){
        for(int i=2; i<=8; i+=3){
            int ct=0;
            String l="Q";
            for(int j=i+0; j<i+3; j++){
                int id=getResources().getIdentifier("textView"+j, "id", getPackageName());
                TextView txt= findViewById(id);
                if(l=="Q" && !s.equals(txt.getText().toString())){
                    ct++;
                    l=txt.getText().toString();
                    continue;
                }
                if(l.equals(txt.getText().toString()) && !s.equals(txt.getText().toString())){
                    ct++;
                }
            }
            if(ct==3){
                for(int j=i+0; j<i+3; j++) {
                    int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
                    TextView tx = findViewById(id);
                    tx.setBackgroundColor(Color.rgb(255, 255, 255));
                    tx.setTextColor(Color.BLACK);
                }
                finish();
            }

        }
       for(int i=2; i<=4; i++){
           int ct=0;
           String l="Q";
           for(int j=i+0; j<=i+6; j+=3){
               int id=getResources().getIdentifier("textView"+j, "id", getPackageName());
               TextView txt= findViewById(id);
               if(l=="Q" && !s.equals(txt.getText().toString())){
                   ct++;
                   l=txt.getText().toString();
                   continue;
               }
               if(l.equals(txt.getText().toString())  && !s.equals(txt.getText().toString())){
                   ct++;
               }
           }
           if(ct==3){
               for(int j=i+0; j<=i+6; j+=3) {
                   int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
                   TextView tx = findViewById(id);
                   tx.setBackgroundColor(Color.rgb(255, 255, 255));
                   tx.setTextColor(Color.BLACK);
               }
               finish();
           }
           ct=0;
       }
       int ct=0;
       String l="Q";
       for(int j=2; j<=10; j+=4){
           int id=getResources().getIdentifier("textView"+j, "id", getPackageName());
           TextView txt= findViewById(id);
           if(l=="Q" && !s.equals(txt.getText().toString())){
               ct++;
               l=txt.getText().toString();
               continue;
           }
           if(l.equals(txt.getText().toString())  && !s.equals(txt.getText().toString())){
               ct++;
           }
       }
       if(ct==3){
           for(int j=2; j<=10; j+=4) {
               int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
               TextView tx = findViewById(id);
               tx.setBackgroundColor(Color.rgb(255, 255, 255));
               tx.setTextColor(Color.BLACK);
           }
           finish();
       }
       ct=0;
       l="Q";
       for(int j=4; j<=8; j+=2){
           int id=getResources().getIdentifier("textView"+j, "id", getPackageName());
           TextView txt= findViewById(id);
           if(l=="Q" && !s.equals(txt.getText().toString())){
               ct++;
               l=txt.getText().toString();
               continue;
           }
           if(l.equals(txt.getText().toString())  && !s.equals(txt.getText().toString())){
               ct++;
           }
       }
       if(ct==3){
           for(int j=4; j<=8; j+=2) {
               int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
               TextView tx = findViewById(id);
               tx.setBackgroundColor(Color.rgb(255, 255, 255));
               tx.setTextColor(Color.BLACK);
           }
           finish();
       }
       if(col==9){
           finish();
       }
   }
}