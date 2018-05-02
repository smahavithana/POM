package com.cucumber.Assignment.base_files.glue;

import com.cucumber.Assignment.base_files.framework.ParentScenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Base_Step_Definition extends ParentScenario {

    @Before
    public void beforeScenario(){
        before_Setup();
    }


    @After
    public void after_Scenario(){
        after_Setup();
    }

}
