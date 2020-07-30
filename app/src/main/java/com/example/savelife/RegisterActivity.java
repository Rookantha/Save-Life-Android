package com.example.savelife;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class RegisterActivity extends AppCompatActivity {
    private EditText userName;
    private EditText email;
    private EditText ward;
    private EditText psw;
    private Button btnRegister;
    private TextView loginUser;


    private DatabaseReference reference;
    private FirebaseAuth auth;

   // ProgressDialog progressDialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        userName=findViewById(R.id.et_user_name);
        email=findViewById(R.id.et_email);
        ward=findViewById(R.id.et_ward);
        psw=findViewById(R.id.et_passward);
        btnRegister=findViewById(R.id.btn_register);
        loginUser=findViewById(R.id.tv_login);


        reference= FirebaseDatabase.getInstance().getReference();
        auth=FirebaseAuth.getInstance();
        //progressDialog = new ProgressDialog(this);
        loginUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity( new Intent(RegisterActivity.this,MainActivity.class));
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtUserName=userName.getText().toString();
                String txtEmail=email.getText().toString();
                String txtWard=ward.getText().toString();
                String txtPsw=psw.getText().toString();

                if (TextUtils.isEmpty(txtUserName)|| TextUtils.isEmpty(txtEmail)
                        ||TextUtils.isEmpty(txtWard)||TextUtils.isEmpty(txtPsw)){
                    Toast.makeText(RegisterActivity.this,"Empty credentials !",Toast.LENGTH_SHORT).show();

                }else if (txtPsw.length()<6){
                    Toast.makeText(RegisterActivity.this,"Password too Short !",Toast.LENGTH_SHORT).show();

                }else {
                    registerUser(txtUserName,txtEmail,txtWard,txtPsw);
                }



            }
        });
    }

    private void registerUser(final String userName, final String email, final String ward, String psw) {

       // progressDialog.setMessage("Please wait");
        //progressDialog.show();

        auth.createUserWithEmailAndPassword(email,psw).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                HashMap <String,Object> map= new HashMap<>();
                map.put("name",userName);
                map.put("email",email);
                map.put("ward",ward);
               // map.put("psw",psw);
                map.put("id",auth.getCurrentUser().getUid());

                reference.child("Users").child(auth.getCurrentUser().getUid()).setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()){
                           // progressDialog.dismiss();
                            Toast.makeText(RegisterActivity.this,"Update profile for better ",Toast.LENGTH_SHORT).show();
                            Intent intent =new Intent(RegisterActivity.this,Doctors.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                            finish();
                        }

                    }
                });

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
               // progressDialog.dismiss();
                Toast.makeText(RegisterActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
