package com.example.ware

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ware.adapters.WareAdapter
import com.example.ware.data.Repository
import com.example.ware.models.WareDataClass

class Readlist : AppCompatActivity() {

    private lateinit var rvReadlist: RecyclerView
    private lateinit var wareAdapter: WareAdapter
    private lateinit var wareItems: ArrayList<WareDataClass>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_readlist)


        val btnProfile: ImageButton = findViewById(R.id.btn_profile)

        btnProfile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        val btnWatchlist: ImageButton = findViewById(R.id.btn_watchlist)

        btnWatchlist.setOnClickListener {
            val intent = Intent(this, Watchlist::class.java)
            startActivity(intent)
        }

        val btnHome: ImageButton = findViewById(R.id.btn_home)

        btnHome.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

        rvReadlist = findViewById(R.id.watchlist_rvp)

        rvReadlist.layoutManager = LinearLayoutManager(this)

        wareItems = Repository.getWareItemsFromReadlist()

        wareAdapter = WareAdapter(wareItems)
        rvReadlist.adapter = wareAdapter

    }
}