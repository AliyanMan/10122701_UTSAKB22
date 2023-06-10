package com.example.a10122701_myselfapps.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a10122701_myselfapps.Model.GalleryModel;
import com.example.a10122701_myselfapps.R;

import java.util.ArrayList;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.myviewholder> {

    ArrayList<GalleryModel> galleryModel;

    public GalleryAdapter(ArrayList<GalleryModel> galleryModel) {
        this.galleryModel = galleryModel;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_gallery, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.ivGallery.setImageResource(galleryModel.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return galleryModel.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView ivGallery;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            ivGallery = itemView.findViewById(R.id.iv_gallery);
        }
    }
}
