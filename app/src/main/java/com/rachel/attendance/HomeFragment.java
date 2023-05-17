package com.rachel.attendance;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rachel.attendance.Adapters.SubjectAdapter;
import com.rachel.attendance.Models.SubjectModel;
import com.rachel.attendance.databinding.FragmentHomeBinding;

import java.util.ArrayList;


public class HomeFragment extends Fragment implements FragmentInterface {
   private FragmentHomeBinding binding;
    RecyclerView subjectRec;
    ArrayList<SubjectModel> subjectModels;
    SubjectAdapter subjectAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        subjectRec = root.findViewById(R.id.upcoming_subjects);
        /// recyclerview
        subjectModels =new ArrayList<>();
        subjectModels.add(new SubjectModel( "Biology","Excretion and Homeostasis","10:00 -10:30 AM"));

        subjectAdapter = new SubjectAdapter(getActivity(), subjectModels, this);
        subjectRec.setAdapter(subjectAdapter);
        subjectRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL, false));
        subjectRec.setHasFixedSize(true);
        subjectRec.setNestedScrollingEnabled(false);
        return root;
    }

    @Override
    public String getFragmentTitle() {
        return "My Classes"; // Return the desired title for HomeFragment
    }
}
