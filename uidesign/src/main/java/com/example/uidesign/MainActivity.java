package com.example.uidesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOkay = (Button) findViewById(R.id.btnOkay);
        btnOkay.setOnClickListener(this::xyz);
    }
    /*private class Click implements View.OnClickListener{
        public void onClick(View v){
            doUpperCase();

        }

        private void doUpperCase() {
            EditText edtUserName = (EditText) findViewById(R.id.edtUserName);

                           String typedText = edtUserName.getText().toString();
                    edtUserName.setText(typedText.toUpperCase());
        }*/
        public void xyz(View vtx) {
                    doUpperCase();
               }

    private void doUpperCase() {
        EditText edtUserName = (EditText) findViewById(R.id.edtUserName);

        String typedText = edtUserName.getText().toString();
        edtUserName.setText(typedText.toUpperCase());
    }

}

