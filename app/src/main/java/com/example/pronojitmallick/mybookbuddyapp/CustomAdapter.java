package com.example.pronojitmallick.mybookbuddyapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Student on 14-May-17.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private ArrayList<DataModel> dataset;
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textViewName, textViewVersion;
        ImageView imageViewIcon;

        public ImageButton mRemoveButton;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            this.textViewVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);

            mRemoveButton = (ImageButton) itemView.findViewById(R.id.remove_icon);

        }
    }

    public CustomAdapter(ArrayList<DataModel> data) {
        this.dataset = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardslayout, parent, false);
        view.setOnClickListener(DataActivity.myOnClickListener);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    //    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageViewIcon = holder.imageViewIcon;

        textViewName.setText(dataset.get(listPosition).getName());
        textViewVersion.setText(dataset.get(listPosition).getVersion());
        imageViewIcon.setImageResource(dataset.get(listPosition).getImage());





        holder.mRemoveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the clicked item label
                DataModel itemLabel = dataset.get(listPosition);
                dataset.remove(listPosition);
                notifyItemRemoved(listPosition);

                notifyItemRangeChanged(listPosition,dataset.size());


//                Toast.makeText(,"Removed : " + itemLabel, Toast.LENGTH_SHORT).show();
            }
        });



    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
