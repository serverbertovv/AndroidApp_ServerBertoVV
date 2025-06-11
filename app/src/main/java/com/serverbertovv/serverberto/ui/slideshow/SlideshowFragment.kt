package com.ServerBertoVV.ServerBertoVV.ui.slideshow

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.ServerBertoVV.ServerBertoVV.R

class SlideshowFragment : Fragment() {

    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    private fun loadIconAndSetClick(
        root: View,
        viewId: Int,
        iconUrl: String,
        targetUrl: String
    ) {
        val imageView = root.findViewById<ImageView>(viewId)
        Glide.with(this).load(iconUrl).into(imageView)
        imageView.setOnClickListener { openUrl(targetUrl) }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_slideshow, container, false)

        loadIconAndSetClick(root, R.id.siteLink, "https://cdn-icons-png.flaticon.com/512/841/841364.png", "https://serverbertovv.github.io")
        loadIconAndSetClick(root, R.id.instagramLink, "https://cdn-icons-png.flaticon.com/512/2111/2111463.png", "https://instagram.com/serverbertovv")
        loadIconAndSetClick(root, R.id.youtubeLink, "https://cdn-icons-png.flaticon.com/512/1384/1384060.png", "https://youtube.com/@serverbertovv")
        loadIconAndSetClick(root, R.id.discordLink, "https://cdn-icons-png.flaticon.com/512/5968/5968756.png", "https://discord.gg/3JqDxxdG6Z")
        loadIconAndSetClick(root, R.id.githubLink, "https://cdn-icons-png.flaticon.com/512/25/25231.png", "https://github.com/serverbertovv")

        return root
    }
}
