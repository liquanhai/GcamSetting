package com.example.gcam_settings;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView about = (TextView) findViewById(R.id.about);
        String text1 = "Про гаммы и тонемапинг <a href=\"http://4pda.ru/forum/index.php?showtopic=937006&st=0#entry81080009\">можно прочитать тут</a><br>"+
                "Эффективный алгоритм сжатия(прошивать в Magisk) скачать <a href=\"https://drive.google.com/file/d/1N6G_eGo5_tEqNyvUuI2rZAqk2gz3KRTU/\">тут</a><br>"+
                "Видео про контроль выдержки и ручной фокус можно посмтореть(P.S есть только на модах Sanity и SkyKing) <a href=\"https://www.youtube.com/watch?v=gyQQa21zEDs&feature=youtu.be\">тут</a><br>"+
                "Порт MIUI камеры с самой MIUI(прошивать в Magisk) <a href=\"https://drive.google.com/file/d/1uqZibHcnYBbTvsfL9hcgEPCEQogoal51/view?usp=sharing\">тут</a><br>"+
                "Сравнение всех модов камеры <a href=\"https://docs.google.com/spreadsheets/d/1ompjjJ5BNvZ8j38cyvbNQitWlk4p2XcSAoyON98FCxA/edit?usp=sharing\">тут</a><br>";
        about.setText(Html.fromHtml(text1));
        about.setMovementMethod(LinkMovementMethod.getInstance());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_info) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
            builder.setTitle("Важная информация\\Important information")
                    .setMessage("Это приложения создано для полной\nинформации про Gcam\n\n" +
                            "GCam работает на Xiaomi mi8/mix 2s/mix3\n/Poco f1/RazerPhone2/1+(5t,6,6t), на остальных тлф роботоспособность камеры не гарантируется\n\n"+
                            "В этом приложении собранна самая важная информация про моды, настройки\nТак же вы можете написать отзыв или совет разработчикам модов")
                    .setCancelable(false)
                    .setNegativeButton("Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
            AlertDialog alert = builder.create();
            alert.show();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_BSG) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/BSG19071979"));
            startActivity(browserIntent);
        }
        if (id == R.id.nav_Developer) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/programistich"));
            startActivity(browserIntent);
        }
        if (id == R.id.nav_Design) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/artem_korotkevich"));
            startActivity(browserIntent);
        }
        if (id == R.id.nav_xtreme) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/xtrme"));
            startActivity(browserIntent);
        }
        if (id == R.id.nav_sanity) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/san1tyy"));
            startActivity(browserIntent);
        }
        if (id == R.id.nav_chat) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/joinchat/Dmb5WEZAHQ-opMenjj_nKw"));
            startActivity(browserIntent);
        }
        if (id == R.id.nav_Gcam) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/gcammi8mi"));
            startActivity(browserIntent);
        }
        if (id == R.id.nav_alexey) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/stas2z"));
            startActivity(browserIntent);
        }
        if (id == R.id.nav_skyking) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/SkyyKing007"));
            startActivity(browserIntent);
        }
        if (id == R.id.nav_camera) {
            Intent activity = new Intent(Main2Activity.this, MainActivity.class);
            startActivity(activity);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
