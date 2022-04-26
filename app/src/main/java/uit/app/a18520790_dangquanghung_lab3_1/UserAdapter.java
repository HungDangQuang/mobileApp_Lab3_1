package uit.app.a18520790_dangquanghung_lab3_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter(Context context,ArrayList<User> users){
        super(context,0,users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        User user = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user,parent,false);
        }
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvHome = (TextView) convertView.findViewById(R.id.tVHome);

        tvName.setText(user.name);
        tvHome.setText(" from " + user.country);

        return convertView;
    }
}
