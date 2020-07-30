package com.example.savelife;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.savelife.Model.PatientsData;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class InsertFragment extends Fragment {
    EditText pID,pName,pAge,pAddress,pWard,pBed,pGuardian,pNurseNote;
    Button btnInsert;
    PatientsData pData;
    DatabaseReference reference;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_insert,container,false);

        pID=(EditText)view.findViewById(R.id.pID_text);
        pName=(EditText)view.findViewById(R.id.pName_text);
        pAge=(EditText)view.findViewById(R.id.pAge_text);
        pAddress=(EditText)view.findViewById(R.id.pAddress_text);
        pWard=(EditText)view.findViewById(R.id.pWard_text);
        pBed=(EditText)view.findViewById(R.id.pBed_text);
        pGuardian=(EditText)view.findViewById(R.id.pGuardian_text);
        pNurseNote=(EditText)view.findViewById(R.id.pNurseNote_text);
        btnInsert=(Button)view.findViewById(R.id.btnInsert);
        pData=new PatientsData();

        reference= FirebaseDatabase.getInstance().getReference().child("Patients");

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=Integer.parseInt(pID.getText().toString().trim());
                pData.setId(id);
                pData.setName(pName.getText().toString().trim());
                int age =Integer.parseInt(pAge.getText().toString().trim());
                pData.setAge(age);
                pData.setAddress(pAddress.getText().toString().trim());
                int ward =Integer.parseInt(pWard.getText().toString().trim());
                pData.setWard(ward);
                int bed=Integer.parseInt(pBed.getText().toString().trim());
                pData.setBed(bed);
                pData.setGuardian(pGuardian.getText().toString().trim());
                pData.setNurseNote(pNurseNote.getText().toString().trim());
                reference.push().setValue(pData);
                Toast.makeText(getActivity(), "Data Insert Sucessfully",Toast.LENGTH_LONG).show();

            }
        });

        return view;
    }
}
