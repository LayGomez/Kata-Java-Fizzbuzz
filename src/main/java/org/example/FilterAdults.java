package org.example;

import java.util.ArrayList;
import java.util.List;

public class FilterAdults {
    public List<User> checkAdults(User[] users){
        List<User> adults = new ArrayList<>();
        for (User usuario : users) {
            if (usuario.getAge() >= 18) {
                adults.add(usuario);
            }
        }
        return adults;
    }
}
