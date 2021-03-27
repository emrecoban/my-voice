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

public class Cat3 extends AppCompatActivity{

    CardView cat3_1, cat3_2, cat3_3, cat3_4, cat3_5, cat3_6;
    TextToSpeech BenimSesim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cat3);

        getSupportActionBar().setTitle("Eylemler");

        baslangic();

        cat3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("ışıkları aç", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("televizyonu aç", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("sesini aç", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("değiştir", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat3_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("verebilirsin", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat3_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("kapat", TextToSpeech.QUEUE_FLUSH, null);
            }
        });


    }

    private void baslangic() {
        cat3_1 = (CardView) findViewById(R.id.cat3_1);
        cat3_2 = (CardView) findViewById(R.id.cat3_2);
        cat3_3 = (CardView) findViewById(R.id.cat3_3);
        cat3_4 = (CardView) findViewById(R.id.cat3_4);
        cat3_5 = (CardView) findViewById(R.id.cat3_5);
        cat3_6 = (CardView) findViewById(R.id.cat3_6);

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
