package com.example.application.views.login;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@Route("login")
@PageTitle("LOGIN")
@AnonymousAllowed
public class LoginView extends VerticalLayout {
    private final LoginForm login = new LoginForm();

    public LoginView() {
        addClassName("LoginView");
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        login.setAction("login");

        add(new H1("Login Page"), login);
    }
}
