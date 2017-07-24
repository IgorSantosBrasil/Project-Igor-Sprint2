package com.project.igor.stepsdefs;

/**
 * Created by dell on 24.7.2017 г..
 */
public class Calculator {
        private int result;
    /**
     * get the result and run the calculator
     */

        public void add(int arg1, int arg2){
            result = arg1 +arg2;
        }
    /**
     * return the results
     */

        public int getResult(){
            return result;

        }
}