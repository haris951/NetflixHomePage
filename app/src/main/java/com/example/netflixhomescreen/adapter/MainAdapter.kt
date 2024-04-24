package com.example.netflixhomescreen.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.netflixhomescreen.R
import com.example.netflixhomescreen.databinding.ParentItemBinding
import com.example.netflixhomescreen.model.MainModel

class MainAdapter(private val collection:List<MainModel>):RecyclerView.Adapter<MainAdapter.CollectionViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.parent_item,parent,false)
        return CollectionViewHolder(view)
    }

    override fun getItemCount()=collection.size


    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        holder.binding.apply {
            val collection=collection[position]
            tvGenreMovie.text=collection.title
            val movieAdapter=MovieAdapter(collection.movieModels)
            rvMovieChild.adapter=movieAdapter
        }

    }
    inner class CollectionViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val binding = ParentItemBinding.bind(itemView)

    }
}