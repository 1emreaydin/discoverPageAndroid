package com.anonim.myapplication;

import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.anonim.myapplication.Data.CategoriesItem;
import com.anonim.myapplication.Data.ProductsItem;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CategoriAdapter extends RecyclerView.Adapter<CategoriAdapter.ViewHolder> {
    List<CategoriesItem> categoriesItems;
    CustomItemClickListener listener;


    public CategoriAdapter(List<CategoriesItem> categoriesItems, CustomItemClickListener listener) {
        this.categoriesItems= categoriesItems;
        this.listener=listener;
    }



    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView categoriName;
        public ImageView imageView;
        public CardView card_view;


        public ViewHolder(View view) {
            super(view);

            card_view = view.findViewById(R.id.kategoriCardView);
            imageView = view.findViewById(R.id.categoriImageView);
            categoriName = view.findViewById(R.id.categoriName);

        }
    }


    @Override
    public CategoriAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_kategori, parent, false);
        final ViewHolder view_holder = new ViewHolder(v);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(v, view_holder.getPosition());
            }
        });

        return view_holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Picasso.get().load(categoriesItems.get(position).getCover().getThumbnail().getUrl()).into(holder.imageView);
        holder.categoriName.setText(""+categoriesItems.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return categoriesItems.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}
