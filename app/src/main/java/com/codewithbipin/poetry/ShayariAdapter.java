package com.codewithbipin.poetry;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShayariAdapter  extends RecyclerView.Adapter<ShayariAdapter.ShayariViewHolder> {

    private Context context;
    private ArrayList<ShayariData> list;

    ClipboardManager clipboardManager;

    public ShayariAdapter(Context context, ArrayList<ShayariData> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ShayariViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new ShayariViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShayariViewHolder holder, int position) {

        holder.textView.setText(list.get(position).getText());
        setAnimation(holder.itemView);

        holder.whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent whatsappShare = new Intent(Intent.ACTION_SEND);
                    whatsappShare.setType("text/plane");
                    whatsappShare.setPackage("com.whatsapp");
                    whatsappShare.putExtra(Intent.EXTRA_TEXT, list.get(position).getText());
                    context.startActivity(whatsappShare);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent share = new Intent(Intent.ACTION_SEND);
                    share.setType("text/plane");
                    share.putExtra(Intent.EXTRA_TEXT, list.get(position).getText());
                    context.startActivity(share);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        holder.copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData data = (ClipData) ClipData.newPlainText("text",list.get(position).getText());
                clipboardManager.setPrimaryClip(data);

                Toast.makeText(context, "Text Copied!", Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void setAnimation(View view){
        Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
        view.setAnimation(animation);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ShayariViewHolder extends RecyclerView.ViewHolder {

        private ImageView whatsapp,share,copy;
        private TextView textView;

        public ShayariViewHolder(@NonNull View itemView) {
            super(itemView);

            whatsapp = itemView.findViewById(R.id.whatsapp);
            share = itemView.findViewById(R.id.share);
            copy = itemView.findViewById(R.id.copy);
            textView = itemView.findViewById(R.id.text);
        }
    }
}
