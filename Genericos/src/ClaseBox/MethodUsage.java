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
public class MethodUsage {
   Pair<Integer, String> p1 = new OrderedPair<>(1, "apple");
   Pair<Integer, String> p2 = new OrderedPair<>(2, "pear");
   boolean same = Util.<Integer, String>compare(p1, p2);
}
