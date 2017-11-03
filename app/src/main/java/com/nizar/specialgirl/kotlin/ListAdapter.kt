package com.nizar.specialgirl.kotlin

import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.LinearLayout
import android.widget.TextView

import com.nizar.specialgirl.R

class ListAdapter(private val menu: List<String>) : BaseAdapter() {

    private var listAction: ListAction? = null

    interface ListAction {
        fun openMenu(menuName: String)
    }

    fun setOnListActionClicked(callback: ListAction) {
        this.listAction = callback
    }

    override fun getCount(): Int {
        // TODO Auto-generated method stub
        return menu.size
    }

    override fun getItem(position: Int): Any {
        // TODO Auto-generated method stub
        return menu[position]
    }

    override fun getItemId(position: Int): Long {
        // TODO Auto-generated method stub
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        // TODO Auto-generated method stub
        val holder: ViewHolder

        if (convertView == null) {
            convertView = View.inflate(parent.context, R.layout.row_list, null)
            holder = ViewHolder(convertView)
            convertView!!.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
        }

        val name = menu[position]
        holder.menuName.text = name
        holder.menu.setOnClickListener {
            // TODO Auto-generated method stub
            listAction!!.openMenu(name)
        }

        return convertView
    }

    internal inner class ViewHolder(v: View) {
        var menuName: TextView
        var menu: LinearLayout

        init {
            menuName = v.findViewById<View>(R.id.rowList_item) as TextView
            menu = v.findViewById<View>(R.id.rowList_btnMenu) as LinearLayout
        }
    }

}
