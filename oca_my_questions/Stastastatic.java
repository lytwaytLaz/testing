package oca_my_questions;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-08-16
 */

public class Stastastatic {
static { add(2); }
static void add(int num) { System.out.print(num + " "); }
Stastastatic() { add(5); }
static { add(4); }
{ add(6); }
static { new Stastastatic(); }
{ add(8); }
public static void main(String[] args) { } }
