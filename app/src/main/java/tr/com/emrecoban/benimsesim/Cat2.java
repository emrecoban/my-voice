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

public class Cat2 extends AppCompatActivity{

    CardView cat2_1, cat2_2, cat2_3, cat2_4, cat2_5, cat2_6, cat2_7, cat2_8, cat2_9;
    TextToSpeech BenimSesim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cat2);

        getSupportActionBar().setTitle("Gitmek İstiyorum");

        baslangic();

        cat2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("eve gitmek istiyorum", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("hastaneye gitmek istiyorum", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("bankaya gitmek istiyorum", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("havalimanına  gitmek istiyorum", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("trene  gitmek istiyorum", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat2_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("alışverişe  gitmek istiyorum", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat2_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("plaja  gitmek istiyorum", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat2_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("tiyatroya  gitmek istiyorum", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat2_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("sinemaya  gitmek istiyorum", TextToSpeech.QUEUE_FLUSH, null);
            }
        });

    }

    private void baslangic() {
        cat2_1 = (CardView) findViewById(R.id.cat2_1);
        cat2_2 = (CardView) findViewById(R.id.cat2_2);
        cat2_3 = (CardView) findViewById(R.id.cat2_3);
        cat2_4 = (CardView) findViewById(R.id.cat2_4);
        cat2_5 = (CardView) findViewById(R.id.cat2_5);
        cat2_6 = (CardView) findViewById(R.id.cat2_6);
        cat2_7 = (CardView) findViewById(R.id.cat2_7);
        cat2_8 = (CardView) findViewById(R.id.cat2_8);
        cat2_9 = (CardView) findViewById(R.id.cat2_9);

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
