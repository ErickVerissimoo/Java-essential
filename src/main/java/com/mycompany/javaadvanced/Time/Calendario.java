/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaadvanced.Time;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.stream.Stream;

/**
 *
 * @author Erick
 */
public class Calendario {

    public static void main(String[] args) {
        Locale local = new Locale("pt_BR_#Latn");
        Calendar data = Calendar.getInstance(Locale.getDefault());
        
        System.out.println(data.getCalendarType());
        
        data.after(Calendar.getInstance());
        
        var e = local.getDisplayName();
        System.out.println(e);
        
        int mes = data.get(Calendar.MONTH);
        double outro = data.get(Calendar.AM);
        double d = data.get(Calendar.MINUTE);
        var med = data.getTime();
   
        System.out.println(d);
        System.out.println(mes);
        System.out.println(outro);
        
        Calendar instancea = Calendar.getInstance();
        String b = instancea.getCalendarType();
        var u = instancea.getTimeZone();
        System.out.println(u);
    }
}
