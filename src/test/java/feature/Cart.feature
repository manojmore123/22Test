Feature: Cart Functionality

  Scenario: add to cart
    Given user is product details page
    When Select product1 <Manoj> and product <More> and click on add card button
    Then Pruducts successfully added
    
    @Regression
    Scenario: checkout
     Given usermake payment
     When user enter data
     | Manoj | dasda | India |54|
    Then purchased successfully 
    
  @SmokeTest  
  Scenario Outline: add to cart
    Given user is product details page
    When Login into app with user <username> and pass <password>
    Then Pruducts successfully added
    
    Examples:
     |username| password|
     |user1| pass1|
     |user2| pass2|
     |user3| pass3|
     |user4| pass4|
    
    
    
