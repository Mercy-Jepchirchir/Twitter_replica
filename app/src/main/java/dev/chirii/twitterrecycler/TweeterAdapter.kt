package dev.chirii.twitterrecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweeterAdapter (var tweeterList: List<Twetter>): RecyclerView.Adapter<TweeterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweeterViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_list_item,parent,false)
        return TweeterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweeterViewHolder, position: Int) {
        var currentTweeter = tweeterList.get(position)
        holder.tvName.text = currentTweeter.name
        holder.tvHandle.text = currentTweeter.handle
        holder.tvTweet.text = currentTweeter.tweet
        holder.tvTweetCounts.text = currentTweeter.tweetCount.toString()
        holder.tvreweet.text = currentTweeter.retweetCount.toString()
        holder.tvLike.text = currentTweeter.likeCount.toString()


    }

    override fun getItemCount(): Int {
        return tweeterList.size
    }
}
class TweeterViewHolder(itemView: View):  RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle = itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTweet = itemView.findViewById<TextView>(R.id.tvTweet)
    var imgtweets = itemView.findViewById<ImageView>(R.id.imgtweets)
    var imglady = itemView.findViewById<ImageView>(R.id.imglady)
    var tvTweetCounts = itemView.findViewById<TextView>(R.id.tvTweetCounts)
    var imgretweets = itemView.findViewById<ImageView>(R.id.imgretweets)
    var tvreweet = itemView.findViewById<TextView>(R.id.tvreweet)
    var imglike = itemView.findViewById<ImageView>(R.id.imglike)
    var tvLike = itemView.findViewById<TextView >(R.id.tvLike)
    var imgArrow = itemView.findViewById<ImageView>(R.id.imgArrow)







}