package com.anonim.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.anonim.myapplication.Data.FeaturedItem;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class ViewPagerAdapter  extends PagerAdapter{

    private Context mContext;
    private List<FeaturedItem> mResources;


    public ViewPagerAdapter(Context mContext, List<FeaturedItem> mResources) {
        this.mContext = mContext;
        this.mResources = mResources;

    }


    @Override
    public int getCount() {
        return mResources.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (o);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.slide, container, false);

        ImageView slideimg = itemView.findViewById(R.id.slideimg);

        Picasso.get().load(mResources.get(position).getCover().getMedium().getUrl()).into(slideimg);
        TextView centerTitle = itemView.findViewById(R.id.centerTitle);
        TextView centerSubtitle = itemView.findViewById(R.id.centerSubtitle);
        centerTitle.setText(""+mResources.get(position).getTitle());
        centerSubtitle.setText(""+mResources.get(position).getSubTitle());

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }

}
