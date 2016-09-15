package com.example.boopalan.navigationfinal.Adapters;

/**
 * Created by Boopalan on 13-Aug-2016.
 */
import android.animation.ValueAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
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
public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder>{

    // Set numbers of List in RecyclerView.
    private String[] titles;
    private String[] details;
    // private String[] titles= {"Apples","Apples","Apples","Apples","Apples","Apples"};
    // private String[] details={"Item 1 details","Item 1 details","Item 1 details","Item 1 details","Item 1 details","Item 1 details"};
    private int[] images={R.mipmap.ic_launcher};




    public static class ViewHolder extends RecyclerView.ViewHolder {
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
           itemView.setOnClickListener(new OnClickListener() {
               @Override
               public void onClick(final View view) {
                   if (originalHeight == 0) {
                       originalHeight = view.getHeight();
                   }

                   // Declare a ValueAnimator object
                   ValueAnimator valueAnimator;
                   if (!isViewExpanded) {
                       itemDetail.setVisibility(View.VISIBLE);
                       itemDetail.setEnabled(true);
                       isViewExpanded = true;
                       valueAnimator = ValueAnimator.ofInt(originalHeight, originalHeight + (int) (originalHeight * 0.2)); // These values in this method can be changed to expand however much you like
                   } else {
                       isViewExpanded = false;
                       valueAnimator = ValueAnimator.ofInt(originalHeight + (int) (originalHeight * 2.0), originalHeight);

                       Animation a = new AlphaAnimation(1.00f, 0.00f); // Fade out

                       a.setDuration(200);
                       // Set a listener to the animation and configure onAnimationEnd
                       a.setAnimationListener(new Animation.AnimationListener() {
                           @Override
                           public void onAnimationStart(Animation animation) {

                           }

                           @Override
                           public void onAnimationEnd(Animation animation) {
                               itemDetail.setVisibility(View.INVISIBLE);
                               itemDetail.setEnabled(false);
                           }

                           @Override
                           public void onAnimationRepeat(Animation animation) {

                           }
                       });

                       // Set the animation on the custom view
                       itemDetail.startAnimation(a);
                   }
                   valueAnimator.setDuration(200);
                   valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                   valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                       public void onAnimationUpdate(ValueAnimator animation) {
                           Integer value = (Integer) animation.getAnimatedValue();
                           view.getLayoutParams().height = value.intValue();
                           view.requestLayout();
                       }
                   });


                   valueAnimator.start();
               }


           });
            if (isViewExpanded == false) {
                // Set Views to View.GONE and .setEnabled(false)
                itemDetail.setVisibility(View.GONE);
                itemDetail.setEnabled(false);
            }

        }

    }
    public ContactAdapter(String[] myDataset,String[] myDataset1) {
        titles = myDataset;
          details = myDataset1;
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
