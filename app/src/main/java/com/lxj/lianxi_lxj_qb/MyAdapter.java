package com.lxj.lianxi_lxj_qb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 15-7-22.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> implements View.OnClickListener {



    private Context context;
    private List<String> list;
    public MyAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.text.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onClick(View view) {

    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView text;

        public ViewHolder(View itemView) {
            super(itemView);
            text = ((TextView) itemView.findViewById(R.id.item_text));
        }
    }
}
