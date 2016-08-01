package oca_study_examples;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-16
 */
abstract class Mammal {
     protected static boolean hasFur() {
        return false;
        }
    }
    class Capybara extends Mammal {  //book example says implements instead of extends to show that doesn't compile
        protected static boolean hasFur() {
            return true;
        }
        public static void main(String[] args) {
            System.out.println(hasFur());
        }
    }

