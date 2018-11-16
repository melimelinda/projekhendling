/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author MELI MELINDA
 */
public class StringIndex {
    public static void main(String[] args){

        try{
            String s = "Nama Saya Madi Alvin.".substring(-10, 20);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Error "+e);
        }

    }
}
