package com.hasanakcay.photoshareapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hasanakcay.photoshareapp.R
import com.hasanakcay.photoshareapp.model.Post
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.recycler_row.view.*

class FeedRecyclerAdapter (val postListesi : ArrayList<Post>) : RecyclerView.Adapter<FeedRecyclerAdapter.PostHolder>() {

    class PostHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_row,parent,false)
        return PostHolder(view)
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        holder.itemView.recycler_row_kullanici_email.text = postListesi[position].kullaniciEmail
        holder.itemView.recycler_row_comment_text.text = postListesi[position].kullaniciYorum
        Picasso.get().load(postListesi[position].gorselUrl).into(holder.itemView.recycler_row_imageview)
    }

    override fun getItemCount(): Int {
        return postListesi.size
    }
}