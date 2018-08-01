package com.mohan.recyclerviewtest;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ImageActivity extends AppCompatActivity{
    private static final String TAG = "ImageActivity";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_activity);
        Log.d(TAG, "onCreate: started");

        getIncomingIntent();

    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for Incoming Intenets.");
        if (getIntent().hasExtra("image_url")&& getIntent().hasExtra("image_name")){
            Log.d(TAG, "getIncomingIntent: found intent extras");

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");

            setImage(imageUrl, imageName);
        }
        
    }
    
    private void setImage(String imageUrl, String imageName){
        Log.d(TAG, "setImage: Setting the Image and name to widgets.");

        TextView name = findViewById(R.id.image_description);
        name.setText(imageName);

        ImageView image = findViewById(R.id.image_view);

        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }
}
