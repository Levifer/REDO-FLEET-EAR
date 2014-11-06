package com.realdolmen.session;

import com.realdolmen.domain.employee.Employee;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by BPTAT47 on 5/11/2014.
 */
@Scope(value = "session")
@Component
public class UserSession {

    private Employee employee;
}
