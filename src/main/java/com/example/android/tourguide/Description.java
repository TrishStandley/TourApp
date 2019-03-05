package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Description extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Intent intent = getIntent();
        int fragmentNumber = intent.getIntExtra("FragmentNumber", 0);
        int pos = intent.getIntExtra("Object", 0);
        ImageView detailedImage = (ImageView) findViewById(R.id.detailed_image);
        TextView description = (TextView) findViewById(R.id.detailed_description);

        if (fragmentNumber == 0) {
            if (pos == 0) {
                detailedImage.setImageResource(R.drawable.badshahi_mosque);
                description.setText(R.string.badshahi_mosque);
            } else if (pos == 1) {
                detailedImage.setImageResource(R.drawable.lahore_fort);
                description.setText(R.string.lahore_fort);
            } else if (pos == 2) {
                detailedImage.setImageResource(R.drawable.minar_pakistan);
                description.setText(R.string.minar_e_pakistan);
            } else if (pos == 3) {
                detailedImage.setImageResource(R.drawable.wazir_khan_mosque);
                description.setText(R.string.wazir_khan_mosque);
            }

        }
        if (fragmentNumber == 1) {
            if (pos == 0) {
                detailedImage.setImageResource(R.drawable.pc);
                description.setText(R.string.emporium_mall);
            } else if (pos == 1) {
                detailedImage.setImageResource(R.drawable.mall_of_lahore);
                description.setText(R.string.mall_of_lahore);
            } else if (pos == 2) {
                detailedImage.setImageResource(R.drawable.fortress_square);
                description.setText(R.string.fortress_square);
            } else if (pos == 3) {
                detailedImage.setImageResource(R.drawable.anarkali);
                description.setText(R.string.anarkali_bazar);
            }
        }
        if (fragmentNumber == 2) {
            if (pos == 0) {
                detailedImage.setImageResource(R.drawable.chicken_karahi);
                description.setText(R.string.karahi);
            }
            if (pos == 1) {
                detailedImage.setImageResource(R.drawable.seekh_kabab);
                description.setText(R.string.kabab);
            }
            if (pos == 2) {
                detailedImage.setImageResource(R.drawable.biryani);
                description.setText(R.string.biryani);
            }
            if (pos == 3) {
                detailedImage.setImageResource(R.drawable.lassi);
                description.setText(R.string.lassi);
            }
            if (pos == 4) {
                detailedImage.setImageResource(R.drawable.poori);
                description.setText(R.string.poori);
            }
            if (pos == 5) {
                detailedImage.setImageResource(R.drawable.rice_kheer);
                description.setText(R.string.kheer);
            }
        }
        if (fragmentNumber == 3) {
            if (pos == 0) {
                detailedImage.setImageResource(R.drawable.pc);
                description.setText(R.string.pc);
            }
            if (pos == 1) {
                detailedImage.setImageResource(R.drawable.avari);
                description.setText(R.string.avari);
            }

            if (pos == 2) {
                detailedImage.setImageResource(R.drawable.hos);
                description.setText(R.string.hos);
            }

            if (pos == 3) {
                detailedImage.setImageResource(R.drawable.flattei);
                description.setText(R.string.flattei);
            }
            if (pos == 4) {
                detailedImage.setImageResource(R.drawable.nishat);
                description.setText(R.string.nishat);
            }


        }

    }

}

