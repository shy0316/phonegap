package com.shy.shypic;

import org.apache.cordova.DroidGap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//首先加载启动画面，延迟5s再加载登陆页面
		super.setIntegerProperty("splashscreen", R.drawable.start2);
		//加载页面
		
		super.loadUrl("file:///android_asset/www/html/main.html",2000);
	}

	

}
