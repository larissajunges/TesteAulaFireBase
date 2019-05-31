package br.ifsc.edu.br.testefirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database;
    private DatabaseReference reference;

    private EditText edNome, edApelido, dtNascimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = FirebaseDatabase.getInstance();
        reference = database.getReference();

        reference.child("teste").setValue("100");
        reference.child("usuarios").child("id").child("01").child("email").setValue("larissa@gmail.com");
        reference.child("usuarios").child("id").child("02").child("email").setValue("bruno@gamil.com");
        reference.child("usuarios").child("id").child("03").child("email").setValue("bianca@gmail.com");


            }
           public void salvarOnFireBase(View view){
          //  Usuario user = new Usuario(edNome.getText().toString()),edNome.getText().toString(),1.5);
           //  reference.child("usuario").push().setValue(user);
            }
}