package com.project.igor.stepsdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by dell on 24.7.2017 г..
 */
public class CalculatorSteps {

        Calculator calculator = new Calculator();

    /**
     * run the pre-condition
     */
        @Given("^I have a calculator$")
        public void i_have_a_calculator() throws Throwable {
            assertNotNull(calculator);                      // to be sure that no get no values
        }

    /**
     * run the method calculator
     */
        @When("^I add (\\d+) and (\\d+)$")
        public void i_add_and(int arg1, int arg2) throws Throwable {
            calculator.add(arg1, arg2);
            System.out.println(arg1 + "+" + arg2 + "== ");
            System.out.println(" ");
        }

    /**
     * get the result for the calculator
     */
        @Then("^the result should be (\\d+)$")
        public void the_result_should_be(int result) throws Throwable {
            assertEquals(result, calculator.getResult());
            System.out.println(result);
        }

    /**
     * run the method calculator for multiply
     */
    @When("^I add (\\d+) and (\\d+) multiply$")
    public void iAddAndMultiply(int arg3, int arg4) throws Throwable {
        calculator.mult(arg3, arg4);
        System.out.println(arg3 + "*" + arg4 + "== ");
    }

    /**
     * get the result for the multiply
     */
    @Then("^the result from multiply should be (\\d+)$")
    public void theResultFromMultiplyShouldBe(int result2) throws Throwable {
        assertEquals(result2, calculator.getResultMult());
        System.out.println(result2);
    }





    }

