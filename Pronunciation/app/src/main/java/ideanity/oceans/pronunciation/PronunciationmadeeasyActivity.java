package ideanity.oceans.pronunciation;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.ImageButton;

public class PronunciationmadeeasyActivity extends Activity {
    /** Called when the activity is first created. */
	
	ImageButton btnStart;
	ImageButton btnListWord;
	ImageButton bTnTutorial;
	ImageButton btnExit;
	TextToSpeech ttobj;
	public MediaPlayer MP;
	
	final Context codelytical = this;
   
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.main);
        
        addButtonListener();
        
        //MP = MediaPlayer.create(PronunciationmadeeasyActivity.this, R.raw.bean);
	    //MP.start();
    }


	private void addButtonListener() {
		// TODO Auto-generated method stub
		
		//----------- Speak button ------------
		
		btnStart = (ImageButton) findViewById(R.id.Start);
		btnStart.setOnClickListener(new OnClickListener() {
	
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			Intent e = new Intent(PronunciationmadeeasyActivity.this, SPEECH.class);
			startActivity(e);
			
		}

	});
		
		
		//------------------ Word List us Button -------------------------
		
		btnListWord = (ImageButton) findViewById (R.id.btnWord);
		btnListWord.setOnClickListener(new OnClickListener() {

					public void onClick(View v) {
						// TODO Auto-generated method stub
						
						Intent e = new Intent(PronunciationmadeeasyActivity.this, WORD.class);
						startActivity(e);
						
						
					}
				});
		
		//------------------ Exit Button -------------------------
		
		btnExit = (ImageButton) findViewById (R.id.exit);
		btnExit.setOnClickListener(new OnClickListener() {

					public void onClick(View v) {
						// TODO Auto-generated method stub
						
						
					        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(codelytical);
					        alertDialogBuilder.setTitle("Hello boss!");
					        alertDialogBuilder
					                .setMessage("Are you sure you want to exit?")
					                .setCancelable(false)
					                .setPositiveButton("Yes",
					                        new DialogInterface.OnClickListener() {
					                            public void onClick(DialogInterface dialog, int id) {
					                                moveTaskToBack(true);
					                                android.os.Process.killProcess(android.os.Process.myPid());
					                                System.exit(1);
					                            }
					                        })

					                .setNegativeButton("No", new DialogInterface.OnClickListener() {
					                    public void onClick(DialogInterface dialog, int id) {

					                        dialog.cancel();
					                    }
					                });

					        AlertDialog alertDialog = alertDialogBuilder.create();
					        alertDialog.show();
					    
					}
				});
		
		
		//------------------ Tutorial Button -------------------------
		
		bTnTutorial = (ImageButton) findViewById (R.id.btnTutorial);
		bTnTutorial.setOnClickListener(new OnClickListener() {

					public void onClick(View v) {
						// TODO Auto-generated method stub
						
						Intent e = new Intent(PronunciationmadeeasyActivity.this, LIST.class);
						startActivity(e);
						
					}
				});
		
		
}
}