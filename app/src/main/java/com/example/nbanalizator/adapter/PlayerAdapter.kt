package com.example.nbanalizator.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nbanalizator.R
import com.example.nbanalizator.model.Player

class PlayerAdapter (
    private val players: MutableList<Player>
) : RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>() {

    class PlayerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        return PlayerViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.player_card,
                parent,
                false,
                )
        )
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val player = players[position]
        holder.itemView.apply{

        }
    }

    override fun getItemCount(): Int {
        return players.size
    }


}