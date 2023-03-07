/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nomina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author t3rel
 */
public class Excepciones {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Excepciones() {
        super();
    }
    
    public static byte exByte(){
        byte tmp = 0;
        try{
            tmp = Byte.parseByte(br.readLine());
        }catch(NumberFormatException ex){
            System.out.println("Error: El dato no se puede convertir a byte");
        }catch(IOException ex){
            System.out.println("Error: Ocurrio un error con la entrada de datos");
        }catch(Exception ex){
            System.out.println("Error: Error no controlado");
        }
        return tmp;
    }
    
    public static short exShort(){
        short tmp = 0;
        try{
            tmp = Short.parseShort(br.readLine());
        }catch(NumberFormatException ex){
            System.out.println("Error: El dato no se puede convertir a short");
        }catch(IOException ex){
            System.out.println("Error: Ocurrio un error con la entrada de datos");
        }catch(Exception ex){
            System.out.println("Error: Error no controlado");
        }
        return tmp;
    }
    
    public static char exChar(){
        char tmp = 0;
        try{
            tmp = br.readLine().charAt(0);
        }catch(IOException ex){
            System.out.println("Error: Ocurrio un error con la entrada de datos");
        }catch(Exception ex){
            System.out.println("Error: Error no controlado");
        }
        return tmp;
    }
    
    public static int exInt() throws IOException{
        int tmp = 0;
        try{
            tmp = Integer.parseInt(br.readLine());
        }catch(NumberFormatException ex){
            System.out.println("Error: El dato no es valido");
            System.out.println("Ingresa dato numerico: ");
            tmp = Integer.parseInt(br.readLine());
        }catch(IOException ex){
            System.out.println("Error: Ocurrio un error con la entrada de datos");
        }catch(Exception ex){
            System.out.println("Error: Error no controlado");
        }
        return tmp;
    }
    
    public static long exLong(){
        long tmp = 0;
        try{
            tmp = Long.parseLong(br.readLine());
        }catch(NumberFormatException ex){
            System.out.println("Error: El dato no se puede convertir a short");
        }catch(IOException ex){
            System.out.println("Error: Ocurrio un error con la entrada de datos");
        }catch(Exception ex){
            System.out.println("Error: Error no controlado");
        }
        return tmp;
    }
    
    public static float exFloat(){
        float tmp = 0;
        try{
            tmp = Float.parseFloat(br.readLine());
        }catch(NumberFormatException ex){
            System.out.println("Error: El dato no se puede convertir a float");
        }catch(IOException ex){
            System.out.println("Error: Ocurrio un error con la entrada de datos");
        }catch(Exception ex){
            System.out.println("Error: Error no controlado");
        }
        return tmp;
    }
    
    public static double exDouble(){
        double tmp = 0;
        try{
            tmp = Double.parseDouble(br.readLine());
        }catch(NumberFormatException ex){
            System.out.println("Error: El dato no se puede convertir a short");
        }catch(IOException ex){
            System.out.println("Error: Ocurrio un error con la entrada de datos");
        }catch(Exception ex){
            System.out.println("Error: Error no controlado");
        }
        return tmp;
    }
    
    public static String exString(){
        String tmp = null;
        try{
            tmp = br.readLine();
        }catch(IOException ex){
            System.out.println("Error: Ocurrio un error con la entrada de datos");
        }catch(Exception ex){
            System.out.println("Error: Error no controlado");
        }
        return tmp;
    }
    
    public static boolean exBoolean(){
        boolean tmp = false;
        try{
            tmp = new Boolean(br.readLine()).booleanValue();
        }catch(IOException ex){
            System.out.println("Error: Ocurrio un error con la entrada de datos");
        }catch(Exception ex){
            System.out.println("Error: Error no controlado");
        }
        return tmp;
    }
   
   
}
