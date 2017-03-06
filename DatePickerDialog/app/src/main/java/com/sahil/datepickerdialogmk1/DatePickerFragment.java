package com.sahil.datepickerdialogmk1;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by sahil on 08-Jul-16.
 */

public class DatePickerFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    public void onDateSet(DatePicker view, int year, int month, int day) {
        // Do something with the date chosen by the user

        Date date = new Date();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        try {
            //Below i have done month+1 because dont know why datepicker is returning value that is one month less.
            date = format.parse(Integer.toString(day)+"/"+Integer.toString(month+1)+"/"+Integer.toString(year));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        getActivity().setContentView(R.layout.activity_main);
        TextView textView = (TextView) getActivity().findViewById(R.id.text);
        textView.setText(format.format(date));

    }
}