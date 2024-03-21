package poop3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

public class POOP3 {

    public static void main(String[] args) {
        System.out.println("*****Arreglos*****");
        int nums[];
        int[] nums2;
        int [] nums3;
        int []nums4;
        int[] nums5 = {1,2,3,4,5,6,7,8,9,10};
       
        System.out.println("");
        System.out.println("*****For*****");
        for (int i = 0; i < nums5.length; i++) {
            System.out.println("Elemento ["+i+"]="+nums5[i]);
        }
       
        System.out.println("");
        System.out.println("*****For-each*****");
        for(int temp:nums5){
            System.out.println("Elemento: " +temp);
        }
       
        System.out.println("");
        System.out.println("*****String*****");
        String s = new String("Hola Mundo"); //Forma correcta
        String s1 = "Hola Mundo"; //Forma recomendada
        System.out.println(s);
        System.out.println(s1);
       
        System.out.println("");
        System.out.println("*****Operador mas*****");
        String nombre = "Gerardo";
        String apellido = "Pliego";
        String nombreCompleto = nombre + " " +apellido;
        System.out.println(nombreCompleto);
       
        System.out.println("");
        System.out.println("*****Operador punto*****");
        System.out.println("Arreglo nums tiene " + nums5.length + " elementos");
        System.out.println("El nombre tiene: " + nombre.length());
        System.out.println("El nombre completo tiene: " + nombreCompleto.length());
       
        System.out.println("");
        System.out.println("*****Wrappers & Autoboxing*****");
        int a = 3;
        Integer b = new Integer(22); //Forma correcta
        Integer c = 33;
        int d = c;
        System.out.println(d);
        Integer e = a;
        String cadena = e.toString();
        System.out.println("Valor de a = " + cadena);
       
        //Forma recomendada
        String f = a + "";
        System.out.println("Elementos de f = " +f.length());
       
        System.out.println("");
        System.out.println("*****Colecciones*****");
        System.out.println("Array List");
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(11);
        miArrayList.add(33);
        miArrayList.add(44);
        System.out.println("Tamaño de ArrayList: " +miArrayList.size());
        miArrayList.add(1,22);
        System.out.println("Tamaño de AList: " +miArrayList.size());
       
        System.out.println("");
        System.out.println("*****");
        for (Integer integer : miArrayList) {
            System.out.println(integer);
        }
       
        miArrayList.add(1,15);
        System.out.println("*****");
        for (Integer integer : miArrayList) {
            System.out.println(integer);
        }
       
        System.out.println("*****Hashtable*****");
        Hashtable<String,Integer> miTabla = new Hashtable<String,Integer>();
        miTabla.put("Uno", 1);
        miTabla.put("Antonio",55667788);
        miTabla.put("Jorge", 55993322);
        System.out.println("Elementos en la tabla: " +miTabla.size());
        for (Integer value : miTabla.values()) {
            System.out.println(value);
        }
        for (String k : miTabla.keySet()) {
            System.out.println(k);
        }
       
        System.out.println("");
        System.out.println("*****Enumeracion*****");
        String llave;
        Integer valor;
        Enumeration<String> llavesEnumeradas = miTabla.keys();
        while(llavesEnumeradas.hasMoreElements()){
            llave = llavesEnumeradas.nextElement();
            valor = miTabla.get(llave);
            System.out.println("llave: " +llave+ " valor: " +valor);
        }
       
        System.out.println("");
        System.out.println("*****Math*****");
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3,2));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(44, 121));
       
        System.out.println("");
        System.out.println("*****Date*****");
        Date hoy = new Date();
        System.out.println(hoy);
       
        System.out.println("*****Calendar*****");
        Calendar calendarioHoy = Calendar.getInstance();
        System.out.println(calendarioHoy);
        
        System.out.println("");
        System.out.println("****Diccionario*****");
        Hashtable<String,Integer> diccionario = new Hashtable<String,Integer>();
        diccionario.put("Caballo", 320157471);
        diccionario.put("Jirafa",330088990);
        diccionario.put("Camello", 320155641);
        diccionario.put("Rinoceronte", 330155810);
        diccionario.put("Elefante", 320065551);
        System.out.println("Elementos en el diccionario: " +diccionario.size());
        for (Integer value : diccionario.values()) {
            System.out.println(value);
        }
        for (String tab : diccionario.keySet()) {
            System.out.println(tab);
        }
        
        System.out.println("");
        System.out.println("Agenda:");
        Hashtable<String,Calendar> agenda = new Hashtable<String,Calendar>();
        agenda.put("Gerardo", Calendar.getInstance());
        agenda.put("Andrea", Calendar.getInstance());
        agenda.put("Daniel", Calendar.getInstance());
        agenda.put("Ana", Calendar.getInstance());
        agenda.put("Luis", Calendar.getInstance());
        
        for (Calendar value : agenda.values()) {
            System.out.println(value);
        }
        for (String ag : agenda.keySet()) {
            System.out.println(ag);
        }
    }
}

