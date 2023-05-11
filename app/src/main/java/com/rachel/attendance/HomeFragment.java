package com.rachel.attendance;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rachel.attendance.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment implements FragmentInterface {
   private FragmentHomeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public String getFragmentTitle() {
        return "My Classes"; // Return the desired title for HomeFragment
    }
}
