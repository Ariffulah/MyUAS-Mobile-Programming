package com.Arif.myuas.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.Arif.myuas.Model.CatatanModel
import com.Arif.myuas.R

class CatatanAdapter (
    val catatans: ArrayList<CatatanModel.Data>
): RecyclerView.Adapter<CatatanAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.absenlist, parent, false)
    )

    override fun onBindViewHolder(holder: CatatanAdapter.ViewHolder, position: Int) {
        val data = catatans[position]
        holder.textNama.text = data.nama
        holder.textHarga.text = data.harga.toString()
        holder.textWarna.text = data.warna
    }

    override fun getItemCount() = catatans.size

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val textNama = view.findViewById<TextView>(R.id.textnama)
        val textHarga = view.findViewById<TextView>(R.id.textharga)
        val textWarna = view.findViewById<TextView>(R.id.textwarna)
    }

    public fun setData(data: List<CatatanModel.Data>){
        catatans.clear()
        catatans.addAll(data)
        notifyDataSetChanged()
    }

}