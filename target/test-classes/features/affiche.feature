@tag
Feature: Afficher les robes

   
  En tant que joueur, je veux pouvoir afficher la collection complète de robes de Barbie
  Afin de voir toutes les robes que cette Barbie possède.
  
    Scenario Outline:
    Given Barbie nommé <barbie_nom>
    #And  Une collection de robes de Barbie contient des robes <robes>
    
    When Le joueur demande à afficher la collection de robes de Barbie
    Then La liste affichée devrait contenir <robes>

    Examples: 
      | barbie_nom  | robes                              |
      | barbie1     | Robe de soirée                     |
      | barbie2     | Robe de mariage, Robe de printemps |
