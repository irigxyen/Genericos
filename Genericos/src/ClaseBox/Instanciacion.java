/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseBox;

/**
 *
 * @author Karla
 */
public class Instanciacion {
Box<Integer> integerBox1 = new Box<>();  //usando el operador diamond
Box<Integer> integerBox2 = new Box<>();
OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
}
