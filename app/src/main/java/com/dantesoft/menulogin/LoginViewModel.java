package com.dantesoft.menulogin;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class LoginViewModel extends AndroidViewModel {

    private Context context;
    public LoginViewModel(@NonNull Application application) {
        super(application);
        this.context = application.getApplicationContext();
    }


    public boolean checkLogin(String u, String p){
        if(u.equals("user") || p.equals("host")){
            return true;
        }else{
            Toast.makeText(context, "Ingreso un usuario o contraseña incorrecto, intente nuevamente", Toast.LENGTH_LONG).show();
            return false;
        }
    }
}
