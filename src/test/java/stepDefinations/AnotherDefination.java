package stepDefinations;

import java.util.List;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AnotherDefination {
	
	@Given("user is product details page")
	public void user_is_product_details_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Helllllo");
	   
	}

	   @When("^Select product1 (.+) and product (.+) and click on add card button$")
	    public void select_product1_and_product_and_click_on_add_card_button(String manoj, String more) throws Throwable {
	       
		   System.out.println(manoj);
		   System.out.println(more);
		   
		 
	    }

	@Then("Pruducts successfully added")
	public void pruducts_successfully_added() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	
	
	
	@Given("usermake payment")
	public void usermake_payment() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Paymnet");
	}

	@When("user enter data")
	public void user_enter_data(io.cucumber.datatable.DataTable dataTable) {
		
//	List <String, String> l= dataTable.asList();
		
		List<List<String>>l= dataTable.asLists();
		
		System.out.println(l.get(0).get(0));
		System.out.println(l.get(0).get(1));
		System.out.println(l.get(0).get(2));
		System.out.println(l.get(0).get(3));
	//	System.out.println(l.get(1));
	//	System.out.println(l.get(2));
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
	}

	@Then("purchased successfully")
	public void purchased_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Hello");
	   
	}
	
	
	   @When("^Login into app with user (.+) and pass (.+)$")
	    public void login_into_app_with_user_and_pass(String use, String pass) throws Throwable {
	       
	    	   System.out.println(use);
	   System.out.println(pass);
	   }


}
