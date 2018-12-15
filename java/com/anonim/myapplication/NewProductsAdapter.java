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

import com.anonim.myapplication.Data.ProductsItem;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NewProductsAdapter extends RecyclerView.Adapter<NewProductsAdapter.ViewHolder> {
    List<ProductsItem> productsItems;
    CustomItemClickListener listener;


    public NewProductsAdapter(List<ProductsItem> productsItems, CustomItemClickListener listener) {
        this.productsItems= productsItems;
        this.listener=listener;
    }



    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textView2;
        public TextView  textView3;
        public TextView  textView4;
        public TextView  textView5;

        public ImageView imageView;
        public CardView card_view;


        public ViewHolder(View view) {
            super(view);

            card_view = view.findViewById(R.id.card_view);
            imageView = view.findViewById(R.id.imageView);
            textView2 = view.findViewById(R.id.textView2);
            textView3 = view.findViewById(R.id.textView3);
            textView4 = view.findViewById(R.id.textView4);
            textView5 = view.findViewById(R.id.textView5);

        }
    }


    @Override
    public NewProductsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout, parent, false);
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
      Picasso.get().load(productsItems.get(position).getImages().get(0).getThumbnail().getUrl()).into(holder.imageView);

        String title;
            if (productsItems.get(position).getTitle().length()>=16){
                title = productsItems.get(position).getTitle().substring(0, 16)+ "...";
            }
            else {title = productsItems.get(position).getTitle();}

        holder.textView2.setText(title);

        String shopName;
        if (productsItems.get(position).getShop().getName().length()>=16){
            shopName = productsItems.get(position).getShop().getName().substring(0, 16)+ "...";
        }
        else {shopName = productsItems.get(position).getShop().getName();}

        holder.textView3.setText(shopName);

        String price;
        price=productsItems.get(position).getPrice()+" TL";
        holder.textView4.setText(price);

        String oldPrice;
        if (productsItems.get(position).getOldPrice()==0){
            oldPrice="";
        }
        else{
            oldPrice=""+productsItems.get(position).getOldPrice();
        }
        holder.textView5.setText(oldPrice);
        holder.textView5.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
    }

    @Override
    public int getItemCount() {
        return productsItems.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}
