package kevoh3.listviewcustomadaptermvcmodel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class StudentAdapter extends ArrayAdapter<Student> {

    ArrayList<Student> arrayListStudent;
    Context mContext;

    public StudentAdapter(@NonNull Context context, ArrayList<Student> arrayListStudent) {
        super(context, R.layout.student_item, arrayListStudent);
        this.arrayListStudent = arrayListStudent;
        this.mContext = context;
    }

    public static class ViewHolder{
        TextView tvName;
        TextView tvClass;
        ImageView ivImage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Student student = getItem(position);
        ViewHolder viewHolder = new ViewHolder();

        if (convertView==null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.student_item, parent,false);
            viewHolder.tvName = convertView.findViewById(R.id.textViewName);
            viewHolder.tvClass = convertView.findViewById(R.id.textViewClass);
            viewHolder.ivImage = convertView.findViewById(R.id.imageViewImage);
            convertView.setTag(viewHolder);
        }else {
            convertView.getTag();
        }

        viewHolder.tvName.setText(student.getName());
        viewHolder.tvClass.setText(student.getStudent_class());
        viewHolder.ivImage.setImageResource(Integer.parseInt(student.getImage()));

        return  convertView;
    }
}
