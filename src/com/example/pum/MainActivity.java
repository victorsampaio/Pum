package com.example.pum;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	MediaPlayer pum;
	Button btnPum;
	//ImageButton btnPum;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		  pum = MediaPlayer.create(this, R.raw.sonsdepeido);
	      btnPum = (Button)this.findViewById(R.id.btnPum);

	      btnPum.setOnClickListener(new View.OnClickListener() {

	         @Override
	         public void onClick(View v) {
	           pum.start();
	         }
	     });			
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}	

}
