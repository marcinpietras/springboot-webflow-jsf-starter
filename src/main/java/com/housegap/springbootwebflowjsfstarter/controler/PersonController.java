package com.housegap.springbootwebflowjsfstarter.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.housegap.springbootwebflowjsfstarter.beans.PersonFormBean;
import com.housegap.springbootwebflowjsfstarter.model.Person;
import com.housegap.springbootwebflowjsfstarter.service.PersonService;

/**
 * Controller to create and store {@link Person person entities}.
 */
@Controller("personController")
public class PersonController {

    @Autowired
    private PersonService personService;

    public PersonFormBean createNewPersonFormBean () {
        return new PersonFormBean ();
    }

    public String savePerson ( PersonFormBean personFormBean ) {
        personService.save ( new Person ( personFormBean.getFirstName (), personFormBean.getLastName () ) );
        return "success";
    }

}
