package com.example.pum;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	MediaPlayer pumUm, pumDois, pumTres, pumQuatro, pumCinco, pumSeis, pumSete,pumOito; 
	Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8   ; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Sound - PumUm
		pumUm = MediaPlayer.create(this, R.raw.sompum1);
		btn1 = (Button) this.findViewById(R.id.btn1);

		btn1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View vu) {
				pumUm.start();
			}
		});

		// Sound - PumDois
		pumDois = MediaPlayer.create(this, R.raw.sompum2);
		btn2 = (Button) this.findViewById(R.id.btn2);

		btn2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View vd) {
				pumDois.start();
			}
		});
		
		// Sound - PumTres
		pumTres = MediaPlayer.create(this, R.raw.sompum3);
		btn3 = (Button) this.findViewById(R.id.btn3);

		btn3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View vt) {
				pumTres.start();
			}
		});

		// Sound - PumQuatro
		pumQuatro = MediaPlayer.create(this, R.raw.sompum4);
		btn4 = (Button) this.findViewById(R.id.btn4);

		btn4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View vq) {
				pumQuatro.start();
			}
		});
		
		// Sound - PumCinco
		pumCinco = MediaPlayer.create(this, R.raw.sompum5);
		btn5 = (Button) this.findViewById(R.id.btn5);

		btn5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View vc) {
				pumCinco.start();
			}
		});

		// Sound - PumSeis
		pumSeis = MediaPlayer.create(this, R.raw.sompum6);
		btn6 = (Button) this.findViewById(R.id.btn6);

		btn6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View vs) {
				pumSeis.start();
			}
		});
		
		// Sound - PumSete
		pumSete = MediaPlayer.create(this, R.raw.sompum7);
		btn7 = (Button) this.findViewById(R.id.btn7);

		btn7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View vse) {
				pumSete.start();
			}
		});
		
		// Sound - PumOito
		pumOito = MediaPlayer.create(this, R.raw.sompum8);
		btn8 = (Button) this.findViewById(R.id.btn8);

		btn8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View vo) {
				pumOito.start();
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
