package com.example.uas_mobile_programing;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PromoAdapter extends RecyclerView.Adapter<PromoAdapter.PromoViewHoder> {
    private final LayoutInflater mInflater;
    private List<PromoModel> promoModelList;
    private LayoutInflater layoutInflater;
    private Context context;
    final PromoAdapter.OnItemClickListener listener;

    public PromoAdapter(List<PromoModel> promoModelList, Context context, OnItemClickListener listener) {
        this.mInflater = LayoutInflater.from(context);
        this.promoModelList = promoModelList;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PromoAdapter.PromoViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_promo,null);
        return new PromoAdapter.PromoViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PromoAdapter.PromoViewHoder holder, int position) {
        holder.bindData(promoModelList.get(position));

    }

    @Override
    public int getItemCount() {
        return promoModelList.size();
    }

    public void setItems(List<PromoModel> items) {
        promoModelList = items;
    }


    public class PromoViewHoder extends RecyclerView.ViewHolder {
        TextView tvNama;


        public PromoViewHoder(@NonNull View itemView) {
            super(itemView);

            tvNama = itemView.findViewById(R.id.tvNama);
        }

        public void bindData(final PromoModel item) {
            tvNama.setText(item.getJudulpromo());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }

    }
    public interface OnItemClickListener {
        void onItemClick(PromoModel item);
    }

}
