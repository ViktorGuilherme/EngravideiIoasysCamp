package br.com.ioasys.camp.engravideiioasyscamp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.ioasys.camp.engravideiioasyscamp.R
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_inicio.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onStart() {
        super.onStart()

        btnCardVacinas.setOnClickListener{
            val intent = Intent(
                this,
                VacinasActivity::class.java)

            startActivity(intent)
        }

        btnCardCheck.setOnClickListener{
            val intent = Intent(
                this,
                ChecklistActivity::class.java)

            startActivity(intent)
        }

    }
}
