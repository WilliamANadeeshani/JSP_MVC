/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author William A Nadeeshani
 */
public class BeerExpert {
    public  String getPrice(String colour){
        if(colour.equals("light")){
            return "$ 150";
        }else if (colour.equals("Amber")) {
            return "$ 550";
        }else if (colour.equals("Amber")) {
            return "$ 250";
        }else {
            return "$ 100";
        }
        
    } 
}
