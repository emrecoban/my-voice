package tr.com.emrecoban.benimsesim;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

/**
 * Created by Mr. SHEPHERD on 11/27/2017.
 */

public class Cat0 extends AppCompatActivity {

    TextToSpeech BenimSesim;
    Button basKonus;
    EditText gelenMetin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cat0);

        getSupportActionBar().setTitle("Sana Özel");

        basKonus = (Button) findViewById(R.id.basKonus);
        gelenMetin = (EditText) findViewById(R.id.gelenMetin);

        basKonus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BenimSesim.speak(gelenMetin.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        BenimSesim=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    BenimSesim.setLanguage(new Locale("tr", "TR"));

                }
            }
        });
    }
}
