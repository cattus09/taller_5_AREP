package edu.escuelaing.arem.ASE.app;

import java.lang.reflect.Method;

public class Serial {
    
    
    public static String senCos(String res){
        String name = res.split("\\(")[0];
        Double data = Double.parseDouble(res.split("\\(")[1].split("\\)")[0]);
        Object resp = null;
        Class mat = Math.class;
        Method a;
        String response = "";
        try {
            a = mat.getMethod(name, Double.TYPE);
            resp = a.invoke(null, data);
            System.out.println(a.getName());
            response = Double.toString((Double)resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return response;
    }

    public static boolean palindromo(String palabra){
        int i = 0, j = palabra.length() - 1;
        while (i < j) {
            if (palabra.charAt(i) != palabra.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static Double vector(String data){
        String[] vector = data.split(",");
        Double res = Math.sqrt(Math.pow(Integer.parseInt(vector[0]),2) + (Math.pow(Integer.parseInt(vector[1]),2)));
        return res;
    }
}
