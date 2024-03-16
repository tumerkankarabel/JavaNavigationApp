package com.tumerkankarabel.javanavigationapp;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.snackbar.Snackbar;
import com.tumerkankarabel.javanavigationapp.databinding.FragmentPageYBinding;

public class PageYFragment extends Fragment {

    FragmentPageYBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Changing statusbar color in the fragment
        getActivity().getWindow().setStatusBarColor(getActivity().getColor(R.color.pageYColor));

        binding = FragmentPageYBinding.inflate(inflater, container, false);

        OnBackPressedCallback backSpace = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                //setEnabled(false);
                Navigation.findNavController(binding.textViewPageY).navigate(R.id.pageYToHomePagePassing);
            }
        };

        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(),backSpace);

        return binding.getRoot();
    }
}