package com.example.boopalan.navigationfinal.Adapters;

/**
 * Created by Boopalan on 13-Aug-2016.
 */
import android.animation.ValueAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.boopalan.navigationfinal.R;


/**
 * Created by adnen on 4/5/16.
 */
public class AboutAdapter extends RecyclerView.Adapter<AboutAdapter.ViewHolder> {

    // Set numbers of List in RecyclerView.

    private String[] titles;
     private String[] details;
    // private String[] titles= {"Apples","Apples","Apples","Apples","Apples","Apples"};
    // private String[] details={"Item 1 details","Item 1 details","Item 1 details","Item 1 details","Item 1 details","Item 1 details"};
    private int[] images={0,0,0,R.mipmap.cilents};
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;
        private int originalHeight = 0;
        private boolean isViewExpanded = false;

        public ViewHolder(View itemView) {

            super(itemView);
            itemImage = (ImageView) itemView.findViewById(R.id.item_image);
            itemTitle = (TextView) itemView.findViewById(R.id.item_title);
            itemDetail = (TextView) itemView.findViewById(R.id.item_detail);



        }



    }
    public AboutAdapter(String[] myDataset,String[] mydataset1) {
        titles = myDataset;
        details = mydataset1;
    }
    // public FragmentAdapter(String[] myDataset1) {
    //   details = myDataset;



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                         int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_fragment_one, parent, false);


        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        viewHolder.itemTitle.setText(titles[i]);
            viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
