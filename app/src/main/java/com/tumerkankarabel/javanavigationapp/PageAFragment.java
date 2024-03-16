package com.tumerkankarabel.javanavigationapp;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tumerkankarabel.javanavigationapp.databinding.FragmentPageABinding;

public class PageAFragment extends Fragment {

    FragmentPageABinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        getActivity().getWindow().setStatusBarColor(getActivity().getColor(R.color.pageAColor));

        binding = FragmentPageABinding.inflate(inflater, container, false);

        binding.buttonGoB.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.pageAToBPassing);
        });

        OnBackPressedCallback backSpace = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {}
        };

        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(),backSpace);

        return binding.getRoot();
    }
}