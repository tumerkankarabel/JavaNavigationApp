package com.tumerkankarabel.javanavigationapp;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tumerkankarabel.javanavigationapp.databinding.FragmentHomepageBinding;

public class HomepageFragment extends Fragment {

    private FragmentHomepageBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Changing status bar color in the fragment
        getActivity().getWindow().setStatusBarColor(getActivity().getColor(R.color.homePageColor));

        binding = FragmentHomepageBinding.inflate(inflater, container, false);

        binding.buttonGoA.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.homapageToPageAPassing);
        });

        binding.buttonGoX.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.homepageToPageXPassing);
        });

        OnBackPressedCallback backSpace = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {}
        };

        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(),backSpace);

        return binding.getRoot();
    }
}