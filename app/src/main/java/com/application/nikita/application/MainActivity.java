package com.application.nikita.application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.application.nikita.application.add.AddingFragment;
import com.application.nikita.application.home.HomeFragment;
import com.application.nikita.application.like.LikeFragment;
import com.application.nikita.application.profile.ProfileFragment;
import com.application.nikita.application.search.SearchFragment;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationAdapter;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AHBottomNavigation bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation);
        AHBottomNavigationAdapter navigationAdapter = new AHBottomNavigationAdapter(this, R.menu.bottom_navigation_main);
        navigationAdapter.setupWithBottomNavigation(bottomNavigation);
        //При нажатии на пункт меню загружем нужный фрагмент
        bottomNavigation.setOnTabSelectedListener( (position, wasSelected) -> {
            switch (position)
            {
                case SELECTED_MENU_ITEM.HOME_ITEM:
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.root_layout,new HomeFragment(), MainActivity.FRAGMENTS_TAG.HOME_FRAGMENT_TAG).commit();
                    break;
                }
                case SELECTED_MENU_ITEM.SEARCH_ITEM:
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.root_layout,new SearchFragment(), MainActivity.FRAGMENTS_TAG.SEARCH_FRAGMENT_TAG).commit();
                    break;
                }
                case SELECTED_MENU_ITEM.ADDING_ITEM:
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.root_layout,new AddingFragment(), MainActivity.FRAGMENTS_TAG.ADD_FRAGMENT_TAG).commit();
                    break;
                }
                case SELECTED_MENU_ITEM.LIKE_ITEM:
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.root_layout,new LikeFragment(), MainActivity.FRAGMENTS_TAG.LIKE_FRAGMENT_TAG).commit();
                    break;
                }
                case SELECTED_MENU_ITEM.PROFILE_ITEM:
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.root_layout,new ProfileFragment(), MainActivity.FRAGMENTS_TAG.PROFILE_FRAGMENT_TAG).commit();
                    break;
                }
            }
            return true;
        });
        getSupportFragmentManager().beginTransaction().replace(R.id.root_layout,new HomeFragment(), MainActivity.FRAGMENTS_TAG.HOME_FRAGMENT_TAG).commit();
    }

    public static class   SELECTED_MENU_ITEM
    {
        public static final int HOME_ITEM = 0;
        public static final int SEARCH_ITEM = 1;
        public static final int ADDING_ITEM = 2;
        public static final int LIKE_ITEM = 3;
        public static final int PROFILE_ITEM = 4;

    }

    public static class  FRAGMENTS_TAG
    {
        public static final String HOME_FRAGMENT_TAG = "HOME_FRAGMENT_TAG";
        public static final String SEARCH_FRAGMENT_TAG = "SEARCH_FRAGMENT_TAG";
        public static final String ADD_FRAGMENT_TAG = "ADD_FRAGMENT_TAG";
        public static final String LIKE_FRAGMENT_TAG = "LIKE_FRAGMENT_TAG";
        public static final String PROFILE_FRAGMENT_TAG = "PROFILE_FRAGMENT_TAG";
    }
}
