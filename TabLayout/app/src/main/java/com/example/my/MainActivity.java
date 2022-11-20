package com.example.my;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.icu.text.CaseMap;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

   TabLayout tabLayout;
   ViewPager2 viewPager2;
   ViewPagerFragmentAdapter viewPagerFragmentAdapter;
    private String[] title=new String[]{"CHATS", "STATUS","CALLS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*---------------------------------Hide ActionBar-----------------------------*/
        getSupportActionBar().hide();
        /*---------------------------------Hooks-----------------------------*/
        tabLayout=(TabLayout) findViewById(R.id.tabLayout);
        viewPager2=(ViewPager2) findViewById(R.id.viewPager2);
        viewPagerFragmentAdapter=new ViewPagerFragmentAdapter(this);

        /*---------------------------------Main Works-----------------------------*/
        viewPager2.setAdapter(viewPagerFragmentAdapter);
        new TabLayoutMediator(tabLayout,viewPager2,(tab, position) -> tab.setText(title[position])).attach();
    }
}