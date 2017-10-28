package com.nizar.specialgirl;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends BaseAdapter 
{
	private List<String> menu;
	
	private ListAction listAction;
	
	public interface ListAction
	{
		public void openMenu(String menuName);
	}
	
	public void setOnListActionClicked(ListAction callback)
	{
		this.listAction = callback;
	}
	
	public ListAdapter(List<String> listMenu) {
		this.menu = listMenu;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return menu.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return menu.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		final ViewHolder holder;

        if (convertView == null)
        {
			convertView = View.inflate(parent.getContext(), R.layout.row_list, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }
        
        final String name = menu.get(position);
        holder.menuName.setText(name);
        holder.menu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				listAction.openMenu(name);
			}
		});
        
        return convertView;
	}
	
	class ViewHolder
	{
		public TextView menuName; 
		public LinearLayout menu; 
		
		public ViewHolder(View v) {
			menuName = (TextView) v.findViewById(R.id.rowList_item);
			menu = (LinearLayout) v.findViewById(R.id.rowList_btnMenu);
		}
	}

}
