package ideanity.oceans.pronunciation;

import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;

public class SPEECH extends Activity {

    float pitch = -1;
    float speechRate = -1;
    ImageButton btnBack;
    ImageButton btnClear;
    TextToSpeech ttobj;
    private EditText write;


    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speech);

        //------------------ start text to speech ---------------------
        write = (EditText) findViewById(R.id.txtInput);


        ttobj = new TextToSpeech(getApplicationContext(),
                new TextToSpeech.OnInitListener() {
                    public void onInit(int status) {

                        if (status != TextToSpeech.ERROR) {
                            ttobj.setLanguage(Locale.US);

                            /**

                             Sr.No	Locale
                             1	US
                             2	CANADA_FRENCH
                             3	GERMANY
                             4	ITALY
                             5	JAPAN
                             6	CHINA
                             7	UK
                             **/

                        }
                    }
                });

        //------------------ end text to speech ---------------------


        addButtonListener();

    }

    private void addButtonListener() {
        // TODO Auto-generated method stub

        //----------- Star Button back --------------------------------------

        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent e = new Intent(SPEECH.this, PronunciationmadeeasyActivity.class);
                startActivity(e);

            }

        });

        //----------- end Button back --------------------------------------

        //----------- Star Button Clear --------------------------------------
        btnClear = (ImageButton) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                write.setText("");
                ttobj.stop();

            }

        });

        //----------- end Button Clear --------------------------------------


    }


    public void onPause() {
        if (ttobj != null) {
            ttobj.stop();
        }
        super.onPause();
    }

    public void speakText(View view) {

        ttobj.setPitch(pitch);
        ttobj.setSpeechRate(speechRate);
        String toSpeak = write.getText().toString();
        ttobj.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);


    }

}
