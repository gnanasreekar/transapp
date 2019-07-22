package in.vvitguntur.transapp;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;

public class details extends AppCompatActivity {

    @BindView(R.id.user_name_id)
    TextInputEditText userNameId;
    @BindView(R.id.user_aadhar_id)
    TextInputEditText userAadharId;
    @BindView(R.id.user_gmail_id)
    TextInputEditText userGmailId;
    @BindView(R.id.user_address_id)
    TextInputEditText userAddressId;
    @BindView(R.id.user_mobile_id)
    TextInputEditText userMobileId;
    @BindView(R.id.user_dob)
    TextInputEditText userDob;
    @BindView(R.id.user_driving)
    TextInputEditText userDriving;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);

    }

    public void submit(View view) {
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("Feedback");
        databaseReference.child("Name").setValue(edit.getText().toString());
        databaseReference.child("Email").setValue(edit2.getText().toString());
        databaseReference.child("Feedback").setValue(edit3.getText().toString());
        Toast.makeText(this, "ThankYou For the feedback", Toast.LENGTH_SHORT).show();
    }
}
