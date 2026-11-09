package com.example.cameraapp.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cameraapp.R;
import com.example.cameraapp.models.Product;

import java.util.ArrayList;


public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolderClass> {

    ArrayList<Product> arrayList;
    Activity activity;

    public ProductAdapter(ArrayList<Product> arrayList, Activity activity) {
        this.arrayList = arrayList;
        this.activity=activity;
    }

    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new ViewHolderClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass holder, int position) {
        holder.tv_desc.setText(arrayList.get(position).getDescription());
        holder.tv_price.setText(arrayList.get(position).getPrice());
        holder.iv_product.setImageResource(arrayList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder {
        public ImageView iv_product, iv_cart;
        public TextView tv_desc, tv_price;

        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            iv_product = itemView.findViewById(R.id.iv_product);
            iv_cart = itemView.findViewById(R.id.iv_cart);
            tv_desc = itemView.findViewById(R.id.tv_desc);
            tv_price = itemView.findViewById(R.id.tv_price);
        }
    }
   
}