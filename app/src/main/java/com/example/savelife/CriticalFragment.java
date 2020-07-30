package com.example.savelife;

import android.content.Intent;
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

public class CriticalFragment extends Fragment {
    private View CriticalView;
    private RecyclerView recyclerViewCritical;
    private DatabaseReference reference;
    private FirebaseRecyclerOptions<PatientsDetails> options;
    private FirebaseRecyclerAdapter<PatientsDetails, AbViewHolder> adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            CriticalView= inflater.inflate(R.layout.fragment_critical,container,false);

        reference= FirebaseDatabase.getInstance().getReference().child("Patients");
        recyclerViewCritical=CriticalView.findViewById(R.id.recyclerView_critical);
        recyclerViewCritical.setHasFixedSize(true);
        recyclerViewCritical.setLayoutManager(new LinearLayoutManager(getContext()));
            return CriticalView;

    }

    @Override
    public void onStart() {
        super.onStart();
        options =new FirebaseRecyclerOptions.Builder<PatientsDetails>().setQuery(reference,PatientsDetails.class).build();
        adapter=new FirebaseRecyclerAdapter<PatientsDetails, AbViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull AbViewHolder holder, int position, @NonNull PatientsDetails model) {

                final String key=getRef(position).getKey();
                holder.view.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       Intent intent=new Intent(getContext(),UpdateProfileDoc.class);
                       intent.putExtra("key",key);
                       startActivity(intent);

                   }
               });

                holder.patientsId.setText("Patients ID:"+model.getId());
                holder.patientsName.setText(model.getName());
               // holder.patientsAge.setText("Patients ID:"+model.getAge());
                //holder.patientsAddress.setText(model.getAddress());
                holder.patientsWard.setText("Patients Ward:"+model.getWard());
                holder.patientsBed.setText("Patients Bed"+model.getBed());
                //holder.patientsGuardian.setText(model.getGuardian());
                //holder.patientsNurseNote.setText(model.getNurseNote());

            }

            @NonNull
            @Override
            public AbViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v =LayoutInflater.from(parent.getContext()).inflate(R.layout.patients_details_layout,parent,false);
                return new AbViewHolder(v);
            }
        };
        adapter.startListening();
        recyclerViewCritical.setAdapter(adapter);
    }
}
