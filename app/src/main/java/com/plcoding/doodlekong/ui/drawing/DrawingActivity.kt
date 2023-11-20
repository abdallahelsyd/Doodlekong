package com.plcoding.doodlekong.ui.drawing

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.plcoding.doodlekong.databinding.ActivityDrawingBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by Abdallah Shehata on 11/20/2023.
 */
@AndroidEntryPoint
class DrawingActivity:AppCompatActivity() {
    private lateinit var binding:ActivityDrawingBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding=ActivityDrawingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}