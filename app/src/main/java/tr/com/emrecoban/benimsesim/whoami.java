package tr.com.emrecoban.benimsesim;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

/**
 * Created by Mr. SHEPHERD on 12/2/2017.
 */

public class whoami extends AppCompatActivity {

    TextToSpeech BenimSesim;
    EditText name, age, live, extra, kan;
    TextView saveMetin;
    Button anlat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whoami);

        getSupportActionBar().setTitle("Ben Kimim?");
        baslangic();

        SharedPreferences veriler = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        final SharedPreferences.Editor editor = veriler.edit();

        String SPname = veriler.getString("SPname", "");
        String SPage = veriler.getString("SPage", "");
        String SPlive = veriler.getString("SPlive", "");
        String SPkan = veriler.getString("SPkan", "");
        String SPextra = veriler.getString("SPextra", "");

        saveMetin.setText("Adım " + SPname + ". " + SPage + " yaşındayım. Kan grubum " + SPkan + " Yaşadağım şehir " + SPlive + ". " + SPextra);
        name.setText(SPname);
        age.setText(SPage);
        live.setText(SPlive);
        kan.setText(SPkan);
        extra.setText(SPextra);

        anlat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("SPname", name.getText().toString());
                editor.putString("SPage", age.getText().toString());
                editor.putString("SPlive", live.getText().toString());
                editor.putString("SPkan", kan.getText().toString());
                editor.putString("SPextra", extra.getText().toString());
                editor.commit();


                saveMetin.setText("Adım " + name.getText().toString() + ". " + age.getText().toString() + " yaşındayım. Kan grubum " + kan.getText().toString() + "Yaşadığım şehir " + live.getText().toString() + ". " + extra.getText().toString());
                String metinAl = saveMetin.getText().toString();
                metinAl = metinAl.replace("+", "Pozitif");
                metinAl = metinAl.replace("-", "Negatif");

                BenimSesim.speak(metinAl, TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(getApplicationContext(), "Ses Oynatılıyor", Toast.LENGTH_SHORT).show();
            }
        });



    }

    private void baslangic() {

        anlat = (Button) findViewById(R.id.anlat);
        name = (EditText) findViewById(R.id.name);
        age = (EditText) findViewById(R.id.age);
        live = (EditText) findViewById(R.id.live);
        kan = (EditText) findViewById(R.id.kan);
        extra = (EditText) findViewById(R.id.extra);
        saveMetin = (TextView) findViewById(R.id.saveMetin);


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
