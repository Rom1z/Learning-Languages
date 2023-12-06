package ideanity.oceans.pronunciation;

import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.view.WindowManager;
import android.widget.Toast;

public class SPLASH extends Activity implements OnInitListener {

    private TextToSpeech myTTS;
    private int MY_DATA_CHECK_CODE = 0;

    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash);


        Intent checkTTSIntent = new Intent();
        checkTTSIntent
                .setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent, MY_DATA_CHECK_CODE);

        Thread timer = new Thread() {
            public void run() {

                try {

                    sleep(5000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {

                    Intent i = new Intent(SPLASH.this, PronunciationmadeeasyActivity.class);
                    finish();
                    startActivity(i);
                    speakWords("Welcome to my English Learning Application: by CodeLytical");

                }


            }
        };
        timer.start();


    }//-------------- end


    private void speakWords(String speech) {
        // TODO Auto-generated method stub

        if (myTTS != null) {
            myTTS.speak(speech, TextToSpeech.QUEUE_FLUSH, null);
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == MY_DATA_CHECK_CODE) {
            if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
                // the user has the necessary data - create the TTS
                myTTS = new TextToSpeech(this, this);
            } else {
                // no data - install it now
                Intent installTTSIntent = new Intent();
                installTTSIntent
                        .setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
                startActivity(installTTSIntent);
            }
        }
    }


    // --------------------------------------------------------
    public void onInit(int initStatus) {
// TODO Auto-generated method stub

        if (initStatus == TextToSpeech.SUCCESS) {
            if (myTTS.isLanguageAvailable(Locale.US) == TextToSpeech.LANG_AVAILABLE)
                myTTS.setLanguage(Locale.US);
        } else if (initStatus == TextToSpeech.ERROR) {
            Toast.makeText(this, "Sorry! Text To Speech failed...",
                    Toast.LENGTH_LONG).show();
        }


    }


}
