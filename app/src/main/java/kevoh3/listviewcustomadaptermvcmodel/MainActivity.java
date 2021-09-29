package kevoh3.listviewcustomadaptermvcmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvStudents;
    ArrayList<Student> studentArrayList = new ArrayList<Student>();
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvStudents = findViewById(R.id.listViewStudents);

        student = new Student();
        student.setName("Joe Doe");
        student.setStudent_class("2MPSE");
        student.setImage(String.valueOf(R.drawable.ic_baseline_person_72));
        studentArrayList.add(student);

        student = new Student();
        student.setName("Jane Doe");
        student.setStudent_class("1MPSE");
        student.setImage(String.valueOf(R.drawable.ic_baseline_person_72));
        studentArrayList.add(student);

        StudentAdapter adapter = new StudentAdapter(MainActivity.this,studentArrayList);
        lvStudents.setAdapter(adapter);

    }
}