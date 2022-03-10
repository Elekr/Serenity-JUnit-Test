Feature: Getting a quote for a car using registration

Scenario Outline: As a Customer, I need to enter my car details to get a quote

  #Looking up the car
  Given The user has accessed the website
  And user has accepted the cookies
  When the user enters "<testPlate>" as the registation number
  And click submit
  Then the website will show the users car "<carType>"
  And the users car "<carDesc>"

  Given

  Examples:
    | testPlate | carType |                 carDesc                   |
    | GF21 WSN  | NIU NQI |   2021, 0CC, SCOOTER, AUTOMATIC, ELECTRIC |
