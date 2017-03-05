package com.example.android.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Finds View that shows the albums category and casts to TextView
        TextView albums = (TextView) findViewById(R.id.albums);

        // Sets click listener on the albums View
        albums.setOnClickListener(new View.OnClickListener() {
            // On click, sends intent to open albums activity
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, Albums.class);
                startActivity(albumsIntent);
            }
        });

        // Finds View that shows the artists category and casts to TextView
        TextView artists = (TextView) findViewById(R.id.artists);

        // Sets click listener on the artists View
        artists.setOnClickListener(new View.OnClickListener() {
            // On click, sends intent to open artists activity
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, Artists.class);
                startActivity(artistsIntent);
            }
        });

        // Finds View that shows the songs list category and casts to TextView
        TextView songs = (TextView) findViewById(R.id.songs);

        // Sets click listener on the songs list View
        songs.setOnClickListener(new View.OnClickListener() {
            // On click, sends intent to open songs activity
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, Songs.class);
                startActivity(songsIntent);
            }
        });

        // Finds View that shows the download button and casts to TextView
        TextView downloads = (TextView) findViewById(R.id.downloadButton);

        // Sets click listener on the downloads View
        downloads.setOnClickListener(new View.OnClickListener()   {
            //On click, sends intent to open downloads activity
            @Override
            public void onClick(View view)  {
                Intent songDetailIntent = new Intent(MainActivity.this, DownloadsPage.class);
                startActivity(songDetailIntent);
            }
        });

        // Finds View that shows the discover songs button and casts to TextView
        TextView discoverSongs = (TextView) findViewById(R.id.discoverButton);

        //Sets click listener on the discover songs View
        discoverSongs.setOnClickListener(new View.OnClickListener()    {
            // On click, sends intent to open discover songs activity
            @Override
            public void onClick(View view)  {
                Intent discoverSongsIntent = new Intent(MainActivity.this, DiscoverSongs.class);
                startActivity(discoverSongsIntent);
            }
        });
    }
}
