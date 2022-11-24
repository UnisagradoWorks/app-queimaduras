package br.com.unisagrado.appqueimaduras.utils;

import android.content.Intent;
import android.view.View;

import br.com.unisagrado.appqueimaduras.activities.MainActivity;

public class AppUtils {

    public static void abrirHome(View view){
        Intent intent = new Intent(view.getContext(), MainActivity.class);
        view.getContext().startActivity(intent);
    }
}
