package com.example.cameraapp.activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cameraapp.R;
import com.example.cameraapp.adapters.ProductAdapter;
import com.example.cameraapp.models.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<Product> productArrayList;
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rv);
        productArrayList = new ArrayList<>();
        productArrayList.add(new Product(1,"Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$48.89", R.drawable.img_cam1));
        productArrayList.add(new Product(2,"Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$55.89", R.drawable.img_cam2));
        productArrayList.add(new Product(3,"Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$78.89", R.drawable.img_cam3));
        productArrayList.add(new Product(4,"Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$88.55", R.drawable.img_cam4));
        productArrayList.add(new Product(5,"Bitzwolf B-CC1 Camera 1080P Hd Webcame", "US$44.89", R.drawable.img_cam5));

        productAdapter = new ProductAdapter(productArrayList,MainActivity.this);
        rv.setLayoutManager(new GridLayoutManager(MainActivity.this,2));
        rv.setAdapter(productAdapter);
    }
}