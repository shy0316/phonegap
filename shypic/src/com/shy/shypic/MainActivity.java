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
		
		//���ȼ����������棬�ӳ�5s�ټ��ص�½ҳ��
		super.setIntegerProperty("splashscreen", R.drawable.start2);
		//����ҳ��
		
		super.loadUrl("file:///android_asset/www/html/main.html",2000);
	}

	

}
