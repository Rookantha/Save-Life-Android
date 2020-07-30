package com.example.savelife;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class Laboratory extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout labDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laboratory);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        labDrawer = findViewById(R.id.drawer_lab_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, labDrawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        labDrawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new AbnormalFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_abnormal);

    }
}
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_abnormal:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new AbnormalFragment()).commit();
                break;
            case R.id.nav_critical:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new CriticalFragment()).commit();
                break;
            case R.id.nav_insert:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new InsertFragment()).commit();
                break;

    }
        labDrawer.closeDrawer(GravityCompat.START);
        return true;
}
    @Override
    public void onBackPressed() {
        if(labDrawer.isDrawerOpen(GravityCompat.START)){
            labDrawer.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
}
