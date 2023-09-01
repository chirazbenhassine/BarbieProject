Feature: Afficher collection

  Scenario: User doit afficher collection
    Given User nommee barbie2
    When user veut afficher la collection
    Then collection contient la robe ajoutee