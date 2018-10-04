package com.logicalapphouse.calulator;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.logicalapphouse.calculator.common.GlobalClass;
import com.logicalapphouse.calulator.adapter.NavDrawerListAdapter;
import com.logicalapphouse.calulator.fragments.CalculatorFragment;
import com.logicalapphouse.calulator.fragments.CommonFragment;
import com.logicalapphouse.calulator.fragments.FrontMenuScreen;
import com.logicalapphouse.calulator.fragments.GamesFragment;
import com.logicalapphouse.calulator.fragments.TablesFragment;
import com.logicalapphouse.calulator.fragments.ThemeFragment;
import com.logicalapphouse.calulator.fragments.VadicMathsFragment;
import com.roughike.bottombar.BottomBar;

import cpom.logicalapphouse.calculator.pref.Pref;


public class MainActivity extends AppCompatActivity {
	//private DrawerLayout mDrawerLayout;
	//private ListView mDrawerList;
	//private ActionBarDrawerToggle mDrawerToggle;

	// nav drawer title
	private CharSequence mDrawerTitle;

	// used to store app title
	private CharSequence mTitle;

	// slide menu items
	//private String[] navMenuTitles;
	//private TypedArray navMenuIcons;

	//private ArrayList<NavDrawerItem> navDrawerItems;
	private NavDrawerListAdapter adapter;
	private FragmentManager  manager;
	private FragmentTransaction ft;
	int i = 0;
    private Paint mPaint=null;
	private BottomBar mBottomBar;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		// // hide the window title.
		// requestWindowFeature(Window.FEATURE_NO_TITLE);
		// // hide the status bar and other OS-level chrome
		// getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

		super.onCreate(savedInstanceState);

        /** Create Splash Ad **/
//        StartAppAd.showSplash(this, savedInstanceState,
//				new SplashConfig()
//						.setTheme(SplashConfig.Theme.GLOOMY)
//						.setLogo(R.drawable.icon)
//						.setAppName("Fast Calculation")
//		);

		setContentView(R.layout.activity_main);
//		mBottomBar = BottomBar.attachShy((CoordinatorLayout) findViewById(R.id.myCoordinator),
//				findViewById(R.id.myScrollingContent), savedInstanceState);
//		//mBottomBar.noNavBarGoodness();
//		mBottomBar.useFixedMode();
//		mBottomBar.noNavBarGoodness();
//		mBottomBar.setTypeFace("NeoGram-Medium.ttf");
//
//		mBottomBar.setItems(
//				new BottomBarTab(null, "Recents"),
//				new BottomBarTab(null, "Favorites"),
//				new BottomBarTab(null, "Nearby")
//		);
//
//		mBottomBar.mapColorForTab(0, ContextCompat.getColor(this, R.color.colorAccent));
//		//mBottomBar.mapColorForTab(1, "#7B1FA2");
//		mBottomBar.mapColorForTab(1, "#FF5252");
//		mBottomBar.mapColorForTab(2, "#FF9800");
//// Listen for tab changes
//		mBottomBar.setOnTabClickListener(new OnTabClickListener() {
//			@Override
//			public void onTabSelected(int position) {
//				// The user selected a tab at the specified position
//			}
//
//			@Override
//			public void onTabReSelected(int position) {
//				// The user reselected a tab at the specified position!
//			}
//		});
        GlobalClass.getInstance().pref = new Pref(getApplicationContext());
        
       // GlobalClass.getInstance().actionBar =getSupportActionBar();
       // GlobalClass.getInstance().actionBar.setBackgroundDrawable(new ColorDrawable(GlobalClass.getInstance().pref.getColorCode()));
        GlobalClass.getInstance().activity = this;
		GlobalClass.getInstance().background = (ImageView)findViewById(R.id.back);

		mTitle = mDrawerTitle = getTitle();

//		// load slide menu items
//		navMenuTitles = getResources().getStringArray(R.array.nav_drawer_items);
//
//		// nav drawer icons from resources
//		navMenuIcons = getResources()
//				.obtainTypedArray(R.array.nav_drawer_icons);
//
//		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
//		mDrawerList = (ListView) findViewById(R.id.list_slidermenu);
//
//		navDrawerItems = new ArrayList<NavDrawerItem>();
//
//		// adding nav drawer items to array
//		//
//		navDrawerItems.add(new NavDrawerItem(navMenuTitles[0], navMenuIcons
//				.getResourceId(0, -1)));
//		//
//		navDrawerItems.add(new NavDrawerItem(navMenuTitles[1], navMenuIcons
//				.getResourceId(1, -1)));
//		//
//		navDrawerItems.add(new NavDrawerItem(navMenuTitles[2], navMenuIcons
//				.getResourceId(2, -1)));
//		//
//		navDrawerItems.add(new NavDrawerItem(navMenuTitles[3], navMenuIcons
//				.getResourceId(3, -1)));
//
//		// Recycle the typed array
//		navMenuIcons.recycle();

//		mDrawerList.setOnItemClickListener(new SlideMenuClickListener());
//
//		// setting the nav drawer list adapter
//		adapter = new NavDrawerListAdapter(getApplicationContext(),
//				navDrawerItems);
//		mDrawerList.setAdapter(adapter);

