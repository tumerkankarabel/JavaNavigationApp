package com.tumerkankarabel.javanavigationapp;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tumerkankarabel.javanavigationapp.databinding.FragmentPageBBinding;


public class PageBFragment extends Fragment {

    FragmentPageBBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        getActivity().getWindow().setStatusBarColor(getActivity().getColor(R.color.pageBColor));

        binding = FragmentPageBBinding.inflate(inflater, container, false);

        binding.buttonGoY.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.pageBToYPassing);
        });

        OnBackPressedCallback backSpace = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {}
        };

        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(),backSpace);

        return binding.getRoot();
    }
}