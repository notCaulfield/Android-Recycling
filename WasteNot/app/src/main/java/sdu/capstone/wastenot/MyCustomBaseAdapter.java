package sdu.capstone.wastenot;


import java.util.ArrayList;

//import com.publicstaticdroidmain.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyCustomBaseAdapter extends BaseAdapter {
    private static ArrayList<Center> searchArrayList;

    private LayoutInflater mInflater;

    public MyCustomBaseAdapter(Context context, ArrayList<Center> results) {
        searchArrayList = results;
        mInflater = LayoutInflater.from(context);
        System.out.println(searchArrayList);
    }

    public int getCount() {
        return searchArrayList.size();
    }

    public Object getItem(int position) {
        return searchArrayList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_view, null);
            holder = new ViewHolder();
            holder.txtName = (TextView) convertView.findViewById(R.id.name);
            holder.txtAddress = (TextView) convertView
                    .findViewById(R.id.address);
            holder.txtPhone = (TextView) convertView.findViewById(R.id.phone);
            //holder.txtWebsite = (TextView) convertView.findViewById(R.id.website);
           //holder.txtEmail = (TextView) convertView.findViewById(R.id.email);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtName.setText(searchArrayList.get(position).getName());
        holder.txtAddress.setText(searchArrayList.get(position)
                .getAddress());
        holder.txtPhone.setText(searchArrayList.get(position).getPhone());
        //holder.txtWebsite.setText(searchArrayList.get(position).getWebsite());
        //holder.txtEmail.setText(searchArrayList.get(position).getEmail());
        return convertView;
    }

    static class ViewHolder {
        TextView txtName;
        TextView txtAddress;
        TextView txtPhone;
       //TextView txtWebsite;
        //TextView txtEmail;
    }
}