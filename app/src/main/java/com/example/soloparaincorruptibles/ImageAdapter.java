package com.example.soloparaincorruptibles;

import android.content.Context;
import android.view.View;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter{

    private Context mContext;

    public int[] galeryContent = {
            R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4,
    };

    public ImageAdapter(Context mContext){
        this.mContext = mContext;
    }

    @Override
    public int getCount() {

        return galeryContent.length;
    }

    @Override
    public Object getItem(int position) {

        return galeryContent[position];
    }

    @Override
    public long getItemId(int position) {

        return 0;//galeryContent[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(galeryContent[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(340, 350));

        return imageView;
    }
}
