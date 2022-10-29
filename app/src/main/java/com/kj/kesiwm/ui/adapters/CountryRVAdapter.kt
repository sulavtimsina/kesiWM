package com.kj.kesiwm.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kj.kesiwm.R
import com.kj.kesiwm.data.remote.model.RecyclerViewItem

class CountryRVAdapter(private val dataSet: Array<RecyclerViewItem>) :
    RecyclerView.Adapter<CountryRVAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNameRegion: TextView
        val tvCode: TextView
        val tvCapital: TextView

        init {
            // Define click listener for the ViewHolder's View.
            tvNameRegion = view.findViewById(R.id.tvName_region)
            tvCode = view.findViewById(R.id.tvCode)
            tvCapital = view.findViewById(R.id.tvCapital)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.row_item, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.tvNameRegion.text = dataSet[position].nameRegion
        viewHolder.tvCode.text = dataSet[position].code
        viewHolder.tvCapital.text = dataSet[position].capital
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}
