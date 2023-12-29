package com.example.lab4_illaila;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ArtistList extends ArrayAdapter<Artist> {
    private Activity context;
    List<Artist> artists;

    //create constructor
    public ArtistList(Activity context, List<Artist> artists)
    {
        super(context,R.layout.list_layout,artists);
        this.context = context;
        this.artists =artists;
    }

    public View getView (int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout,null,true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);

        Artist artist = artists.get(position);
        textViewName.setText(artist.getArtistName());

        return  listViewItem;
    }
}
