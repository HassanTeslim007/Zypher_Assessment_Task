package com.example.zypher_uitask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SeekBar seekBar = findViewById(R.id.seekBar);
        final TextView textView = findViewById(R.id.textView);



        TextView content = findViewById(R.id.content);
        content.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eget mauris molestie, volutpat nisl sed, auctor arcu. Nullam id molestie erat. Maecenas tristique bibendum elementum. Nulla diam erat, consectetur in massa eu, vulputate laoreet ipsum. Vivamus feugiat ultrices nisi. Vestibulum egestas sagittis erat id tincidunt. Quisque tempus neque eu leo eleifend porttitor. Aliquam dictum lectus turpis. Integer blandit turpis vel aliquam malesuada. Quisque faucibus sed velit vitae pellentesque.\n" +
                "Maecenas pulvinar ligula vel auctor molestie. Praesent eget finibus odio. Donec mollis elit vitae justo dapibus, et euismod tortor pharetra. Donec dapibus vel urna ut placerat. Nullam commodo leo lorem, eget auctor massa imperdiet vel. Duis metus risus, consectetur in magna non, fringilla mattis tortor. Ut tincidunt, ligula nec iaculis eleifend, nisl turpis mollis turpis, at iaculis sapien ipsum id eros. Sed finibus lacus in orci consequat laoreet at sed nulla. Nulla arcu lectus, pulvinar id eros nec, molestie elementum lacus. Pellentesque augue mauris, venenatis eu ultricies in, dapibus ut ipsum. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.\n" +
                "\n" +
                "Integer gravida orci id sem tempor posuere. Phasellus vehicula id felis id tristique. Aliquam dignissim dictum elit sit amet ultricies. In odio est, dignissim in neque eget, ullamcorper dapibus lacus. Proin auctor porttitor quam, ac maximus justo aliquam vel. Maecenas accumsan, magna in volutpat varius, purus dui posuere odio, nec tempor turpis lorem non enim. Vestibulum est eros, vestibulum quis laoreet ut, fringilla fringilla nibh. Vestibulum vehicula est non massa molestie rhoncus. Vestibulum luctus sem quis ligula tincidunt, id facilisis ligula semper. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet diam condimentum, dapibus justo quis, maximus sapien. Suspendisse quis massa laoreet, lobortis ante id, placerat lorem. Donec et lorem in lectus tempor egestas.\n" +
                "\n" +
                "Nunc sem leo, laoreet sed magna eu, elementum tristique orci. Sed convallis et libero a dignissim. Morbi velit urna, laoreet at rhoncus vel, accumsan nec quam. Donec congue lectus velit, non vehicula lorem ornare eget. Nulla facilisi. Nulla luctus egestas orci quis laoreet. Nam luctus tempus leo id fermentum. Nulla vitae eleifend odio. Mauris consequat sodales justo, nec feugiat massa. Vivamus faucibus lectus in sapien tincidunt tincidunt. Quisque viverra ullamcorper tortor. In hac habitasse platea dictumst. Nunc sed consectetur velit.");

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textView.setText(progress + " of 750");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.settings){
            SettingsSheet setting = new SettingsSheet();
            setting.show(getSupportFragmentManager(), "Settings Bottom Sheet");
        }
        return true;
    }

    public void tabbedMenu(View view) {
        Intent intent = new Intent(MainActivity.this, TabbedActivity.class);
        startActivity(intent);
    }
}
