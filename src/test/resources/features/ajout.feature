@tag 
Feature: Ajout
 
 En tant que utilisateur, je veux ajouter le nom de robe afin de mettre à jour ma collection. 

  Scenario Outline: Ajouter une robe
    Given Une barbie nommé <barbie_nom>
    And une robe nommé <robe_nom>
    When le joueur ajout une robe à la collection de Barbie
    Then la collection de Barbie devrait contenit la robe <robe_nom>
 

    Examples: 
      | barbie_nom | robe_nom       |
      | barbie1    | robe de soirée |
      | barbie2    | robede mariage | 
