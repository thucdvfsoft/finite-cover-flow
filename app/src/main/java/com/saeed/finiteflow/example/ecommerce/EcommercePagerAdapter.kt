package com.saeed.finiteflow.example.ecommerce

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.saeed.finiteflow.example.R

class EcommercePagerAdapter : RecyclerView.Adapter<EcommercePagerAdapter.RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(viewType, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun getItemCount(): Int = 10

    override fun getItemViewType(position: Int): Int {
        return R.layout.circle_view
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class RecyclerViewHolder(val item: View) : RecyclerView.ViewHolder(item) {

        fun bind(position: Int) {
            val image = item.findViewById<ImageView>(R.id.image)

            when {
                position % 4 == 0 -> {
                    image.setImageDrawable(
                        ContextCompat.getDrawable(
                            image.context,
                            R.drawable.watch_4
                        )
                    )
                }
                position % 3 == 0 -> {
                    image.setImageDrawable(
                        ContextCompat.getDrawable(
                            image.context,
                            R.drawable.watch_3
                        )
                    )
                }
                position % 2 == 0 -> {
                    image.setImageDrawable(
                        ContextCompat.getDrawable(
                            image.context,
                            R.drawable.watch_2
                        )
                    )
                }
                position % 1 == 0 -> {
                    image.setImageDrawable(
                        ContextCompat.getDrawable(
                            image.context,
                            R.drawable.watch_1
                        )
                    )
                }
                else -> {
                    image.setImageDrawable(
                        ContextCompat.getDrawable(
                            image.context,
                            R.drawable.watch_4
                        )
                    )
                }
            }
        }

    }

}