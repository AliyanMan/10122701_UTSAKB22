package com.example.a10122701_myselfapps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.a10122701_myselfapps.Fragment.DailyFragment;
import com.example.a10122701_myselfapps.Fragment.GalleryFragment;
import com.example.a10122701_myselfapps.Fragment.HomeFragment;
import com.example.a10122701_myselfapps.Fragment.MusicVideoFragment;
import com.example.a10122701_myselfapps.Fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    MeowBottomNavigation bottomNavigation;
    private final static int HOME_ID = 1;
    private final static int DAILY_ID = 2;
    private final static int GALLERY_ID = 3;
    private final static int MUSICVIDEO_ID = 4;
    private final static int PROFILE_ID = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_bottom_navigation_baseline_home_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_bottom_navigation_baseline_daily_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.ic_bottom_navigation_baseline_gallery_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(4,R.drawable.ic_bottom_navigaiton_baseline_musicvideo_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(5,R.drawable.ic_bottom_navigation_baseline_profile_24));

        getSupportFragmentManager().beginTransaction().replace(R.id.root_container, new HomeFragment()).commit();

        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {

            }
        });
        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {

            }
        });
        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment fragmentSelected = null;
                switch (item.getId())
                {
                    case HOME_ID:
                        fragmentSelected = new HomeFragment();
                        break;
                    case DAILY_ID:
                        fragmentSelected = new DailyFragment();
                        break;
                    case GALLERY_ID:
                        fragmentSelected = new GalleryFragment();
                        break;
                    case MUSICVIDEO_ID:
                        fragmentSelected = new MusicVideoFragment();
                        break;
                    case PROFILE_ID:
                        fragmentSelected = new ProfileFragment();
                        break;
                }

                assert fragmentSelected != null;
                getSupportFragmentManager().beginTransaction().replace(R.id.root_container,fragmentSelected).commit();
            }
        });

    }
}