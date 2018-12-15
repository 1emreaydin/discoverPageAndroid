package com.anonim.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.anonim.myapplication.Data.CategoriesItem;
import com.anonim.myapplication.Data.FeaturedItem;
import com.anonim.myapplication.Data.MyData;
import com.anonim.myapplication.Data.ProductsItem;
import com.anonim.myapplication.Retrofit.ApiClient;
import com.anonim.myapplication.Retrofit.RestInsterface;
import com.quinny898.library.persistentsearch.SearchBox;
import com.quinny898.library.persistentsearch.SearchResult;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import me.kungfucat.viewpagertransformers.AccordionTransformer;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity  implements ViewPager.OnPageChangeListener{

    private ViewPager viewPager;
    private List<FeaturedItem> featuredItems;
    private List<ProductsItem> productsItems;
    private List<CategoriesItem> categoriesItems;
    private ViewPagerAdapter mAdapter;
    TabLayout tabLayout;

    ConstraintLayout sayfa;

    private RecyclerView recycler_view;
    private RecyclerView recycler_view_categories;

    private SearchBox search;
    //declare it as global var for future cancel refresh
    private SwipeRefreshLayout swipeLayout;

    private RestInsterface restInsterface;
    private static final String TAG = MainActivity.class.getName();



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeLayout = findViewById(R.id.swipe_container);
        sayfa = findViewById(R.id.sayfa);
        sayfa.setVisibility(View.GONE);
        search = findViewById(R.id.searchbox);
        search.enableVoiceRecognition(this);
        search.setHint("Aradığını bul!");
        search.setLogoText("Ürün veya vitrin ara");
        /*
        for(int x = 0; x < 4; x++){

    //sharedpreferens ile kullanıcı aramalarını saklayarak, içeriye aktarabilirim
            SearchResult option = new SearchResult("Result " + Integer.toString(x),null);
            search.addSearchable(option);

        }
        */


        search.setMenuListener(new SearchBox.MenuListener(){
            @Override
            public void onMenuClick() {
                //Hamburger has been clicked
                DrawerLayout drawer =  findViewById(R.id.drawer_layout);
                drawer.openDrawer(GravityCompat.START);

            }
        });

        search.setSearchListener(new SearchBox.SearchListener(){

            @Override
            public void onSearchOpened() {
                Log.i(TAG, "onSearchOpened: ");
                //Use this to tint the screen
            }

            @Override
            public void onSearchClosed() {
                Log.i(TAG, "onSearchClosed: ");
                //Use this to un-tint the screen
            }

            @Override
            public void onSearchTermChanged(String term) {
                Log.i(TAG, "onSearchTermChanged: ");
                //React to the search term changing
                //Called after it has updated results
            }



            @Override

            public void onSearch(String searchTerm) {
                Log.i(TAG, "onSearch: ");
                //Toast.makeText(MainActivity.this, searchTerm +" Searched", Toast.LENGTH_LONG).show();

            }



            @Override

            public void onResultClick(SearchResult result) {

                //React to a result being clicked

            }



            @Override

            public void onSearchCleared() {

                //Called when the clear button is clicked

            }



        });

		//new products için recyclerview
        recycler_view = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        layoutManager.scrollToPosition(0);
        recycler_view.setLayoutManager(layoutManager);

		
		//categories için recyclerview
        recycler_view_categories = findViewById(R.id.recyclerViewCategori);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this);
        layoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        layoutManager1.scrollToPosition(0);
        recycler_view_categories.setLayoutManager(layoutManager1);


        ;
        swipeLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                getData();

            }
        });
        if(swipeLayout.isRefreshing()) {
            swipeLayout.setRefreshing(false);

        }

        getData();
    }

    @Override

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1234 && resultCode == RESULT_OK) {

            ArrayList<String> matches = data

                    .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

            search.populateEditText(matches.get(0));

        }

        super.onActivityResult(requestCode, resultCode, data);

    }

    //verileri çekiyorum
    private void getData(){
        swipeLayout.setRefreshing(false);
        sayfa.setVisibility(View.GONE);
        restInsterface = ApiClient.getClient().create(RestInsterface.class);
        Call<List<MyData>> listCall;
        listCall=restInsterface.getFeaturedList();
        listCall.enqueue(new Callback<List<MyData>>() {
            @Override
            public void onResponse(Call<List<MyData>> call, Response<List<MyData>> response) {

                //featured,shops ve kategorinin vs. içerisindeki bütün bilgileri Logcat'a basabiliyoruz.
				//api de 5 adet hücre var, 1.si features, 2. new products, 3.sü categories.... diye gidiyor.
                Toast.makeText(MainActivity.this, "Yüklendi", Toast.LENGTH_SHORT).show();
                featuredItems = response.body().get(0).getFeatured();
                productsItems = response.body().get(1).getProducts();
                categoriesItems = response.body().get(2).getCategories();
                setViewPager();
                setNewProducts();
                setCategories();
                sayfa.setVisibility(View.VISIBLE);
                //setUpViewPager();
                swipeLayout.setRefreshing(true);
            }

            @Override
            public void onFailure(Call<List<MyData>> call, Throwable t) {

            }
        });
    }


    @Override
    public void onPageScrolled(int i, float v, int i1) {
        Log.i(TAG, "onPageScrolled: ");
        swipeLayout.setRefreshing(false);
        swipeLayout.setEnabled(false);
    }

    @Override
    public void onPageSelected(int position) {
        Log.i(TAG, "onPageSelected: ");
    }

    @Override
    public void onPageScrollStateChanged(int i) {
        Log.i(TAG, "onPageScrollStateChanged:");
        swipeLayout.setEnabled(true);

    }

	//viewpager için 
    public void setViewPager() {

        viewPager = findViewById(R.id.viewPager);
        viewPager.removeAllViews();
        mAdapter = new ViewPagerAdapter(MainActivity.this, featuredItems);
        viewPager.setAdapter(mAdapter);
        viewPager.setPageTransformer(true, new AccordionTransformer());

        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setClickable(false);
        tabLayout.setupWithViewPager(viewPager, true);
        viewPager.setCurrentItem(0);
        viewPager.setOnPageChangeListener(this);

    }

	//newproducts'ları recyclerview içine basmak için.
    public void setNewProducts(){
        NewProductsAdapter adapter_items = new NewProductsAdapter(productsItems, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Log.d("position", "Tıklanan Pozisyon:" + position);
                ProductsItem productsItem = productsItems.get(position);
                Toast.makeText(getApplicationContext(),"pozisyon:"+" "+position+" "+"Ad:"+productsItem.getTitle(),Toast.LENGTH_SHORT).show();
            }
        });
        recycler_view.setHasFixedSize(true);
        recycler_view.setAdapter(adapter_items);
        recycler_view.setItemAnimator(new DefaultItemAnimator());

    }

	//kategorileri basmak için.
    public void setCategories(){

        CategoriAdapter adapter_items = new CategoriAdapter(categoriesItems, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Log.d("position", "Tıklanan Pozisyon:" + position);
                CategoriesItem categoriesItem = categoriesItems.get(position);
                Toast.makeText(getApplicationContext(),"pozisyon:"+" "+position+" "+"Ad:"+categoriesItem.getName(),Toast.LENGTH_SHORT).show();
            }
        });
        recycler_view_categories.setHasFixedSize(true);
        recycler_view_categories.setAdapter(adapter_items);
        recycler_view_categories.setItemAnimator(new DefaultItemAnimator());


    }
}
