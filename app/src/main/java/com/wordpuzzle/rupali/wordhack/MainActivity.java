package com.wordpuzzle.rupali.wordhack;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView editProfile;
    Dialog editProfileDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editProfile=findViewById(R.id.profile);
        editProfileDialog=new Dialog(this);
        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profileImageClick();
            }
        });
    }

    private void profileImageClick() {
        ImageView back_button;
        Button continue_button;
        final ImageView profile;
        RecyclerView profileRecycler;
        editProfileDialog.setContentView(R.layout.edit_profile_popup);
        back_button=editProfileDialog.findViewById(R.id.back_button);
        continue_button=editProfileDialog.findViewById(R.id.continue_button);
        profile=editProfileDialog.findViewById(R.id.profile_image);
        profileRecycler=editProfileDialog.findViewById(R.id.profile_recycler);
        final ArrayList<Integer> imageIds=new ArrayList<>();
        imageIds.add(R.drawable.profile1);
        imageIds.add(R.drawable.profile2);
        imageIds.add(R.drawable.profile3);
        imageIds.add(R.drawable.profile4);
        imageIds.add(R.drawable.profile5);
        imageIds.add(R.drawable.profile6);
        imageIds.add(R.drawable.profile7);
        imageIds.add(R.drawable.profile8);
        imageIds.add(R.drawable.profile9);
        imageIds.add(R.drawable.profile10);
        imageIds.add(R.drawable.profile11);
        imageIds.add(R.drawable.profile12);
        imageIds.add(R.drawable.profile13);
        imageIds.add(R.drawable.profile14);
        imageIds.add(R.drawable.profile15);
        imageIds.add(R.drawable.profile16);
        imageIds.add(R.drawable.profile17);
        imageIds.add(R.drawable.profile18);
        imageIds.add(R.drawable.profile19);
        imageIds.add(R.drawable.profile20);
        imageIds.add(R.drawable.profile21);
        imageIds.add(R.drawable.profile22);
        imageIds.add(R.drawable.profile23);
        imageIds.add(R.drawable.profile24);
        imageIds.add(R.drawable.profile25);
        ProfileAdapter profileAdapter=new ProfileAdapter(this, imageIds, new ProfileAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                profile.setImageResource(imageIds.get(position));
            }
        });
        profileRecycler.setAdapter(profileAdapter);
        profileRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editProfileDialog.dismiss();
            }
        });
        editProfileDialog.show();

    }

}
