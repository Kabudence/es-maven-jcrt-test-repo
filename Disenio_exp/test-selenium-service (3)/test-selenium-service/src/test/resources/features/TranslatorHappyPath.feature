@TranslatorHappyPath
Feature: Translator Service Simulation

  Scenario: translation is received correctly
    Given I have the word to translate "hello"
    When I submit it to the translator
    Then I receive the translation "bonjour"
