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

public class Cat5 extends AppCompatActivity{

    CardView cat5_1, cat5_2, cat5_3, cat5_4, cat5_5, cat5_6, cat5_7, cat5_8, cat5_9;
    TextToSpeech BenimSesim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cat5);

        getSupportActionBar().setTitle("Sıkça Kullanılan Sözcükler");

        baslangic();

        cat5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("evet", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("hayır", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("teşekkürler", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat5_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("yeterli", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat5_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("tekrar", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat5_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("lütfen", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat5_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("günaydın", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat5_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("merhaba", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat5_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("iyi günler", TextToSpeech.QUEUE_FLUSH, null);
            }
        });

    }

    private void baslangic() {
        cat5_1 = (CardView) findViewById(R.id.cat5_1);
        cat5_2 = (CardView) findViewById(R.id.cat5_2);
        cat5_3 = (CardView) findViewById(R.id.cat5_3);
        cat5_4 = (CardView) findViewById(R.id.cat5_4);
        cat5_5 = (CardView) findViewById(R.id.cat5_5);
        cat5_6 = (CardView) findViewById(R.id.cat5_6);
        cat5_7 = (CardView) findViewById(R.id.cat5_7);
        cat5_8 = (CardView) findViewById(R.id.cat5_8);
        cat5_9 = (CardView) findViewById(R.id.cat5_9);

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
