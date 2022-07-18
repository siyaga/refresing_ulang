package com.example.testproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnMoveActivity : Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)
        val btnMoveWithData : Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithData.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btn_move_activity -> {
                val moveIntet = Intent(this@MainActivity, MoveActiviy::class.java)
                startActivity(moveIntet)

            }
            R.id.btn_move_activity_data -> {
                val  moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Adi Riyanto Academy")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5)
                startActivity(moveWithDataIntent)
            }
        }
    }

}