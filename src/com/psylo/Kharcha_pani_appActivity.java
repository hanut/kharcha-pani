package com.psylo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;

public class Kharcha_pani_appActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
       // addListenerOnButton();
        setContentView(R.layout.main);
    }
    
    public void addKharcha(View v){
    	final Context context = getApplicationContext();
    	/*CharSequence text = "Add Expense!";
    	int duration = Toast.LENGTH_SHORT;
    	Toast toast = Toast.makeText(context, text, duration);
    	toast.show();*/
    	Log.v("appActivity1", "addKharcha");
    	Intent intent = new Intent(context, Kharcha_pani_appActivity2.class);
        startActivity(intent);  
		

    }
    
    
    public void addIncome(View v){
    	final Context context = getApplicationContext();
    	/*CharSequence text = "Add Income";
    	int duration = Toast.LENGTH_SHORT;
    	Toast toast = Toast.makeText(context, text, duration);
    	toast.show();*/
    	Intent intent = new Intent(context, Kharcha_pani_appActivity3.class);
        startActivity(intent);  
    }
    
}