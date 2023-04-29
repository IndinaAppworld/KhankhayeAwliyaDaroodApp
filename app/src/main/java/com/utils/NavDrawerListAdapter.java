package com.utils;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.fonts.CipherNormal;
import com.indapp.daroodapp.R;


import java.util.ArrayList;

public class NavDrawerListAdapter extends BaseAdapter {

	private Context context;
	private ArrayList<NavDrawerItem> navDrawerItems;

	public NavDrawerListAdapter(Context context,
                                ArrayList<NavDrawerItem> navDrawerItems) {
		this.context = context;
		this.navDrawerItems = navDrawerItems;
	}

	@Override
	public int getCount() {
		return navDrawerItems.size();
	}

	@Override
	public Object getItem(int position)
	{
		return navDrawerItems.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			LayoutInflater mInflater = (LayoutInflater) context
					.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
			convertView = mInflater.inflate(R.layout.drawer_list_item, null);
		}

		CipherNormal txtTitle = (CipherNormal) convertView.findViewById(R.id.title);
//		LinearLayout linearLayout=(LinearLayout)convertView.findViewById(R.id.layout);
//        ImageView icon=(ImageView)convertView.findViewById(R.id.icon);

		txtTitle.setText(navDrawerItems.get(position).title);
//        icon.setImageResource(navDrawerItems.get(position).icon);


		return convertView;
	}

}