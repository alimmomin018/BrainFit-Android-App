package com.application.brainfit;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by Ayshan on 4/21/2017.
 */

public class RegisterRequest extends StringRequest{

    private static final String REGISTER_REQUEST_URL = "http://alimmomin018.000webhostapp.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String name, String age, String username, String password, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("username", username);
        params.put("password", password);
        params.put("age", age );
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}


