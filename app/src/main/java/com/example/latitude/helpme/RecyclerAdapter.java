package com.example.latitude.helpme;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mariem on 4/25/2017.
 */


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {


    private ArrayList<adviceModle> arrayList= new ArrayList<adviceModle>();
    Context ctx;

    public RecyclerAdapter(ArrayList<adviceModle> arrayList, Context ctx){
        this.arrayList=arrayList;
        this.ctx=ctx;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // final RecyclerViewHolder holder = new RecyclerViewHolder(view);
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.advice_layout,parent,false);

        // int position = holder.getAdapterPosition();
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view) {

            @Override
            public void onClick(View view) {
                final Intent intent;
                final int position=getAdapterPosition();

                switch (getAdapterPosition()){
                    case 0:
                        intent =  new Intent(ctx, Activity_chaleur.class);
                        intent.putExtra("image", arrayList.get(position).getImg_res()); //you can name the keys whatever you like
                        intent.putExtra("title", arrayList.get(position).getTitle()); //note that all these values have to be primitive (i.e boolean, int, double, String, etc.)
                        intent.putExtra("txt", arrayList.get(position).getTxt());

                        break;
                    case 1:
                        intent =  new Intent(ctx, Activity_blessure.class);
                        intent.putExtra("image", arrayList.get(position).getImg_res()); //you can name the keys whatever you like
                        intent.putExtra("title", arrayList.get(position).getTitle()); //note that all these values have to be primitive (i.e boolean, int, double, String, etc.)
                        intent.putExtra("txt", arrayList.get(position).getTxt());

                        break;
                    default:
                        intent =  new Intent(ctx, Activity_vid.class);
                        intent.putExtra("image", arrayList.get(position).getImg_res()); //you can name the keys whatever you like
                        intent.putExtra("title", arrayList.get(position).getTitle()); //note that all these values have to be primitive (i.e boolean, int, double, String, etc.)
                        intent.putExtra("txt", arrayList.get(position).getTxt());

                        break;

                }
                ctx.startActivity(intent);
            }

        };

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        adviceModle advicem = arrayList.get(position);
        holder.imageView.setImageResource(advicem.getImg_res());

        holder.title.setText((CharSequence) advicem.getTitle());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static abstract class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;
        TextView title;
        //  TextView txt;
        Context ctx;
        private ArrayList<adviceModle> arrayList= new ArrayList<adviceModle>();

        public RecyclerViewHolder(View view)
        {
            super(view);

            this.arrayList=arrayList;
            ctx = itemView.getContext();
            int pos= getAdapterPosition();

            imageView=(ImageView)view.findViewById(R.id.image);
            title=(TextView)view.findViewById(R.id.title);
            // txt=(TextView)view.findViewById(R.id.txt);
            view.setOnClickListener(this);
        }


    }
}

