package com.example.savelife;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UpdateProfileDoc extends AppCompatActivity {
    TextView textViewId,textViewName,textViewAge,textViewAddress,textViewWard,textViewBed,textViewGuardian,textViewNurseNote;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile_doc);
            textViewId=findViewById(R.id.view_id);
            textViewName=findViewById(R.id.view_name);
            textViewAge=findViewById(R.id.view_age);
            textViewAddress=findViewById(R.id.view_address);
            textViewWard=findViewById(R.id.view_ward);
            textViewBed=findViewById(R.id.view_bed);
            textViewGuardian=findViewById(R.id.view_guardian);
            textViewNurseNote=findViewById(R.id.view_nurseNote);
            reference= FirebaseDatabase.getInstance().getReference().child("Patients");

        String key=getIntent().getStringExtra("key");

        reference.child(key).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Object object=dataSnapshot.child("id").getValue();
                String name=dataSnapshot.child("name").getValue().toString();
                String age=dataSnapshot.child("age").getValue().toString();
                String address=dataSnapshot.child("address").getValue().toString();
                String ward=dataSnapshot.child("ward").getValue().toString();
                String bed=dataSnapshot.child("bed").getValue().toString();
                String guardian=dataSnapshot.child("guardian").getValue().toString();
                String nurseNote=dataSnapshot.child("nurseNote").getValue().toString();


                textViewId.setText(""+object);
                textViewName.setText(name);
                textViewAge.setText(age);
                textViewAddress.setText(address);
                textViewWard.setText(ward);
                textViewBed.setText(bed);
                textViewGuardian.setText(guardian);
                textViewNurseNote.setText(nurseNote);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });




    }
}
