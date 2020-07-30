package com.example.savelife;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.savelife.Model.PatientsDetails;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class AbnormalFragment extends Fragment {
    private View AbnormalView;
    private RecyclerView recyclerViewAbnormal;
    private DatabaseReference reference;
    private FirebaseRecyclerOptions<PatientsDetails> options;
    private FirebaseRecyclerAdapter<PatientsDetails,AbViewHolder> adapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         AbnormalView=inflater.inflate(R.layout.fragment_abnormal,container,false);

         reference= FirebaseDatabase.getInstance().getReference().child("Patients");
         recyclerViewAbnormal=AbnormalView.findViewById(R.id.recyclerView_abnormal);
         recyclerViewAbnormal.setHasFixedSize(true);
         recyclerViewAbnormal.setLayoutManager(new LinearLayoutManager(getContext()));

         return AbnormalView;
    }

    @Override
    public void onStart() {
        super.onStart();
        options =new FirebaseRecyclerOptions.Builder<PatientsDetails>().setQuery(reference,PatientsDetails.class).build();
        adapter=new FirebaseRecyclerAdapter<PatientsDetails, AbViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull AbViewHolder holder, int position, @NonNull PatientsDetails model) {
                holder.patientsId.setText("Patients ID:"+model.getId());
                holder.patientsName.setText(model.getName());
                holder.patientsWard.setText("Ward No:"+model.getWard());
                holder.patientsBed.setText("Bed No:"+model.getBed());

            }

            @NonNull
            @Override
            public AbViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v =LayoutInflater.from(parent.getContext()).inflate(R.layout.patients_details_layout,parent,false);
                return new AbViewHolder(v);
            }
        };
        adapter.startListening();
        recyclerViewAbnormal.setAdapter(adapter);
    }
}
