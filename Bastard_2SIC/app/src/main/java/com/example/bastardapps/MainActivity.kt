package com.example.bastardapps

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bastardapps.databinding.ActivityMainBinding
import com.example.bastardapps.databinding.ActivityThirdBinding
import com.example.bastardapps.pertemuan_2.SecondActivity
import com.example.bastardapps.pertemuan_3.ThirdResultAcitivity
import com.example.bastardapps.pertemuan_4.FourthActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import androidx.core.content.edit

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val sharedPref = getSharedPreferences("session_user", MODE_PRIVATE)
        binding.btnLogout.setOnClickListener{
        MaterialAlertDialogBuilder(this)
            .setTitle("Konfirmasi")
            .setMessage("Apakah Anda yakin ingin melanjutkan?")
            .setPositiveButton("Ya") { dialog, _ ->
                sharedPref.edit {
                    clear()
                }
                val i = Intent(this, AuthActivity::class.java)
                startActivity(i)
                finish()
                dialog.dismiss()

                val intent = Intent(this, AuthActivity::class.java)

                Log.e("Info Dialog", "Anda memilih Ya!")
            }
            .setNegativeButton("Batal") { dialog, _ ->
                dialog.dismiss()
                Log.e("Info Dialog", "Anda memilih Tidak!")
            }
            .show()
        }
    }
}