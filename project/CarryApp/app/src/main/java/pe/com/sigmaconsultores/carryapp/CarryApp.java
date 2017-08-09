package pe.com.sigmaconsultores.carryapp;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by rhurtado on 07/08/2017.
 */

public class CarryApp {

    private final String TAG = "CarryApp";

    private static CarryApp instance;

    private String currentUser;
    private String nameUser;

    public CarryApp() {
        this.currentUser="user1";
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public String getNameUser() {
        if(this.currentUser==null){
            return "Not valid user";
        }
        if(nameUser==null){
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference(this.currentUser);

            // Read from the database
            myRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    // This method is called once with the initial value and again
                    // whenever data at this location is updated.
                    String value = dataSnapshot.getValue(String.class);
                    Log.d(TAG, "Value is: " + value);
                }

                @Override
                public void onCancelled(DatabaseError error) {
                    // Failed to read value
                    Log.w(TAG, "Failed to read value.", error.toException());
                }

            });

        }
        return nameUser;
    }

    public void setNameUser(String nameCurrentUser) {
        this.nameUser = nameCurrentUser;
    }

    public static CarryApp getInstance(){
        if(instance ==null){
            instance =  new CarryApp();
        }
        return instance;
    }
}
