package com.example.enwalletassessment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EnwalletAdapter(var enwalletList: List<Enwallet>):
    RecyclerView.Adapter<EnwalletViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EnwalletViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.enwallet_list,parent,false)
        return EnwalletViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: EnwalletViewHolder, position: Int) {
        val myEnwallet = enwalletList[position]
        holder.etSalary.text = myEnwallet.salary
        holder.etAmount.text = myEnwallet.amount
        holder.etDate.text = myEnwallet.date

    }

    override fun getItemCount(): Int {
        return enwalletList.size

    }

}

class EnwalletViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    var etSalary =itemView.findViewById<TextView>(R.id.etsalary)
    var etAmount =itemView.findViewById<TextView>(R.id.etAmount)
    var etDate =itemView.findViewById<TextView>(R.id.etDate)
}
