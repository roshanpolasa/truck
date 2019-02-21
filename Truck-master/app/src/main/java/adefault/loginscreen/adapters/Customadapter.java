package adefault.loginscreen.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import adefault.loginscreen.R;
import adefault.loginscreen.model.Planet;


public class Customadapter extends ArrayAdapter<Planet> {
    Context mcontext;
    int mresource;

    public Customadapter(@NonNull Context context, int resource, ArrayList<Planet> planets) {
        super(context,R.layout.planet_item,planets);
        mcontext=context;
mresource=resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String name=getItem(position).getName();
        LayoutInflater inflater=LayoutInflater.from(mcontext);
        convertView =inflater.inflate(mresource,null,true);
        TextView textView=convertView.findViewById(R.id.title);
        TextView population=convertView.findViewById(R.id.population);
        TextView climate=convertView.findViewById(R.id.climate);
        textView.setText(name);
      // population.setText(population);

        return convertView;


    }
}
