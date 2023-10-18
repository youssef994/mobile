package com.youssefsapplication.app.modules.dashboardadmin.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.youssefsapplication.app.R
import com.youssefsapplication.app.databinding.RowGridcomputerBinding
import com.youssefsapplication.app.modules.dashboardadmin.`data`.model.GridcomputerRowModel
import kotlin.Int
import kotlin.collections.List

class GridcomputerAdapter(
  var list: List<GridcomputerRowModel>
) : RecyclerView.Adapter<GridcomputerAdapter.RowGridcomputerVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridcomputerVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridcomputer,parent,false)
    return RowGridcomputerVH(view)
  }

  override fun onBindViewHolder(holder: RowGridcomputerVH, position: Int) {
    val gridcomputerRowModel = GridcomputerRowModel()
    // TODO uncomment following line after integration with data source
    // val gridcomputerRowModel = list[position]
    holder.binding.gridcomputerRowModel = gridcomputerRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridcomputerRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: GridcomputerRowModel
    ) {
    }
  }

  inner class RowGridcomputerVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridcomputerBinding = RowGridcomputerBinding.bind(itemView)
  }
}
