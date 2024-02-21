package com.example.sweetalertdialogbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.pedant.SweetAlert.SweetAlertDialog
import com.example.sweetalertdialogbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Success SweetAlert")
                .setContentText("This is Success SweetAlertDialog Box")
                .show()
        }
        binding.btn2.setOnClickListener {
            SweetAlertDialog(this , SweetAlertDialog.ERROR_TYPE)
                .setTitleText("Error SweetAlert")
                .setContentText("This is Error SweetAlertDialog Box")
                .show()

        }
        binding.btn3.setOnClickListener {
            SweetAlertDialog(this , SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Warning SweetAlert")
                .setContentText("This is Warning SweetAlertDialog kBox")
                .show()

        }

    }
}