package com.example.mashreghi.rad.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.mashreghi.rad.R;
import com.example.mashreghi.rad.model.Student;


import java.util.ArrayList;

public class MyAdapterName extends RecyclerView.Adapter<MyAdapterName.ViewHolder> {

    ViewHolder viewHolder;
    Context context;
    ArrayList<Student> student;
    LayoutInflater layoutInflater,layoutInflater1;
    EditText edtnamexml;// = myvView1.findViewById(R.id.edtname);
    EditText edtfamilyxml;// = myvView1.findViewById(R.id.edtfamily);
    EditText edtphonexml;// = myvView1.findViewById(R.id.edtphone);

    public MyAdapterName(Context context, ArrayList<Student> student,EditText edtnamexml,EditText edtfamilyxml,EditText edtphonexml) {
        this.context = context;
        this.student = student;
        this.edtnamexml = edtnamexml;
        this.edtfamilyxml = edtfamilyxml;
        this.edtphonexml = edtphonexml;
        layoutInflater1 = LayoutInflater.from(context);
        // myvView1 = layoutInflater1.inflate(R.layout.activity_main,null);

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = layoutInflater1.inflate(R.layout.item,null,false);

        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(lp);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        final  TextView tvName = holder.textView;
        final  TextView tvName1 = holder.textView1;
        final  TextView tvName2 = holder.textView2;
        CardView cdView = holder.cardView;
        ImageView imView = holder.imageView;
        ImageView imView2 = holder.imageView2;

       /* switch(position){
            case 0 :
                tvName.setText(context.getString(R.string.item1));break;
            case 1:
                tvName.setText(context.getString(R.string.item2));break;
            case 2:
                tvName.setText(context.getString(R.string.item3));break;
            case 3:
                tvName.setText(context.getString(R.string.item4));break;

        }*/

        final Student stu = student.get(position);
        tvName.setText(stu.getName());
        tvName1.setText(stu.getFamily());
        tvName2.setText(stu.getStunumber());
        cdView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, stu.getName() + "--" + position, Toast.LENGTH_SHORT).show();
            }
        });

        imView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                notifyItemRemoved(position);
                student.remove(position);




            }
        });

        imView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // EditText edtnamexml = (EditText) ((Activity)context).findViewById(R.id.edtname);
                // EditText edtfamilyxml = (EditText) ((Activity)context).findViewById(R.id.edtfamily);
                // EditText edtphonexml = (EditText) ((Activity)context).findViewById(R.id.edtphone);


                student.get(position).setName(edtnamexml.getText().toString()) ;
                student.get(position).setFamily(edtfamilyxml.getText().toString());
                student.get(position).setStunumber(edtphonexml.getText().toString());
                notifyItemChanged(position);

            }
        });





    }

    @Override
    public int getItemCount() {
        return student.size();
    }


    public  static  class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView, textView1,textView2;
        CardView cardView;
        ImageView imageView,imageView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textadapter);
            imageView = itemView.findViewById(R.id.im);
            imageView2 = itemView.findViewById(R.id.im2);
            textView1 = itemView.findViewById(R.id.textadapter1);
            textView2 = itemView.findViewById(R.id.textadapter2);
            cardView = itemView.findViewById(R.id.cardview);

        }
    }





}
