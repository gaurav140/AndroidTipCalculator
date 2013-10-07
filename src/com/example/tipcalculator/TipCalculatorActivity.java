package com.example.tipcalculator;

import android.R.integer;
import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculatorActivity extends Activity {
	
	Button mButton10;
	Button mButton15;
	Button mButton20;
	EditText mText;
	TextView mTipAmt;
	TextView mTipHeader;
	TextView mTipCom;
	double mTipCalc;
	String mTipText;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	try {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
        mButton10 = (Button) findViewById(R.id.btTen);
        mButton15 = (Button) findViewById(R.id.btFifteen);
        mButton20 = (Button) findViewById(R.id.btTwenty);
        
        mText = (EditText) findViewById(R.id.etItem);
        mTipAmt = (TextView) findViewById(R.id.tvTipAmt);
        mTipHeader = (TextView) findViewById(R.id.tvTipLabel);
        mTipCom = (TextView) findViewById(R.id.tvTipComment);
        
        mButton10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mTipCalc = Integer.parseInt(mText.getText().toString());
				mTipCalc = (double) (mTipCalc*0.10);
				Double result = (double) mTipCalc;
				
				mTipAmt.setText("$"+result.toString());
				mTipCom.setText("Not Bad!");
				
			}
		});
        
        mButton15.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mTipCalc = Integer.parseInt(mText.getText().toString());
				mTipCalc = (double) (mTipCalc*0.15);
				Double result = (double) mTipCalc;
				
				mTipAmt.setText("$"+result.toString());
				mTipCom.setText("Good!");
				
			}
		});
        
        mButton20.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mTipCalc = Integer.parseInt(mText.getText().toString());
				mTipCalc = (double) (mTipCalc*0.20);
				Double result = (double) mTipCalc;
				
				mTipAmt.setText("$"+result.toString());
				mTipCom.setText("Awesome!");
				
			}
		});
        
        
    	}catch (Exception e) {
    		 e.printStackTrace();
    	}
    	
    }
    
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tip_calculator, menu);
        return true;
    }
    
}
