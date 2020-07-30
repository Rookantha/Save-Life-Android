package com.example.savelife;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class AbViewHolder extends RecyclerView.ViewHolder {

    TextView patientsId,patientsName,patientsAge,patientsAddress,patientsWard,patientsBed,patientsGuardian,patientsNurseNote;
    View view;


    public AbViewHolder(@NonNull View itemView) {
        super(itemView);
        patientsId=itemView.findViewById(R.id.view_id);
        patientsName=itemView.findViewById(R.id.view_name);
        patientsAge=itemView.findViewById(R.id.view_age);
        patientsAddress=itemView.findViewById(R.id.view_address);
        patientsWard=itemView.findViewById(R.id.view_ward);
        patientsBed=itemView.findViewById(R.id.view_bed);
        patientsGuardian=itemView.findViewById(R.id.view_guardian);
        patientsNurseNote=itemView.findViewById(R.id.view_nurseNote);

        view=itemView;
    }
}