		// enabling action bar app icon and behaving it as toggle button
		//getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		//getSupportActionBar().setHomeButtonEnabled(true);


		getSupportFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {

			@Override
			public void onBackStackChanged() {
				Fragment f = getSupportFragmentManager().findFragmentById(R.id.frame_container);
				if (f != null) {
					((CommonFragment)GlobalClass.getInstance().fragment).onRefresh();
				}

			}
		});
//
//		mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
//				R.drawable.ic_drawer, // nav menu toggle icon
//				R.string.app_name, // nav drawer open - description for
//									// accessibility
//				R.string.app_name // nav drawer close - description for
//									// accessibility
//		) {
//			public void onDrawerClosed(View view) {
//				getSupportActionBar().setTitle(mTitle);
//				// calling onPrepareOptionsMenu() to show action bar icons
//				invalidateOptionsMenu();
//			}
//
//			public void onDrawerOpened(View drawerView) {
//				getSupportActionBar().setTitle(mDrawerTitle);
//				// calling onPrepareOptionsMenu() to hide action bar icons
//				invalidateOptionsMenu();
//			}
//		};
//		mDrawerLayout.setDrawerListener(mDrawerToggle);
//
//		if (savedInstanceState == null) {
//			// on first time display view for first nav item
//			displayView(0);
//		}

		switchFragment(new FrontMenuScreen());
	}

	/**
	 * Slide menu item click listener
	 * */
	private class SlideMenuClickListener implements
			ListView.OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			// display view for selected nav drawer item
			displayView(position);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
			return super.onOptionsItemSelected(item);
	}

	/***
	 * Called when invalidateOptionsMenu() is triggered
	 */
	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		// if nav drawer is opened, hide the action items
		return super.onPrepareOptionsMenu(menu);
	}
	/**
	 * Diplaying fragment view for selected nav drawer list item
	 * */
	public void displayView(int position) {
		// update the main content by replacing fragments
		Fragment fragment = null;
		switch (position) {
		case 0:
			fragment = new CalculatorFragment();
			break;
		case 1:
			fragment = new TablesFragment();
			break;
		case 2:
			fragment = new VadicMathsFragment();
			break;
		case 3:
			fragment =new ThemeFragment();
			break;
			case 4:
				fragment = new GamesFragment();
				break;
		    default:
			break;
		}
		switchFragment(fragment);
	}

	@Override
	public void setTitle(CharSequence title) {
		mTitle = title;
		getSupportActionBar().setTitle(mTitle);
	}

	/**
	 * When using the ActionBarDrawerToggle, you must call it during
	 * onPostCreate() and onConfigurationChanged()...
	 */

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// Sync the toggle state after onRestoreInstanceState has occurred.
		//mDrawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		// Pass any configuration change to the drawer toggls
		//mDrawerToggle.onConfigurationChanged(newConfig);
	}
	@Override
	public void onBackPressed(){
	  if (getSupportFragmentManager().getBackStackEntryCount() == 1){
	    finish();
	  }
	  else {
	    super.onBackPressed();
	  }
	}
	public void switchFragment(Fragment fragment){
		if (fragment != null) {
            GlobalClass.getInstance().fragment = (CommonFragment)fragment;
			String backStateName =  fragment.getClass().getName();
			String fragmentTag = backStateName;

			  manager = getSupportFragmentManager();
			  boolean fragmentPopped = manager.popBackStackImmediate (backStateName,
					  0);

			  if (!fragmentPopped && manager.findFragmentByTag(fragmentTag) == null){ //fragment not in back stack, create it.
			    ft = manager.beginTransaction();
				 ft.setCustomAnimations(R.anim.slide_up,
						 R.anim.slide_down);
				  ft.replace(R.id.frame_container, fragment, fragmentTag);
			    ft.addToBackStack(backStateName);
			    ft.commit();
			  }
			// update selected item and title, then close the drawer
			
		} else {
			// error in creating fragment
			Log.e("MainActivity", "Error in creating fragment");
		}
	}
//	@Override
//	protected void onSaveInstanceState(Bundle outState) {
//		super.onSaveInstanceState(outState);
//
//		// Necessary to restore the BottomBar's state, otherwise we would
//		// lose the current tab on orientation change.
//		mBottomBar.onSaveInstanceState(outState);
//	}
}