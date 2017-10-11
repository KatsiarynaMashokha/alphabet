package com.epicodus.alphabets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Guest on 10/11/17.
 */

public class AlphabetAdapter extends BaseAdapter {

    private Context mContext;
    private String[] mLetters;

    public AlphabetAdapter(Context context, String[] letters) {
        this.mContext = context;
        this.mLetters = letters;
    }

    @Override
    public int getCount() {
        return mLetters.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {
            gridView = inflater.inflate(R.layout.alphabet_grid_item, null);

            TextView letterTextView = (TextView) gridView
                    .findViewById(R.id.grid_item_letter);

            letterTextView.setText(mLetters[position]);
        } else {
            gridView = (View) convertView;
        }
        return gridView;
    }
}
