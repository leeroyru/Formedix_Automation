Feature: MedicalHistory


  @VerifyMedicalHistoryDescription
  Scenario Outline: User Adds Description on Medical History Page
    Given User launch Chrome Browser and land on Formedix home page
    And User logs into Formedix Medical History Page "<Username>" and "<Password>"
    And Click on Login
    And User Lands on Homepage Navigates to Repository->Studies->toggles than clicks View
    And User Enters the tech test study view and Clicks on ‘Data acquisition’ asset group view.
    Then On Data acquisition Page User Click ‘Forms’under Asserts list
    And Select to view the ‘Medical History’ form.
    Then Select to edit the form by adding a "<Description>" and "<Locale>"property to the form.
    And Save the change and Confirm Updated Description "Welcome To Formedix Medical Center." is Displayed on the panel and main form
    Then User Signs out by expanding the menu when the mouse is over the user icon on the bottom left hand side of the menu bar.

    Examples:
      | Username         | Password   | Description                                                                                                | Locale |
      | testteamtechtest | Ryz3T3st!x | Welcome To Formedix Medical Center.| MH     |


