Feature: Ajouter robe

  Scenario: User doit ajouter robe
    Given User nommee barbie1
    When user ajout robeRouge dans collection
    Then collection contient la robeRouge