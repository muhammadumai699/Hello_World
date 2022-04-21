package com.example.readbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class BookNames extends AppCompatActivity implements View.OnClickListener {

    CardView book1, book2;
    PDFView pdfView;
    Intent intent1, intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_names);

        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }

        initView();
        book1.setOnClickListener(this);
        book2.setOnClickListener(this);
        }

    private void initView() {

        book1 = findViewById(R.id.book1);
        book2 = findViewById(R.id.book2);
        pdfView = findViewById(R.id.pdfViewer);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.book1:
                intent1 = new Intent(BookNames.this, Book.class);
                intent1.putExtra("name","1");
                startActivity(intent1);
                break;

            case R.id.book2:
                intent2 = new Intent(BookNames.this, Book.class);
                intent2.putExtra("name","2");
                startActivity(intent2);
                break;
                }
        }
    }
