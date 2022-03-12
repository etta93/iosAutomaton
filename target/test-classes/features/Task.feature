Feature: Task Functionality

  @app
  Scenario: create new task
    Given User in to do homepage
    When User create new task "New Task"
    And User tap submit button
    Then User see new task added