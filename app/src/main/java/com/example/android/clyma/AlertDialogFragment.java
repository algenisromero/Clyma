package com.example.android.clyma;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;


public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setTitle("Oops Sorry!")
            .setMessage("There was and error, try again!")
            .setPositiveButton("Ok", null);

        return builder.create();
    }
}