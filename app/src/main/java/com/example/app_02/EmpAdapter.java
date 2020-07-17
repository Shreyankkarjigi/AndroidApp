package com.example.app_02;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public abstract class EmpAdapter extends RecyclerView.Adapter<EmpAdapter.EmpViewHolder> implements View.OnClickListener {
    private Context context;
    private Emp[] data;

    public EmpAdapter(Context context, Emp[] data) {
        this.context = context;
        this.data = data;
        int[] info;


    }

    @Override
    public EmpViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_user_layout, parent, false);
        return new EmpViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmpViewHolder holder, int position) {
        final Emp emp = data[position];
        holder.txtUser.setText(emp.getEmployeeName());
        holder.salUser.setText(emp.getEmployeeSalary());
        //Glide.with(holder.imgUser.getContext()).load(emp.getAvatarUrl()).into(holder.imgUser);
        holder.itemView.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
               // Toast.makeText(context, emp.getEmployeeName() + " was clicked", Toast.LENGTH_SHORT).show();
              Intent intent = new Intent(context, onclickactivity.class);
              intent.putExtra("Emp_name",emp.getEmployeeName());
              intent.putExtra("Emp_sal",emp.getEmployeeSalary());
              intent.putExtra("Emp_age",emp.getEmployeeAge());
              intent.putExtra("Emp_dob",emp.getDob());
              intent.putExtra("Emp_date",emp.getDate());
              intent.putExtra("Emp_phone",emp.getPhone());
              context.startActivity(intent);


            }

        });

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class EmpViewHolder extends RecyclerView.ViewHolder {
        ImageView imgUser;
        TextView txtUser;
        TextView salUser;

        public EmpViewHolder(@NonNull View itemView) {
            super(itemView);
            imgUser = (ImageView) itemView.findViewById(R.id.imgUser);
            txtUser = (TextView) itemView.findViewById(R.id.txtUser);
            salUser = (TextView) itemView.findViewById(R.id.salUser);


        }
    }


}