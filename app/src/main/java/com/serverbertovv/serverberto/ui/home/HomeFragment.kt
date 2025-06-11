package com.ServerBertoVV.ServerBertoVV.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.ServerBertoVV.ServerBertoVV.R

class HomeFragment : Fragment() {

    private lateinit var webView: WebView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        webView = root.findViewById(R.id.webview)
        webView.webViewClient = WebViewClient() // Per aprire le pagine nel WebView e non nel browser
        webView.settings.javaScriptEnabled = true // Abilita JavaScript se il sito lo richiede
        webView.loadUrl("https://ServerBertoVV.github.io") // Carica il sito web

        return root
    }
}
