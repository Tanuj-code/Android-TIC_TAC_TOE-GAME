package com.example.tictac;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    int ct = 0, emp=0;
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
        txt.setOnClickListener(view -> {
            if(txt.getText().toString().equals("X") || txt.getText().toString().equals("O")){
                return;
            }

                txt.setText("X");
                txt.setBackgroundColor(Color.BLACK);
                col++;
                if(!check()) {
                    if (!twoO() ) {

                        if (!twoX()) {

                            one();
                            boolean a = check();

                        } else {
                            boolean a = check();
                        }
                    }
                        else{
                            boolean a = check();
                        }
                    }
                else{
                    finish();
                }

        });
    }
    }
   public boolean check(){
        for(int i=2; i<=8; i+=3){
            int ct=0;
            String l="Q";
            for(int j=i; j<i+3; j++){
                int id=getResources().getIdentifier("textView"+j, "id", getPackageName());
                TextView txt= findViewById(id);
                if(l.equals("Q") && !s.equals(txt.getText().toString())){
                    ct++;
                    l=txt.getText().toString();
                    continue;
                }
                if(l.equals(txt.getText().toString()) && !s.equals(txt.getText().toString())){
                    ct++;
                }
            }
            if(ct==3){
                for(int j=i; j<i+3; j++) {
                    int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
                    TextView tx = findViewById(id);
                    tx.setBackgroundColor(Color.rgb(255, 255, 255));
                    tx.setTextColor(Color.BLACK);
                }
                finish();
                return true;
            }

        }
       for(int i=2; i<=4; i++){
           int ct=0;
           String l="Q";
           for(int j=i; j<=i+6; j+=3){
               int id=getResources().getIdentifier("textView"+j, "id", getPackageName());
               TextView txt= findViewById(id);
               if(l.equals("Q") && !s.equals(txt.getText().toString())){
                   ct++;
                   l=txt.getText().toString();
                   continue;
               }
               if(l.equals(txt.getText().toString())  && !s.equals(txt.getText().toString())){
                   ct++;
               }
           }
           if(ct==3){
               for(int j=i; j<=i+6; j+=3) {
                   int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
                   TextView tx = findViewById(id);
                   tx.setBackgroundColor(Color.rgb(255, 255, 255));
                   tx.setTextColor(Color.BLACK);
               }
               finish();
               return true;
           }

       }
       int ct=0;
       String l="Q";
       for(int j=2; j<=10; j+=4){
           int id=getResources().getIdentifier("textView"+j, "id", getPackageName());
           TextView txt= findViewById(id);
           if(l.equals("Q") && !s.equals(txt.getText().toString())){
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
           return true;
       }
       ct=0;
       l="Q";
       for(int j=4; j<=8; j+=2){
           int id=getResources().getIdentifier("textView"+j, "id", getPackageName());
           TextView txt= findViewById(id);
           if(l.equals("Q") && !s.equals(txt.getText().toString())){
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
           return true;
       }
       if(col>=9){
           finish();
           return true;
       }
       return false;
   }
   public boolean twoO() {

       for (int i = 2; i <= 8; i += 3) {
           ct=0;
           emp=0;
           for(int j=i; j<i+3; j++){
           int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
           TextView tx = findViewById(id);
           if (tx.getText().toString().equals("O")) {
               ct++;
           }
           else if(tx.getText().toString().equals("")){
               emp++;
           }
       }
           if(ct==2 && emp==1){
               for(int j=i; j<i+3; j++) {
                   int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
                   TextView tx = findViewById(id);
                   if(tx.getText().toString().equals("")){
                       tx.setText("O");
                       tx.setBackgroundColor(Color.rgb(255, 87, 34));
                       col++;
                       return true;
                   }
               }
           }
   }

       for(int i=2; i<=4; i++) {
           ct=0;
           emp=0;
           for (int j = i; j <= i + 6; j += 3) {
               int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
               TextView tx = findViewById(id);
               if (tx.getText().toString().equals("O")) {
                   ct++;
               }
               else if(tx.getText().toString().equals("")){
                   emp++;
               }
           }
           if(ct==2 && emp==1){
               for(int j=i; j<= i + 6; j+= 3) {
                   int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
                   TextView tx = findViewById(id);
                   if(tx.getText().toString().equals("")){
                       tx.setText("O");
                       tx.setBackgroundColor(Color.rgb(255, 87, 34));
                       col++;
                       return true;
                   }
               }
           }
       }
       ct=0;
       emp=0;
       for(int j=2; j<=10; j+=4) {
           int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
           TextView tx = findViewById(id);
           if (tx.getText().toString().equals("O")) {
               ct++;
           }
           else if(tx.getText().toString().equals("")){
               emp++;
           }
       }
       if(ct==2 && emp==1){
           for(int j=2; j<=10; j+=4) {
               int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
               TextView tx = findViewById(id);
               if(tx.getText().toString().equals("")){
                   tx.setText("O");
                   tx.setBackgroundColor(Color.rgb(255, 87, 34));
                   col++;
                   return true;
               }
           }
       }
       ct=0;
       emp=0;
       for(int j=4; j<=8; j+=2){
           int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
           TextView tx = findViewById(id);
           if (tx.getText().toString().equals("O")) {
               ct++;
           }
           if(tx.getText().toString().equals("")){
               emp++;
           }
       }
       if(ct==2 && emp==1){
           for(int j=2; j<=10; j+=4) {
               int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
               TextView tx = findViewById(id);
               if(tx.getText().toString().equals("")){
                   tx.setText("O");
                   tx.setBackgroundColor(Color.rgb(255, 87, 34));
                   col++;
                   return true;
               }
           }
       }
       return false;
   }

    public boolean twoX() {

        for (int i = 2; i <= 8; i += 3) {
            ct=0;
            emp=0;
            for(int j=i; j<i+3; j++){
                int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
                TextView tx = findViewById(id);
                if (tx.getText().toString().equals("X")) {
                    ct++;
                }
                else if(tx.getText().toString().equals("")){
                    emp++;
                }
            }
            if(ct==2 && emp==1){
                for(int j=i; j<i+3; j++) {
                    int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
                    TextView tx = findViewById(id);
                    if(tx.getText().toString().equals("")){
                        tx.setText("O");
                        tx.setBackgroundColor(Color.rgb(255, 87, 34));
                        col++;
                        return true;
                    }
                }
            }
        }

        for(int i=2; i<=4; i++) {
            ct=0;
            emp=0;
            for (int j = i; j <= i + 6; j += 3) {
                int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
                TextView tx = findViewById(id);
                if (tx.getText().toString().equals("X")) {
                    ct++;
                }
                else if(tx.getText().toString().equals("")){
                    emp++;
                }
            }
            if(ct==2 && emp==1){
                for(int j=i; j<= i + 6; j+= 3) {
                    int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
                    TextView tx = findViewById(id);
                    if(tx.getText().toString().equals("")){
                        tx.setText("O");
                        tx.setBackgroundColor(Color.rgb(255, 87, 34));
                        col++;
                        return true;
                    }
                }
            }
        }
        ct=0;
        emp=0;
        for(int j=2; j<=10; j+=4) {
            int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
            TextView tx = findViewById(id);
            if (tx.getText().toString().equals("X")) {
                ct++;
            }
            if(tx.getText().toString().equals("")){
                emp++;
            }
        }
        if(ct==2 && emp==1){
            for(int j=2; j<=10; j+=4) {
                int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
                TextView tx = findViewById(id);
                if(tx.getText().toString().equals("")){
                    tx.setText("O");
                    tx.setBackgroundColor(Color.rgb(255, 87, 34));
                    col++;
                    return true;
                }
            }
        }
        ct=0;
        emp=0;
        for(int j=4; j<=8; j+=2){
            int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
            TextView tx = findViewById(id);
            if (tx.getText().toString().equals("X")) {
                ct++;
            }
            else if(tx.getText().toString().equals("")){
                emp++;
            }
        }
        if(ct==2 && emp==1){
            for(int j=4; j<=8; j+=2) {
                int id = getResources().getIdentifier("textView" + j, "id", getPackageName());
                TextView tx = findViewById(id);
                if(tx.getText().toString().equals("")){
                    tx.setText("O");
                    tx.setBackgroundColor(Color.rgb(255, 87, 34));
                    col++;
                    return true;
                }
            }
        }
        return false;
    }
    public void one() {
        while (true) {
            int num = (int) Math.floor(Math.random() * 10);
            if (num >= 2 && num <= 10) {
                int id = getResources().getIdentifier("textView" + num, "id", getPackageName());
                TextView tx = findViewById(id);
                if (tx.getText().toString().equals("")) {
                    tx.setText("O");
                    tx.setBackgroundColor(Color.rgb(255, 87, 34));
                    col++;
                    break;
                }
            }

        }

    }
}