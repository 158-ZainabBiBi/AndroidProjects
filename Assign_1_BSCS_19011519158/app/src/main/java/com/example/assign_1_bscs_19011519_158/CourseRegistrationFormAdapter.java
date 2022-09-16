package com.example.assign_1_bscs_19011519_158;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class CourseRegistrationFormAdapter extends RecyclerView.Adapter<CourseRegistrationFormAdapter.MyViewHolder> {

    public List<CourseRegistrationForm> courseRegistrationFormList = new ArrayList<>();

    public List<CourseRegistrationForm> getCourseRegistrationList() {
        return courseRegistrationFormList;
    }

    public void setCourseRegistrationFormList(List<CourseRegistrationForm> courseRegistrationFormList) {
        this.courseRegistrationFormList = courseRegistrationFormList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.courseregistration_layout,parent,false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvNAME.setText(courseRegistrationFormList.get(position).getSTUDENT_NAME());
        holder.tvROLLNO.setText(courseRegistrationFormList.get(position).getSTUDENT_ROLLNO());
        holder.tvDate.setText(courseRegistrationFormList.get(position).getSTUDENT_DATE());
    }

    @Override
    public int getItemCount() {
        return courseRegistrationFormList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvNAME;
        TextView tvROLLNO;
        TextView tvDate;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNAME = itemView.findViewById(R.id.studentname);
            tvROLLNO = itemView.findViewById(R.id.studentrollno);
            tvDate = itemView.findViewById(R.id.studentdate);
        }
    }

}
