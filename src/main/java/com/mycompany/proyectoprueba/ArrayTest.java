/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprueba;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author User
 */
public class ArrayTest {
    @Test
    public void testSize(){
        int arr[]={1,2,3};
        Array a= new Array(arr);
        assertEquals(3,a.size());
    }
    
    @Test
    public void testoString(){
        int arr[]={1,2,3};
        Array a= new Array(arr);
        assertEquals("1,2,3",a.toString());
    
    }
    
    @Test
    public void testSetElemental(){
    }
}