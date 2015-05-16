package com.gersoncardenas.turismo_sanjeronimo_v20;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.app.FragmentManager;
import android.app.FragmentTransaction;


public class MainActivity extends ActionBarActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    private MainFragment mainFragment = new MainFragment();
    private HotelFragment hotelFragment = new HotelFragment();
    private BarFragment barFragment = new BarFragment();
    private TownFragment townFragment = new TownFragment();
    private TourFragment tourFragment = new TourFragment();
    private AboutFragment aboutFragment = new AboutFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(android.R.id.content,mainFragment).commit();

        /*final Animation animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);

        Button btnHotel = (Button)findViewById(R.id.hotelButton);
        Button btnBar = (Button)findViewById(R.id.barButton);
        Button btnTour = (Button)findViewById(R.id.tourButton);
        Button btnTown = (Button)findViewById(R.id.townButton);

        btnHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);

                Context context = getApplicationContext();
                Intent i = new Intent(context, HotelActivity.class);
                startActivity(i);
            }
        });

        btnBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);

                Context context = getApplicationContext();
                Intent i = new Intent(context, BarActivity.class);
                startActivity(i);
            }
        });

        btnTour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);

                Context context = getApplicationContext();
                Intent i = new Intent(context, TourActivity.class);
                startActivity(i);
            }
        });

        btnTown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);

                Context context = getApplicationContext();
                Intent i = new Intent(context, TownActivity.class);
                startActivity(i);
            }
        });*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        //noinspection SimplifiableIfStatement
        if (id == R.id.main_menu) {
            fragmentTransaction.replace(android.R.id.content, mainFragment).commit();
        }

        if (id == R.id.hotel_menu) {
            fragmentTransaction.replace(android.R.id.content, hotelFragment).commit();
        }

        if (id == R.id.bar_menu) {
            fragmentTransaction.replace(android.R.id.content, barFragment).commit();
        }

        if (id == R.id.tour_menu) {
            fragmentTransaction.replace(android.R.id.content, tourFragment).commit();
        }

        if (id == R.id.town_menu) {
            fragmentTransaction.replace(android.R.id.content, townFragment).commit();
        }

        if (id == R.id.about_menu) {
            fragmentTransaction.replace(android.R.id.content, aboutFragment).commit();
        }

        return super.onOptionsItemSelected(item);
    }
}
