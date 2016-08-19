package com.onegmail.sedrick.a1_l3_h;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by ОБИ on 19.08.2016.
 */
public class DataPickFragment extends AppCompatDialogFragment implements DatePickerDialog.OnDateSetListener{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH);
        int day=c.get(Calendar.DAY_OF_MONTH);
        return  new DatePickerDialog(getActivity(),this,year,month,day);
    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
       Date date=new Date(i,i1,i2);
        Date my_both=new Date(1992-1900,12,28);

        long d1= date.getTime();
        long d2=my_both.getTime();

        long w;
        if (d1<d2) Toast.makeText(getActivity().getApplicationContext(),"Я старше тебя",Toast.LENGTH_SHORT).show();
        Toast.makeText(getActivity().getApplicationContext(),"Я старше тебя",Toast.LENGTH_SHORT).show();;

    }

}
