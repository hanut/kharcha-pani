package com.psylo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

public class Kharcha_pani_appActivity2 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	Log.v("appActivity2", "In Expense");
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.add_expense);
    }
    
    public void submitKharcha(View v){
    	EditText et =(EditText)findViewById(R.id.kharchaAmount);
    	String msg = et.getText().toString();
    	Log.v("Kharcha Amount", msg);
    }
    

}