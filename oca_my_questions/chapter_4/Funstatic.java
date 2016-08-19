package oca_my_questions.chapter_4;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-08-16
 */

public class Funstatic {
static { add("A"); }
static void add(String letter) { System.out.print(letter); }
Funstatic() { add("E"); }
static { add("B"); }
{ add("C"); }
static { new Funstatic(); }
{ add("D"); }
public static void main(String[] args) { } }
