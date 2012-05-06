package com.psylo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

public class Kharcha_pani_appActivity3 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.add_income);
    }
    
    public void submitIncome(View v){
    	EditText et =(EditText)findViewById(R.id.incomeAmount);
    	String msg = et.getText().toString();
    	Log.v("Income Amount", msg);
    }

}