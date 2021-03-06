    package com.example.boopalan.navigationfinal;

    import android.net.Uri;
    import android.os.Bundle;
    import android.support.v4.app.Fragment;
    import android.support.v4.app.FragmentManager;
    import android.support.design.widget.NavigationView;
    import android.support.v4.view.GravityCompat;
    import android.support.v4.widget.DrawerLayout;
    import android.support.v7.app.ActionBarDrawerToggle;
    import android.support.v7.app.AppCompatActivity;
    import android.support.v7.widget.Toolbar;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.widget.TextView;

    import com.example.boopalan.navigationfinal.Fragments.About;
    import com.example.boopalan.navigationfinal.Fragments.Consultancy;
    import com.example.boopalan.navigationfinal.Fragments.Contact;
    import com.example.boopalan.navigationfinal.Fragments.FoodStorage;
    import com.example.boopalan.navigationfinal.Fragments.Home;
    import com.example.boopalan.navigationfinal.Fragments.ColdStorage;
    import com.example.boopalan.navigationfinal.Fragments.Help;
    import com.example.boopalan.navigationfinal.Fragments.SecuritySystem;
    import com.example.boopalan.navigationfinal.Fragments.ValueAdded;

    public class MainActivity extends AppCompatActivity
            implements NavigationView.OnNavigationItemSelectedListener, Home.OnFragmentInteractionListener,
            ColdStorage.OnFragmentInteractionListener,FoodStorage.OnFragmentInteractionListener,SecuritySystem.OnFragmentInteractionListener,ValueAdded.OnFragmentInteractionListener,Consultancy.OnFragmentInteractionListener,Contact.OnFragmentInteractionListener,About.OnFragmentInteractionListener,Help.OnFragmentInteractionListener{


        TextView txt_help_gest;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);




            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            if (savedInstanceState == null) {
                Fragment fragment = null;
                Class fragmentClass = null;
                fragmentClass = Home.class;
                try {
                    fragment = (Fragment) fragmentClass.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
            }



            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.setDrawerListener(toggle);
            toggle.syncState();

            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);
        }

        @Override
        public void onBackPressed() {
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }
            if(id==R.id.help){
                return true;
            }

            return super.onOptionsItemSelected(item);
        }

        @SuppressWarnings("StatementWithEmptyBody")
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            // Handle navigation view item clicks here.
            int id = item.getItemId();
            Fragment fragment = null;
            Class fragmentClass = null;
            if (id == R.id.nav_camera) {
                fragmentClass = Home.class;
            } else if (id == R.id.nav_gallery) {
                fragmentClass = ColdStorage.class;
            } else if (id == R.id.nav_slideshow) {
                fragmentClass = FoodStorage.class;
            } else if (id == R.id.nav_manage) {
                fragmentClass = SecuritySystem.class;
            } else if (id == R.id.nav_share) {
                fragmentClass = ValueAdded.class;
            } else if (id == R.id.nav_send) {
                fragmentClass = Consultancy.class;
            }
            else if (id == R.id.contact) {
                fragmentClass = Contact.class;
            }
            else if (id == R.id.about) {
                fragmentClass = About.class;
            }
            else if (id == R.id.help) {
                fragmentClass = Help.class;
            }
            try {
                fragment = (Fragment) fragmentClass.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();

            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }

        @Override
        public void onFragmentInteraction(Uri uri) {

        }


    }