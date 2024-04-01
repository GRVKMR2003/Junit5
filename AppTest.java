package com.example;


import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.*;
/**
 * Unit test for simple App.
 */


 @TestInstance(TestInstance.Lifecycle.PER_CLASS)           /* To create only one instance for whole class */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
//     @Test
//     public void shouldAnswerWithTrue()
//     {
//         // try{
//         //     App a = new App();
//         //     int ar[] = {1,2,3};
//         //     a.sortedar(ar);

//         //     for(int i:ar){
//         //         System.out.println(i);
//         //     }
//         //     fail();

//         // }catch(NullPointerException e){
//         //     System.out.println("exception is generated");
//         // }

//         // int unsorted[]  ={2,8,6,1};
//         // assertThrows(NullPointerException.class,()->array.sortedar(unsorted));





//         // App a = new App();
//         // int ar[] = {2,1,3,5,2,2};
//     //    assertTimeout(Duration.ofMillis(10), ()->a.sortingarray(ar));






    
    
    
    
    
    
    
    
    
    
    
// }






// TO REMOVE WRITING OF OBJECT AGAIN AND AGAIN IN CODE

App a;

@BeforeEach
void init(){
     a = new App();
}

// @Test
// void testcomputesqarea(){
//   App a = new App();
//   assertEquals(25, a.computesqarea(5));
  
// }

// @Test
// void testcomputecirarea(){
//   App a = new App();
//   assertEquals(78.5, a.computecirarea(5));
  
// }


@AfterAll

static void af(){                   /*  Static is mandatory */
    System.out.println("test is clear");
}

@Test
void testcomputesqarea(){
  
  assertEquals(25, a.computesqarea(5));
  
}

@Test
void testcomputecirarea(){
  
  assertEquals(78.5, a.computecirarea(5));
  
}

@AfterEach
void destroy(){
    System.out.println("Object is destroyed");
}











}
