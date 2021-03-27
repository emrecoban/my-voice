package tr.com.emrecoban.benimsesim;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.Image;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class AnaEkran extends AppCompatActivity {

    CardView cat0, cat1, cat2, cat3, cat4, cat5, whoami;
    ImageView ara112, ara155, ara110;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_anaekran);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        getSupportActionBar().setTitle("  Benim Sesim");

        baslangic();

        whoami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), whoami.class);
                startActivity(i);
            }
        });

        cat0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Cat0.class);
                startActivity(i);
            }
        });

        cat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Cat1.class);
                startActivity(i);
            }
        });

        cat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Cat2.class);
                startActivity(i);
            }
        });

        cat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Cat3.class);
                startActivity(i);
            }
        });

        cat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Cat4.class);
                startActivity(i);
            }
        });

        cat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Cat5.class);
                startActivity(i);
            }
        });

        ara110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:110"));
                startActivity(intent);
            }
        });
        ara112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:112"));
                startActivity(intent);
            }
        });
        ara155.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:155"));
                startActivity(intent);
            }
        });

    }

    private void baslangic() {
        whoami = (CardView) findViewById(R.id.whoami);
        cat0 = (CardView) findViewById(R.id.cat0);
        cat1 = (CardView) findViewById(R.id.cat1);
        cat2 = (CardView) findViewById(R.id.cat2);
        cat3 = (CardView) findViewById(R.id.cat3);
        cat4 = (CardView) findViewById(R.id.cat4);
        cat5 = (CardView) findViewById(R.id.cat5);

        ara110 = (ImageView) findViewById(R.id.ara110);
        ara112 = (ImageView) findViewById(R.id.ara112);
        ara155 = (ImageView) findViewById(R.id.ara155);

    }
}
