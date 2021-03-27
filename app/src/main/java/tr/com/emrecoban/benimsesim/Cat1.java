package tr.com.emrecoban.benimsesim;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import java.util.Locale;

/**
 * Created by Mr. SHEPHERD on 11/4/2017.
 */

public class Cat1 extends AppCompatActivity{

    CardView cat1_1, cat1_2, cat1_3, cat1_4, cat1_5, cat1_6, cat1_7, cat1_8, cat1_9;
    TextToSpeech BenimSesim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cat1);

        getSupportActionBar().setTitle("Nasıl Hissediyorum?");

        baslangic();

        cat1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("İyiyim", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("Üzgünüm", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("Mutluyum", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("Şaşkınım", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("Öfkeliyim", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat1_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("Hastayım", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat1_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("Uykuluyum", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat1_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("Yorgunum", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat1_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("Enerjiğim", TextToSpeech.QUEUE_FLUSH, null);
            }
        });

    }

    private void baslangic() {
        cat1_1 = (CardView) findViewById(R.id.cat1_1);
        cat1_2 = (CardView) findViewById(R.id.cat1_2);
        cat1_3 = (CardView) findViewById(R.id.cat1_3);

        cat1_4 = (CardView) findViewById(R.id.cat1_4);
        cat1_5 = (CardView) findViewById(R.id.cat1_5);
        cat1_6 = (CardView) findViewById(R.id.cat1_6);

        cat1_7 = (CardView) findViewById(R.id.cat1_7);
        cat1_8 = (CardView) findViewById(R.id.cat1_8);
        cat1_9 = (CardView) findViewById(R.id.cat1_9);

        BenimSesim=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    BenimSesim.setLanguage(new Locale ("tr", "TR"));

                }
            }
        });
    }
}
