package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.btnimage);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu = new PopupMenu(MainActivity.this, imageView);
                popupMenu.getMenuInflater().inflate(R.menu.popupmenu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();
                        switch (id) {
                            case R.id.name:
                                Toast.makeText(MainActivity.this, "Book Name is TOTTOCHAN", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.price:
                                Toast.makeText(MainActivity.this, "For RS 300 ", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.Author:
                                Toast.makeText(MainActivity.this, "Dorothy Britton", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.offers:
                                Toast.makeText(MainActivity.this, "50% OFF", Toast.LENGTH_SHORT).show();
                                break;

                        }
                        return true;
                    }


                });

                popupMenu.show();
            }
        });
    }
}