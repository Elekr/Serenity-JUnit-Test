Feature: Getting a quote for a car using registration

Scenario: As a Customer, I need to enter my car details to get a quote

  Given The customer has accessed the website
  And accepted the cookies
  When I enter my "registration" plate number
  And click submit
  Then the website will show my car model and description