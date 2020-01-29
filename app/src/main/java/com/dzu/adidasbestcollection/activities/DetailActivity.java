package com.dzu.adidasbestcollection.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.dzu.adidasbestcollection.R;
import com.dzu.adidasbestcollection.models.Adidas;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_MOUNTAIN = "extra_mountain";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.img_detail);
        TextView name = findViewById(R.id.tv_name_detail);
        TextView description = findViewById(R.id.tv_desc_detail);
        TextView elevation = findViewById(R.id.tv_elevation_detail);
        TextView country = findViewById(R.id.tv_country_detail);
        TextView size = findViewById(R.id.tv_size);
        TextView spec = findViewById(R.id.tv_spec);
        Button buy = findViewById(R.id.buttonbuy);

        Adidas adidas = getIntent().getParcelableExtra(EXTRA_MOUNTAIN);

        Glide.with(this).load(adidas.getPhoto()).into(imageView);
        name.setText(adidas.getName());
        description.setText(adidas.getDescription());
        elevation.setText(adidas.getElevation());
        country.setText(adidas.getLocation());
        size.setText(adidas.getSize());
        spec.setText(adidas.getSpec());

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DetailActivity.this, "Saat ini fitur belum tersedia " ,Toast.LENGTH_LONG).show();
            }
        });

    }
}
