package com.plcoding.doodlekong.ui.setup.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.plcoding.doodlekong.R
import com.plcoding.doodlekong.databinding.FragmentCreateRoomBinding
import com.plcoding.doodlekong.databinding.FragmentUsernameBinding

/**
 * Created by Abdallah Shehata on 11/19/2023.
 */
class CreateRoomFragment : Fragment(R.layout.fragment_create_room) {

    private var _binding: FragmentCreateRoomBinding? = null
    private val binding:FragmentCreateRoomBinding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentCreateRoomBinding.bind(view)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}