package com.youssefsapplication.app.modules.enseignant.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.youssefsapplication.app.R
import com.youssefsapplication.app.databinding.RowEnseignantBinding
import com.youssefsapplication.app.modules.enseignant.`data`.model.EnseignantRowModel
import kotlin.Int
import kotlin.collections.List

class EnseignantAdapter(
  var list: List<EnseignantRowModel>
) : RecyclerView.Adapter<EnseignantAdapter.RowEnseignantVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEnseignantVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_enseignant,parent,false)
    return RowEnseignantVH(view)
  }

  override fun onBindViewHolder(holder: RowEnseignantVH, position: Int) {
    val enseignantRowModel = EnseignantRowModel()
    // TODO uncomment following line after integration with data source
    // val enseignantRowModel = list[position]
    holder.binding.enseignantRowModel = enseignantRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EnseignantRowModel>) {
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
      item: EnseignantRowModel
    ) {
    }
  }

  inner class RowEnseignantVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowEnseignantBinding = RowEnseignantBinding.bind(itemView)
  }
}
