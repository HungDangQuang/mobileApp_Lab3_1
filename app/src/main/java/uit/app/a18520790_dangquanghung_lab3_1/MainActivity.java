package uit.app.a18520790_dangquanghung_lab3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.simpleListView);

        User Harry = new User("Harry","San Diego");
        User Marla = new User("Marla","San Francisco");
        User Sarah = new User("Sarah","San Marco");

        ArrayList<User> arrayofUsers = new ArrayList<User>();
        arrayofUsers.add(Harry);
        arrayofUsers.add(Marla);
        arrayofUsers.add(Sarah);

        UserAdapter adapter = new UserAdapter(this,arrayofUsers);
        listView.setAdapter(adapter);
    }
}