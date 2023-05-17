package com.rachel.attendance.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rachel.attendance.HomeFragment;
import com.rachel.attendance.Models.SubjectModel;
import com.rachel.attendance.R;

import java.util.ArrayList;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.ViewHolder> {

    Context context;
    ArrayList<SubjectModel>list;

    public SubjectAdapter(Context context, ArrayList<SubjectModel> list, HomeFragment homeFragment) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public SubjectAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.subject_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectAdapter.ViewHolder holder, int position) {
        final SubjectModel s = list.get(position);
        holder.title.setText(s.getTitle());
        holder.time.setText(s.getTime());
        holder.topic.setText(s.getTopic());
        holder.singBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView topic;
        TextView title;
        TextView time;
        Button singBtn;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView13);
            topic = itemView.findViewById(R.id.textView14);
            time = itemView.findViewById(R.id.textView15);
            singBtn = itemView.findViewById(R.id.sign_in_btn);
        }
    }
}
