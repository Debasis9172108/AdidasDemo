package test.adidas.com.tasks;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import test.adidas.com.pages.CartPage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PlaceOrderFormFill implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(CartPage.placeOrderForm, isVisible()),
				Enter.theValue("Debasis Mukherjee").into(CartPage.formNameField),
				Enter.theValue("India").into(CartPage.formCountryField),
				Enter.theValue("Gurugram").into(CartPage.formCityField),
				Enter.theValue("9999999999").into(CartPage.formCreditCardField),
				Enter.theValue("January").into(CartPage.formMonthField),
				Enter.theValue("2021").into(CartPage.formYearField));
	}
}