package com.bithyve.pdfcreate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bithyve.pdfcreate.PdfCreate;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PdfCreate pdfCreate = new PdfCreate();
        pdfCreate.creating();
        //pdfCreate.create();

    }
}
