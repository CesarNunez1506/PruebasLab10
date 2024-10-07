package com.mycompany.proyectoprueba;

import org.junit.Test;
import static org.junit.Assert.*;

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
    public void testSetElementAt() {
    int arr[] = {1, 2, 3};
    Array a = new Array(arr);
    a.setElementAt(100, 2);

    // obtener arreglo
    int obt[] = a.getArray();

    // corroborar que se actualizó la información
    assertEquals(obt[2], 100);
    
    }
}