package com.dzu.adidasbestcollection.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.dzu.adidasbestcollection.R;
import com.dzu.adidasbestcollection.activities.DetailActivity;
import com.dzu.adidasbestcollection.models.Adidas;

import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ListViewHolder> {
    private Context context;
    private ArrayList<Adidas> listAdidas;

    public ItemListAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Adidas> getListAdidas() {
        return listAdidas;
    }

    public void setListAdidas(ArrayList<Adidas> listAdidas) {
        this.listAdidas = listAdidas;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ListViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        holder.tvName.setText(getListAdidas().get(position).getName());
        holder.tvElevation.setText(getListAdidas().get(position).getElevation());

        Glide.with(context).load(getListAdidas().get(position).getPhoto()).into(holder.imgList);
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailActivity = new Intent(context, DetailActivity.class);
                detailActivity.putExtra(DetailActivity.EXTRA_MOUNTAIN, listAdidas.get(position));
                context.startActivity(detailActivity);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListAdidas().size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvElevation;
        ImageView imgList;
        RelativeLayout relativeLayout;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name_list);
            tvElevation = itemView.findViewById(R.id.tv_elevation_list);
            imgList = itemView.findViewById(R.id.img_list);
            relativeLayout = itemView.findViewById(R.id.relative_layout);
        }
    }
}
