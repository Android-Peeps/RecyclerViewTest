package com.mohan.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitMaps();
    }

    private void initImageBitMaps(){
        Log.d(TAG, "initImageBitMaps: preparing Bitmaps");

        // image taken from unsplash
        mImageUrls.add("https://images.unsplash.com/photo-1533072167040-48bc3b8cc060?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=3175ded4935acbce540160fe13669955&auto=format&fit=crop&w=1050&q=80");
        mNames.add("Iceberg Lake,United States");

        mImageUrls.add("https://images.unsplash.com/photo-1521806794-7c41fbe90f9d?ixlib=rb-0.3.5&s=7bc0c42301cae8acd3e6b37373b5ec75&auto=format&fit=crop&w=913&q=80");
        mNames.add("Mother Earth");

        mImageUrls.add("https://images.unsplash.com/photo-1533047197222-2e920d139da5?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=18d670fe665669c71f872be5e43b4638&auto=format&fit=crop&w=634&q=80");
        mNames.add("Grândola, Portugal");

        mImageUrls.add("https://images.unsplash.com/photo-1533090161767-e6ffed986c88?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=3193eda6b917a9aef21c5938fafd7aec&auto=format&fit=crop&w=1050&q=80");
        mNames.add("Apple Valley, United States");

        mImageUrls.add("https://images.unsplash.com/photo-1533071581733-1a1600ec8ac6?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=4a59d7ee412d9efb4818bb4a9ddd55c9&auto=format&fit=crop&w=634&q=80");
        mNames.add("Circus Building, København, Denmark");

        mImageUrls.add("https://images.unsplash.com/photo-1533045900480-0596137118f5?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=70795a48a9873b13740ba4b91d474352&auto=format&fit=crop&w=1050&q=80");
        mNames.add("Roys Peak, New Zealand");

        mImageUrls.add("https://images.unsplash.com/photo-1533052013618-8d93ef0d7523?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=daa899467af5e070ff8aa393b9e31e78&auto=format&fit=crop&w=634&q=80");
        mNames.add("Lola, Oia, Greece");

        mImageUrls.add("https://images.unsplash.com/photo-1533056901636-53ee8f883bf7?ixlib=rb-0.3.5&s=d6c1d8b7215adfd89bb7dd34af88dcd5&auto=format&fit=crop&w=634&q=80");
        mNames.add("Toronto, Canada");

        mImageUrls.add("https://images.unsplash.com/photo-1533015235343-2aec29bcb285?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=69dafda3144fd9a88d0c73a24d280bbd&auto=format&fit=crop&w=1050&q=80");
        mNames.add("Mount Tamalpais, United States");

        initRecyclerView();

    }

    private  void  initRecyclerView(){
        Log.d(TAG, "initRecyclerView:  recyclerview started");
        RecyclerView recyclerView = findViewById(R.id.recyler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this ));
    }
}
