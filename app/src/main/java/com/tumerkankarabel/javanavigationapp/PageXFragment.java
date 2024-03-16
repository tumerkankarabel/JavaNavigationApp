package com.tumerkankarabel.javanavigationapp;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tumerkankarabel.javanavigationapp.databinding.FragmentPageXBinding;

public class PageXFragment extends Fragment {

    FragmentPageXBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        getActivity().getWindow().setStatusBarColor(getActivity().getColor(R.color.pageXColor));

        binding = FragmentPageXBinding.inflate(inflater, container, false);

        binding.buttonGoXtoY.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.pageXToYPassing);
        });

        OnBackPressedCallback backSpace = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {}
        };

        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(),backSpace);

        return binding.getRoot();
    }
}