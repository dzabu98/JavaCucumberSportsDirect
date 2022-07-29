@run

Feature: Nike logo click functionality

  Scenario: Click on a Nike logo on SALE page of SportsDirect website

    Given I navigate to SportsDirect homepage
     And I click on SALE tab in top menu
     And Page url contains the word sale
     And I can see Nike logo inside of POPULAR SALE BRANDS tab

    When I click on Nike logo of Sale page

    Then Page url should contain word sale and word nike
     And I should see the title NIKE SALE on top of the page


