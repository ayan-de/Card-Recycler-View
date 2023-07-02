package com.example.cardviewandrecyclerview.demoTwo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardviewandrecyclerview.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    int[] arr_images;
    String[] arr_names;

    public MyAdapter(int[] images, String[] names) {
        this.arr_images = images;
        this.arr_names = names;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.single_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.image.setImageResource(arr_images[position]);
        holder.names.setText(arr_names[position]);
    }

    @Override
    public int getItemCount() {
        return arr_names.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView names;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.person_image);
            names = (TextView) itemView.findViewById(R.id.person_name);
        }
    }
}
