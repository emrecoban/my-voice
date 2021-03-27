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

public class Cat4 extends AppCompatActivity{

    CardView cat4_1, cat4_2, cat4_3, cat4_4, cat4_5, cat4_6, cat4_7;
    TextToSpeech BenimSesim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cat4);

        getSupportActionBar().setTitle("İhtiyacım Var");

        baslangic();

        cat4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("yalnız kalmaya ihtiyacım var", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("paraya ihtiyacım var", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("gözlüğe ihtiyacım var", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("araya ihtiyacım var", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("internete ihtiyacım var", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat4_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("suya ihtiyacım var", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        cat4_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak("tuvalete gitmeliyim", TextToSpeech.QUEUE_FLUSH, null);
            }
        });

    }

    private void baslangic() {
        cat4_1 = (CardView) findViewById(R.id.cat4_1);
        cat4_2 = (CardView) findViewById(R.id.cat4_2);
        cat4_3 = (CardView) findViewById(R.id.cat4_3);
        cat4_4 = (CardView) findViewById(R.id.cat4_4);
        cat4_5 = (CardView) findViewById(R.id.cat4_5);
        cat4_6 = (CardView) findViewById(R.id.cat4_6);
        cat4_7 = (CardView) findViewById(R.id.cat4_7);


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
