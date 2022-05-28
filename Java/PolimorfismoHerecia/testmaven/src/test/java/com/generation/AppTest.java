package com.generation;

import org.junit.jupiter.api. *;


public class AppTest{

    @Test
    public void saludoTest(){

        App saludo = new App(); 
                                //Lo que espera    y   de donde
        Assertions.assertEquals("Hola Mundo!", saludo.saludo() );
    }

    @Test
    public void saludoStaticTest(){

        Assertions.assertEquals("Hola Mundo!", App.saludoStatic());
        
    }
}

    
